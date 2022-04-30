package bdbt_proj;

public class Pracownicy {

	private int nr_pracownika;
	private String imie;
	private String nazwisko;
	private String data_urodzenia;
	private String plec;
	private String nr_telefonu;
	private String rodzaj_umowy;
	private int nr_filii;
	private int nr_klubu;
	private int nr_adresu;
	private int nr_stanowiska;
	private int nr_danych;
	
	
	public Pracownicy() {
		
	}


	public Pracownicy(int nr_pracownika, String imie, String nazwisko, String data_urodzenia, String plec,
			String nr_telefonu, String rodzaj_umowy, int nr_filii, int nr_klubu, int nr_adresu, int nr_stanowiska,
			int nr_danych) {
		super();
		this.nr_pracownika = nr_pracownika;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.data_urodzenia = data_urodzenia;
		this.plec = plec;
		this.nr_telefonu = nr_telefonu;
		this.rodzaj_umowy = rodzaj_umowy;
		this.nr_filii = nr_filii;
		this.nr_klubu = nr_klubu;
		this.nr_adresu = nr_adresu;
		this.nr_stanowiska = nr_stanowiska;
		this.nr_danych = nr_danych;
	}



	public int getNr_filii() {
		return nr_filii;
	}


	public void setNr_filii(int nr_filii) {
		this.nr_filii = nr_filii;
	}


	public int getNr_klubu() {
		return nr_klubu;
	}


	public void setNr_klubu(int nr_klubu) {
		this.nr_klubu = nr_klubu;
	}


	public int getNr_adresu() {
		return nr_adresu;
	}


	public void setNr_adresu(int nr_adresu) {
		this.nr_adresu = nr_adresu;
	}


	public int getNr_stanowiska() {
		return nr_stanowiska;
	}


	public void setNr_stanowiska(int nr_stanowiska) {
		this.nr_stanowiska = nr_stanowiska;
	}


	public int getNr_danych() {
		return nr_danych;
	}


	public void setNr_danych(int nr_danych) {
		this.nr_danych = nr_danych;
	}


	public int getNr_pracownika() {
		return nr_pracownika;
	}


	public void setNr_pracownika(int nr_pracownika) {
		this.nr_pracownika = nr_pracownika;
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


	public String getRodzaj_umowy() {
		return rodzaj_umowy;
	}


	public void setRodzaj_umowy(String rodzaj_umowy) {
		this.rodzaj_umowy = rodzaj_umowy;
	}


	@Override
	public String toString() {
		return "Pracownicy [nr_pracownika=" + nr_pracownika + ", imie=" + imie + ", nazwisko=" + nazwisko
				+ ", data_urodzenia=" + data_urodzenia + ", plec=" + plec + ", nr_telefonu=" + nr_telefonu
				+ ", rodzaj_umowy=" + rodzaj_umowy + ", nr_filii=" + nr_filii + ", nr_klubu=" + nr_klubu
				+ ", nr_adresu=" + nr_adresu + ", nr_stanowiska=" + nr_stanowiska + ", nr_danych=" + nr_danych + "]";
	}
	
	
	
	
}
