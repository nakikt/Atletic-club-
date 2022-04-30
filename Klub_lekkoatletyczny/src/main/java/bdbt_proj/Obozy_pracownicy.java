package bdbt_proj;

public class Obozy_pracownicy {
	private int nr_pracownika;
	private int nr_obozu;
	
	public Obozy_pracownicy() {
	}

	public Obozy_pracownicy(int nr_pracownika, int nr_obozu) {
		super();
		this.nr_pracownika = nr_pracownika;
		this.nr_obozu = nr_obozu;
	}

	public int getNr_pracownika() {
		return nr_pracownika;
	}

	public void setNr_pracownika(int nr_pracownika) {
		this.nr_pracownika = nr_pracownika;
	}

	public int getNr_obozu() {
		return nr_obozu;
	}

	public void setNr_obozu(int nr_obozu) {
		this.nr_obozu = nr_obozu;
	}

	@Override
	public String toString() {
		return "Obozy_pracownicy [nr_pracownika=" + nr_pracownika + ", nr_obozu=" + nr_obozu + "]";
	}
	

}
