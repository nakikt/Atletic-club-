package bdbt_proj;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class Kluby_lekkoatletyczneDAOTest {

	private Kluby_lekkoatletyczneDAO dao;
	
	@BeforeEach
	void setUp() throws Exception {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:oracle:thin:@ORA3.ELKA.PW.EDU.PL:1521:ORA3INF");
		datasource.setUsername("mkowali2");
		datasource.setPassword("mkowali2");
		datasource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		dao = new Kluby_lekkoatletyczneDAO(new JdbcTemplate(datasource));
	}

	@Test
	public void testList() {
		
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = dao.list();
		assertTrue(listKluby_lekkoatletyczne.isEmpty());
		
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

}
