package bdbt_proj;

public class Zawodnicy {
	private int nr_zawodnika;
	private String imie;
	private String nazwisko;
	private String data_urodzenia;
	private String plec;
	private String nr_telefonu;
	private String aktywny_flaga;
	private String data_waznosci_badania;
	private String rekord;
	private int wysokosc_skladki;
	private int nr_filii;
	private int nr_adresu;
	private int nr_danych;
	
	public Zawodnicy() {	
	}
	
	public Zawodnicy(int nr_zawodnika, String imie, String nazwisko, String data_urodzenia, String plec,
			String nr_telefonu, String aktywny_flaga, String data_waznosci_badania, String rekord, int wysokosc_skladki,
			int nr_filii, int nr_adresu, int nr_danych) {
		super();
		this.nr_zawodnika = nr_zawodnika;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.data_urodzenia = data_urodzenia;
		this.plec = plec;
		this.nr_telefonu = nr_telefonu;
		this.aktywny_flaga = aktywny_flaga;
		this.data_waznosci_badania = data_waznosci_badania;
		this.rekord = rekord;
		this.wysokosc_skladki = wysokosc_skladki;
		this.nr_filii = nr_filii;
		this.nr_adresu = nr_adresu;
		this.nr_danych = nr_danych;
	}

	public int getNr_zawodnika() {
		return nr_zawodnika;
	}

	public void setNr_zawodnika(int nr_zawodnika) {
		this.nr_zawodnika = nr_zawodnika;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getData_urodzenia() {
		return data_urodzenia.substring(0,10);
	}

	public void setData_urodzenia(String data_urodzenia) {
		this.data_urodzenia = data_urodzenia;
	}

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}

	public String getNr_telefonu() {
		return nr_telefonu;
	}

	public void setNr_telefonu(String nr_telefonu) {
		this.nr_telefonu = nr_telefonu;
	}

	public String getAktywny_flaga() {
		return aktywny_flaga;
	}

	public void setAktywny_flaga(String aktywny_flaga) {
		this.aktywny_flaga = aktywny_flaga;
	}

	public String getData_waznosci_badania() {
		return data_waznosci_badania.substring(0,10);
	}

	public void setData_waznosci_badania(String data_waznosci_badania) {
		this.data_waznosci_badania = data_waznosci_badania;
	}

	public String getRekord() {
		return rekord;
	}

	public void setRekord(String rekord) {
		this.rekord = rekord;
	}

	public int getWysokosc_skladki() {
		return wysokosc_skladki;
	}

	public void setWysokosc_skladki(int wysokosc_skladki) {
		this.wysokosc_skladki = wysokosc_skladki;
	}

	public int getNr_filii() {
		return nr_filii;
	}

	public void setNr_filii(int nr_filii) {
		this.nr_filii = nr_filii;
	}

	public int getNr_adresu() {
		return nr_adresu;
	}

	public void setNr_adresu(int nr_adresu) {
		this.nr_adresu = nr_adresu;
	}
	
	public int getNr_danych() {
		return nr_danych;
	}

	public void setNr_danych(int nr_danych) {
		this.nr_danych = nr_danych;
	}

	@Override
	public String toString() {
		return "Zawodnicy [nr_zawodnika=" + nr_zawodnika + ", imie=" + imie + ", nazwisko=" + nazwisko
				+ ", data_urodzenia=" + data_urodzenia + ", plec=" + plec + ", nr_telefonu=" + nr_telefonu
				+ ", aktywny_flaga=" + aktywny_flaga + ", data_waznosci_badania=" + data_waznosci_badania + ", rekord="
				+ rekord + ", wysokosc_skladki=" + wysokosc_skladki + ", nr_filii=" + nr_filii + ", nr_adresu="
				+ nr_adresu + ", nr_danych=" + nr_danych + "]";
	}
}
