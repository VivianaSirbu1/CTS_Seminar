package ro.ase.cts.memento.clase;

public class Memento {
	private int nrSpectatori;
	private String numeGazda;
	private String numeOaspeti;
	
	public Memento(int nrSpectatori, String numeGazda, String numeOaspeti) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.numeGazda = numeGazda;
		this.numeOaspeti = numeOaspeti;
	}
	
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	
	public String getNumeGazda() {
		return numeGazda;
	}
	
	public void setNumeGazda(String numeGazda) {
		this.numeGazda = numeGazda;
	}
	
	public String getNumeOaspeti() {
		return numeOaspeti;
	}
	
	public void setNumeOaspeti(String numeOaspeti) {
		this.numeOaspeti = numeOaspeti;
	}
	
	
}
