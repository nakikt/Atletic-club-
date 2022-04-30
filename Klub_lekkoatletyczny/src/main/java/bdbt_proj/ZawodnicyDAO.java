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
public class ZawodnicyDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/* Constructor for jdbcTemplate */
	public ZawodnicyDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/* Lista zawierajca informacje z bazy danych*/
	public List<Zawodnicy> list(){
		String sql = "SELECT * FROM ZAWODNICY";
		List<Zawodnicy> listZawodnicy = jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Zawodnicy.class));
		return listZawodnicy;
	}
	
	/*Insert - wstawianie nowego wiersza do bazy */
	public void save(Zawodnicy zawodnicy) {	
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("zawodnicy").usingColumns("nr_zawodnika","imie","nazwisko","data_urodzenia","plec","nr_telefonu","aktywny_flaga","data_waznosci_badania","rekord","wysokosc_skladki","nr_filii","nr_adresu","nr_danych");
		
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(zawodnicy);
		insertActor.execute(param);
	}
	/*Read - odczytywanie danych z bazy */
	public Zawodnicy get(int nr_zawodnika) {
		Object[] args = { nr_zawodnika };
		String sql = "SELECT * FROM ZAWODNICY WHERE nr_zawodnika = " + args[0];
		Zawodnicy zawodnicy = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Zawodnicy.class));
		
		return zawodnicy;
	}
	
	/* Update - aktualizacja danych */
	public void update(Zawodnicy zawodnicy) {
		String sql = "UPDATE ZAWODNICY SET imie=:imie, nazwisko=:nazwisko, data_urodzenia=:data_urodzenia, plec=:plec, nr_telefonu=:nr_telefonu, data_waznosci_badania=:data_waznosci_badania, rekord=:rekord, wysokosc_skladki=:wysokosc_skladki, nr_filii=:nr_filii, nr_adresu=:nr_adresu, nr_danych=:nr_danych WHERE nr_zawodnika=:nr_zawodnika";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(zawodnicy);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		
		template.update(sql, param);
	}
	
	/* Delete/Remove - usunicie wybranych rekordw z danymi nr_zawodnika */
	public void delete(int nr_zawodnika) {
		String sql = "DELETE FROM ZAWODNICY WHERE nr_zawodnika = ?";
		jdbcTemplate.update(sql, nr_zawodnika);
	}
}
