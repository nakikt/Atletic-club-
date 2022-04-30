package bdbt_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Dane_kontaktoweDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public Dane_kontaktoweDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}


	public List<Dane_kontaktowe> list(){
		String sql = "SELECT * FROM DANE_KONTAKTOWE";
		
		List<Dane_kontaktowe> listDane_kontaktowe = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Dane_kontaktowe.class));
		
		return listDane_kontaktowe;
	}
	
	public void save(Dane_kontaktowe dane_kontaktowe) {
		
	}
	
	public Dane_kontaktowe get(int nr_danych) {
		return null;
	}
	
	public void update(Dane_kontaktowe dane_kontaktowe) {
		
	}
	
	public void delete(int nr_danych) {
		
	}
}
