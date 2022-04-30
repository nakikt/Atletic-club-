package bdbt_proj;

public class Obozy_zawodnicy {

	private int nr_zawodnika;
	private int nr_obozu;
	
	public Obozy_zawodnicy() {

	}


	public Obozy_zawodnicy(int nr_zawodnika, int nr_obozu) {
		super();
		this.nr_zawodnika = nr_zawodnika;
		this.nr_obozu = nr_obozu;
	}


	public int getNr_zawodnika() {
		return nr_zawodnika;
	}


	public void setNr_zawodnika(int nr_zawodnika) {
		this.nr_zawodnika = nr_zawodnika;
	}


	public int getNr_obozu() {
		return nr_obozu;
	}


	public void setNr_obozu(int nr_obozu) {
		this.nr_obozu = nr_obozu;
	}


	@Override
	public String toString() {
		return "Obozy_zawodnicy [nr_zawodnika=" + nr_zawodnika + ", nr_obozu=" + nr_obozu + "]";
	}
	
	
	
}
