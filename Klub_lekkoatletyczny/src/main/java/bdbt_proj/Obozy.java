package bdbt_proj;

public class Obozy {
	private int nr_obozu;
	private int cena;
	private String data_od;
	private String data_do;
	private int nr_miejsca_pobytu;
	
	public Obozy() {
	}

	public Obozy(int nr_obozu, int cena, String data_od, String data_do, int nr_miejsca_pobytu) {
		super();
		this.nr_obozu = nr_obozu;
		this.cena = cena;
		this.data_od = data_od;
		this.data_do = data_do;
		this.nr_miejsca_pobytu = nr_miejsca_pobytu;
	}

	public int getNr_obozu() {
		return nr_obozu;
	}

	public void setNr_obozu(int nr_obozu) {
		this.nr_obozu = nr_obozu;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String getData_od() {
		return data_od.substring(0,10);
	}

	public void setData_od(String data_od) {
		this.data_od = data_od;
	}

	public String getData_do() {
		return data_do.substring(0,10);
	}

	public void setData_do(String data_do) {
		this.data_do = data_do;
	}

	public int getNr_miejsca_pobytu() {
		return nr_miejsca_pobytu;
	}

	public void setNr_miejsca_pobytu(int nr_miejsca_pobytu) {
		this.nr_miejsca_pobytu = nr_miejsca_pobytu;
	}

	@Override
	public String toString() {
		return "Obozy [nr_obozu=" + nr_obozu + ", cena=" + cena + ", data_od=" + data_od + ", data_do=" + data_do
				+ ", nr_miejsca_pobytu=" + nr_miejsca_pobytu + "]";
	}

}
