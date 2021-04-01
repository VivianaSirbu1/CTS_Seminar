package ro.ase.cts.builder.clase;

public class Rezervare {
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBautuaInclusa;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	private int codRezervare;

	public Rezervare(boolean areMancareInclusa, boolean areScaunErgonomic, boolean areBautuaInclusa,
			boolean areMuzicaAmbientala, String genMuzica, int codRezervare) {
		super();
		this.areMancareInclusa = areMancareInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areBautuaInclusa = areBautuaInclusa;
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		this.genMuzica = genMuzica;
		this.codRezervare = codRezervare;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [areMancareInclusa=");
		builder.append(areMancareInclusa);
		builder.append(", areScaunErgonomic=");
		builder.append(areScaunErgonomic);
		builder.append(", areBautuaInclusa=");
		builder.append(areBautuaInclusa);
		builder.append(", areMuzicaAmbientala=");
		builder.append(areMuzicaAmbientala);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append(", codRezervare=");
		builder.append(codRezervare);
		builder.append("]");
		return builder.toString();
	}

	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}

	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}

	public void setAreBautuaInclusa(boolean areBautuaInclusa) {
		this.areBautuaInclusa = areBautuaInclusa;
	}

	public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}

}
