package bdbt_proj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Kluby_lekkoatletyczneDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public Kluby_lekkoatletyczneDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}


	public List<Kluby_lekkoatletyczne> list(){
		String sql = "SELECT * FROM KLUBY_LEKKOATLETYCZNE";
		
		List<Kluby_lekkoatletyczne> listKluby_lekkoatletyczne = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Kluby_lekkoatletyczne.class));
		
		return listKluby_lekkoatletyczne;
	}
	
	public void save(Kluby_lekkoatletyczne kluby_lekkoatletyczne) {
		
	}
	
	public Kluby_lekkoatletyczne get(int nr_klubu) {
		return null;
	}
	
	public void update(Kluby_lekkoatletyczne kluby_lekkoatletyczne) {
		
	}
	
	public void delete(int nr_klubu) {
		
	}

}