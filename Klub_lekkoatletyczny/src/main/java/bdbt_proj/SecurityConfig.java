package bdbt_proj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user = User.withDefaultPasswordEncoder().username("zawodnik@edu.pl").password("zawodnik")
				.roles("USER").build();

		UserDetails admin = User.withDefaultPasswordEncoder().username("admin@edu.pl").password("admin").roles("ADMIN")
				.build();
		return new InMemoryUserDetailsManager(user, admin);

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
				.antMatchers("/index.html", "/login.html", "/430", "/" ).permitAll()
				.antMatchers("/tabele.html", "/filie.html", "/obozy.html","/default.html" ).hasAnyRole("ADMIN", "USER")
				.antMatchers("/zawodnicy.html", "/pracownicy.html","/filie-add.html", "/obozy-add.html", "/pracownicy-add.html", "/zawodnicy-add.html","/filie-edit.html", "/obozy-edit.html","/pracownicy-edit.html","/zawodnicy-edit.html", "/filie/save","/obozy/save","/pracownicy/save", "/zawodnicy/save", "/filie/delete/{nr_filii}", "/zawodnicy/delete/{nr_zawodnika}", "/obozy/delete/{nr_obozu}", "/pracownicy/delete/{nr_pracownika}", "/filie/edit/{nr_filii}", "/obozy/edit/{nr_obozu}", "/pracownicy/edit/{nr_pracownika}", "/zawodnicy/edit/{nr_zawodnika}","/filie/edit/index.html", "/filie/edit/login.html", "/filie/edit/tabele.html", "/pracownicy/edit/index.html", "/pracownicy/edit/login.html", "/pracownicy/edit/tabele.html", "/zawodnicy/edit/index.html","/zawodnicy/edit/login.html","/zawodnicy/edit/tabele.html","/obozy/edit/index.html","/obozy/edit/login.html", "/obozy/edit/tabele.html", "filie/update","obozy/update","pracownicy/update", "zawodnicy/update").hasRole("ADMIN")
				
				.and()
				.formLogin()
				.loginPage("/login.html")
				.loginProcessingUrl("/login")
				.defaultSuccessUrl("/tabele.html", true)
				.failureUrl("/faillogin.html")
				.permitAll()
				.and()
				.logout()
				.permitAll()
				.logoutSuccessUrl("/index.html")
				.and()
				.csrf().disable()
				.exceptionHandling().accessDeniedPage("/403");

	}
}
