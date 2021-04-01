package ro.ase.cts.builder.clase;

public class RezervareBuilder implements AbstractBuilder{

	private Rezervare rezervare;
	
	public RezervareBuilder(int codRezervare) {
		super();
		this.rezervare = new Rezervare(false, false, false, false, "", codRezervare);
	}
	
	public RezervareBuilder() {
		super();
		rezervare = new Rezervare(false, false, false, false, "", 0);
		
	}
	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	public RezervareBuilder setAreBauturaInclusa(boolean areBauturaInclusa) {
		rezervare.setAreBautuaInclusa(areBauturaInclusa);
		return this;
	}
	public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}
	public RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}
	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}
	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}

	public Rezervare built() {
		
		return rezervare;
	}

}
