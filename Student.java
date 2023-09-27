
public class Student {

	private int indeks;
	private String ime;
	private int poeni;
	public Student(int indeks, String ime, int poeni) {
		super();
		this.indeks = indeks;
		this.ime = ime;
		this.poeni = poeni;
	}
	
	
	@Override
	public String toString() {
		return "Student [indeks=" + indeks + ", ime=" + ime + ", poeni=" + poeni + "]";
	}


	public int getIndeks() {
		return indeks;
	}
	public int getPoeni() {
		return poeni;
	}


	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}


	public void setIndeks(int indeks) {
		this.indeks = indeks;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	
	
}
