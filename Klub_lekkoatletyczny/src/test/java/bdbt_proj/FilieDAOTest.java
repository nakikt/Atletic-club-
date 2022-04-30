package bdbt_proj;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class FilieDAOTest {

	private FilieDAO dao;
	
	@BeforeEach
	void setUp() throws Exception {
		
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl("jdbc:oracle:thin:@ORA3.ELKA.PW.EDU.PL:1521:ORA3INF");
		datasource.setUsername("mkowali2");
		datasource.setPassword("mkowali2");
		datasource.setDriverClassName("oracle.jdbc.OracleDriver");
		
		dao = new FilieDAO(new JdbcTemplate(datasource));
	}

	@Test
	public void testList() {
		
		List<Filie> listFilie = dao.list();
		assertTrue(listFilie.isEmpty());
		
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
