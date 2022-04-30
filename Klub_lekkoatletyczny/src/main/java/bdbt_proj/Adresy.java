package bdbt_proj;

public class Adresy {
	private int nr_adresu;
	private String miasto;
	private String ulica;
	private String nr_domu;
	private String kod_pocztowy;
	
	
	public Adresy() {
	
	}
	
	public Adresy(int nr_adresu, String miasto, String ulica, String nr_domu, String kod_pocztowy) {
		super();
		this.nr_adresu = nr_adresu;
		this.miasto = miasto;
		this.ulica = ulica;
		this.nr_domu = nr_domu;
		this.kod_pocztowy = kod_pocztowy;
	}

	public int getNr_adresu() {
		return nr_adresu;
	}

	public void setNr_adresu(int nr_adresu) {
		this.nr_adresu = nr_adresu;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getNr_domu() {
		return nr_domu;
	}

	public void setNr_domu(String nr_domu) {
		this.nr_domu = nr_domu;
	}

	public String getKod_pocztowy() {
		return kod_pocztowy;
	}

	public void setKod_pocztowy(String kod_pocztowy) {
		this.kod_pocztowy = kod_pocztowy;
	}

	@Override
	public String toString() {
		return "Adresy [nr_adresu=" + nr_adresu + ", miasto=" + miasto + ", ulica=" + ulica + ", nr_domu=" + nr_domu
				+ ", kod_pocztowy=" + kod_pocztowy + "]";
	}

	
	
	

}
