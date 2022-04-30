package bdbt_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class PracownicyDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public PracownicyDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}


	public List<Pracownicy> list(){
		String sql = "SELECT * FROM PRACOWNICY";
		
		List<Pracownicy> listPracownicy = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Pracownicy.class));
		
		return listPracownicy;
	}
	
	public void save(Pracownicy pracownicy) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("pracownicy").usingColumns("nr_pracownika","imie","nazwisko","data_urodzenia","plec","nr_telefonu","rodzaj_umowy","nr_filii","nr_klubu","nr_adresu","nr_stanowiska","nr_danych");
		
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownicy);
		insertActor.execute(param);
		
	}
	
	public Pracownicy get(int nr_pracownika) {
		Object[] args = { nr_pracownika };
		String sql = "SELECT * FROM PRACOWNICY WHERE nr_pracownika = " + args[0];
		Pracownicy pracownicy = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Pracownicy.class));
		
		return pracownicy;
	}
	
	public void update(Pracownicy pracownicy) {
		String sql = "UPDATE PRACOWNICY SET imie=:imie, nazwiska=:nazwiska, data_urodzenia=:data_urodzenia, plec=:plec, nr_telefonu=:nr_telefonu, rodzaj_umowy=:rodzaj_umowy, nr_filii=:nr_filii, nr_klubu=:nr_klubu, nr_adresu=:nr_adresu, nr_stanowiska=:nr_stanowiska, nr_danych=:nr_danych WHERE nr_pracownika=:nr_pracownika";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownicy);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		
		template.update(sql, param);
		
	}
	
	public void delete(int nr_pracownika) {
		String sql = "DELETE FROM PRACOWNICY WHERE nr_pracownika = ?";
		jdbcTemplate.update(sql, nr_pracownika);
	}
}
