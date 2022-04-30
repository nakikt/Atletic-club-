package bdbt_proj;

public class Filie {
	
	private int nr_filii;
	private String nazwa;
	private String data_zalozenia;
	private int nr_klubu;
	private int nr_adresu;
	private int nr_danych;
	
	
	public Filie() {

	}


	public Filie(int nr_filii, String nazwa, String data_zalozenia, int nr_klubu, int nr_adresu, int nr_danych) {
		super();
		this.nr_filii = nr_filii;
		this.nazwa = nazwa;
		this.data_zalozenia = data_zalozenia;
		this.nr_klubu = nr_klubu;
		this.nr_adresu = nr_adresu;
		this.nr_danych = nr_danych;
	}


	public int getNr_filii() {
		return nr_filii;
	}


	public void setNr_filii(int nr_filii) {
		this.nr_filii = nr_filii;
	}


	public String getNazwa() {
		return nazwa;
	}


	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}


	public String getData_zalozenia() {
		return data_zalozenia.substring(0,10);
	}


	public void setData_zalozenia(String data_zalozenia) {
		this.data_zalozenia = data_zalozenia;
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
	
	public int getNr_danych() {
		return nr_danych;
	}


	public void setNr_danych(int nr_danych) {
		this.nr_danych = nr_danych;
	}


	@Override
	public String toString() {
		return "Filie [nr_filii=" + nr_filii + ", nazwa=" + nazwa + ", data_zalozenia=" + data_zalozenia + ", nr_klubu="
				+ nr_klubu + ", nr_adresu=" + nr_adresu + ", nr_danych=" + nr_danych + "]";
	}
	
		
}
