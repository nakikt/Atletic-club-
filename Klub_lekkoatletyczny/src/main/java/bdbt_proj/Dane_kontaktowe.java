package bdbt_proj;

public class Dane_kontaktowe {

	private int nr_danych;
	private String nr_telefonu;
	private String email;
	
	
	public Dane_kontaktowe() {

	}


	public Dane_kontaktowe(int nr_danych, String nr_telefonu, String email) {
		super();
		this.nr_danych = nr_danych;
		this.nr_telefonu = nr_telefonu;
		this.email = email;
	}


	public int getNr_danych() {
		return nr_danych;
	}


	public void setNr_danych(int nr_danych) {
		this.nr_danych = nr_danych;
	}


	public String getNr_telefonu() {
		return nr_telefonu;
	}


	public void setNr_telefonu(String nr_telefonu) {
		this.nr_telefonu = nr_telefonu;
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Dane_kontaktowe [nr_danych=" + nr_danych + ", nr_telefonu=" + nr_telefonu + "]";
	}
	
	
	
	
}
