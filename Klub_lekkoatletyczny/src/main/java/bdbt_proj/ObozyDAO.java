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
public class ObozyDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/* Constructor for jdbcTemplate */
	public ObozyDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* Lista zawierajca informacje z bazy danych*/
	public List<Obozy> list(){
		String sql = "SELECT * FROM OBOZY";
		List<Obozy> listObozy = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Obozy.class));
		return listObozy;
	}
	
	/*Insert - wstawianie nowego wiersza do bazy */
	public void save(Obozy obozy) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("obozy").usingColumns("nr_obozu","cena","data_od","data_do","nr_miejsca_pobytu");
		
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(obozy);
		insertActor.execute(param);
	}
	/*Read - odczytywanie danych z bazy */
	public Obozy get(int nr_obozu) {
		Object[] args = { nr_obozu };
		String sql = "SELECT * FROM OBOZY WHERE nr_obozu = " + args[0];
		Obozy obozy = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Obozy.class));
		
		return obozy;
	}
	
	/* Update - aktualizacja danych */
	public void update(Obozy obozy) {
		String sql = "UPDATE OBOZY SET cena=:cena, data_od=:data_od, data_do=:data_do, nr_miejsca_pobytu=:nr_miejsca_pobytu WHERE nr_obozu=:nr_obozu";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(obozy);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		
		template.update(sql, param);
	}
	
	/* Delete/Remove - usunicie wybranych rekordw z danymi nr_obozu */
	public void delete(int nr_obozu) {
		String sql = "DELETE FROM OBOZY WHERE nr_obozu = ?";
		jdbcTemplate.update(sql, nr_obozu);
	}
}
