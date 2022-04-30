package bdbt_proj;

public class Miejsca_wydarzen {
	private int nr_miejsca_wydarzenia;
	private String miejscowosc;
	private String nazwa_osrodka;
	private int liczba_dostepnych_miejsc;
	
	public Miejsca_wydarzen() {
	
	}

	public Miejsca_wydarzen(int nr_miejsca_wydarzenia, String miejscowosc, String nazwa_osrodka,
			int liczba_dostepnych_miejsc) {
		super();
		this.nr_miejsca_wydarzenia = nr_miejsca_wydarzenia;
		this.miejscowosc = miejscowosc;
		this.nazwa_osrodka = nazwa_osrodka;
		this.liczba_dostepnych_miejsc = liczba_dostepnych_miejsc;
	}

	public int getNr_miejsca_wydarzenia() {
		return nr_miejsca_wydarzenia;
	}

	public void setNr_miejsca_wydarzenia(int nr_miejsca_wydarzenia) {
		this.nr_miejsca_wydarzenia = nr_miejsca_wydarzenia;
	}

	public String getMiejscowosc() {
		return miejscowosc;
	}

	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public String getNazwa_osrodka() {
		return nazwa_osrodka;
	}

	public void setNazwa_osrodka(String nazwa_osrodka) {
		this.nazwa_osrodka = nazwa_osrodka;
	}

	public int getLiczba_dostepnych_miejsc() {
		return liczba_dostepnych_miejsc;
	}

	public void setLiczba_dostepnych_miejsc(int liczba_dostepnych_miejsc) {
		this.liczba_dostepnych_miejsc = liczba_dostepnych_miejsc;
	}

	@Override
	public String toString() {
		return "Miejsca_wydarzen [nr_miejsca_wydarzenia=" + nr_miejsca_wydarzenia + ", miejscowosc=" + miejscowosc
				+ ", nazwa_osrodka=" + nazwa_osrodka + ", liczba_dostepnych_miejsc=" + liczba_dostepnych_miejsc + "]";
	}
	

}
