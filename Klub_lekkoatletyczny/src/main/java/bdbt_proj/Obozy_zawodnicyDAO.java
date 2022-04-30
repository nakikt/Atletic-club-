package bdbt_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Obozy_zawodnicyDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public Obozy_zawodnicyDAO() {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Obozy_zawodnicy> list(){
		String sql = "SELECT * FROM UCZESTNICTWA_ZAWODNIKOW";
		
		List<Obozy_zawodnicy> listObozy_zawodnicy= jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Obozy_zawodnicy.class));
		
		return listObozy_zawodnicy;
	}
	
	public void save(Obozy_zawodnicy obozy_zawodnicy) {
		
	}
	
	public Obozy_zawodnicy get(int nr_zawodnika) {
		return null;
	}
	
	public void update(Obozy_zawodnicy obozy_zawodnicy) {
		
	}
	
	public void delete(int nr_zawodnika) {
		
	}
}
