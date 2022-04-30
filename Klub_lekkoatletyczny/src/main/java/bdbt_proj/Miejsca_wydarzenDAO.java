package bdbt_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Miejsca_wydarzenDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public Miejsca_wydarzenDAO() {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Miejsca_wydarzen> list(){
		String sql = "SELECT * FROM MIEJSCA_WYDARZEN";
		
		List<Miejsca_wydarzen> listMiejsca_wydarzen= jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Miejsca_wydarzen.class));
		
		return listMiejsca_wydarzen;
	}
	
	public void save(Miejsca_wydarzen miejsca_wydarzen) {
		
	}
	
	public Obozy_zawodnicy get(int nr_miejsca_wydarzenia) {
		return null;
	}
	
	public void update(Miejsca_wydarzen miejsca_wydarzen) {
		
	}
	
	public void delete(int nr_miejsca_wydarzenia) {
		
	}
}
