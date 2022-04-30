package bdbt_proj;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Obozy_pracownicyDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/* Constructor for jdbcTemplate */
	public Obozy_pracownicyDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* Lista zawieraj¹ca informacje z bazy danych*/
	public List<Obozy_pracownicy> list(){
		String sql = "SELECT * FROM OBOZY_PRACOWNICY";
		List<Obozy_pracownicy> listObozy_pracownicy = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Obozy_pracownicy.class));
		return listObozy_pracownicy;
	}
	
	/*Insert - wstawianie nowego wiersza do bazy */
	public void save(Obozy_pracownicy obozy_pracownicy) {	
	}
	/*Read - odczytywanie danych z bazy */
	public Obozy get(int nr_pracownika) {
		return null;
	}
	
	/* Update - aktualizacja danych */
	public void update(Obozy_pracownicy obozy_pracownicy) {
	}
	
	/* Delete/Remove - usuniêcie wybranych rekordów z danymi nr_obozu */
	public void delete(int nr_pracownika) {
	}
}
