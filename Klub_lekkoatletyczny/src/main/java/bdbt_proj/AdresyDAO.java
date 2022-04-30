package bdbt_proj;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdresyDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/* Constructor for jdbcTemplate */
	public AdresyDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* Lista zawieraj¹ca informacje z bazy danych*/
	public List<Adresy> list(){
		String sql = "SELECT * FROM ADRESY";
		List<Adresy> listAdresy = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Adresy.class));
		return listAdresy;
	}
	
	/*Insert - wstawianie nowego wiersza do bazy */
	public void save(Adresy adresy) {	
	}
	/*Read - odczytywanie danych z bazy */
	public Adresy get(int nr_adresu) {
		return null;
	}
	
	/* Update - aktualizacja danych */
	public void update(Adresy adresy) {
	}
	
	/* Delete/Remove - usuniêcie wybranych rekordów z danymi nr_adresu */
	public void delete(int nr_adresu) {
	}
}
