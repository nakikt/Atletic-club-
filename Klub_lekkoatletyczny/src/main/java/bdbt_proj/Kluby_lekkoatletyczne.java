package bdbt_proj;

public class Kluby_lekkoatletyczne {
	
	private int nr_klubu;
	private String nazwa;
	private String data_zalozenia;
	private int nr_adresu;
	
	public Kluby_lekkoatletyczne() {

	}
	
	public Kluby_lekkoatletyczne(int nr_klubu, String nazwa, String data_zalozenia, int nr_adresu) {
		super();
		this.nr_klubu = nr_klubu;
		this.nazwa = nazwa;
		this.data_zalozenia = data_zalozenia;
		this.nr_adresu = nr_adresu;
	}

	public int getNr_klubu() {
		return nr_klubu;
	}

	public void setNr_klubu(int nr_klubu) {
		this.nr_klubu = nr_klubu;
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

	public int getNr_adresu() {
		return nr_adresu;
	}

	public void setNr_adresu(int nr_adresu) {
		this.nr_adresu = nr_adresu;
	}

	@Override
	public String toString() {
		return "Kluby_lekkoatletyczne [nr_klubu=" + nr_klubu + ", nazwa=" + nazwa + ", data_zalozenia=" + data_zalozenia
				+ ", nr_adresu=" + nr_adresu + "]";
	}


	
	

}
