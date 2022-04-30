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
public class FilieDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public FilieDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Filie> list() {
		String sql = "SELECT * FROM FILIE";
		
		List<Filie> listFilie = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Filie.class));
		
		return listFilie;
	}
	
	public void save(Filie filie) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("filie").usingColumns("nr_filii","nazwa","data_zalozenia","nr_klubu","nr_adresu","nr_danych");
		
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(filie);
		insertActor.execute(param);
		
	}
	
	public Filie get(int nr_filii) {
		Object[] args = {nr_filii};
		String sql = "SELECT * FROM FILIE WHERE nr_filii = " + args[0];
		Filie filie = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Filie.class));
		
		return filie;
	}
	
	public void update(Filie filie) {
		
		String sql = "UPDATE FILIE SET nazwa=:nazwa, data_zalozenia=:data_zalozenia, nr_klubu=:nr_klubu, nr_adresu=:nr_adresu, nr_danych=:nr_danych WHERE nr_filii=:nr_filii";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(filie);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		
		template.update(sql, param);
	}
	
	public void delete(int nr_filii) {
		String sql = "DELETE FROM FILIE WHERE nr_filii = ?";
		jdbcTemplate.update(sql, nr_filii);
	}
}
