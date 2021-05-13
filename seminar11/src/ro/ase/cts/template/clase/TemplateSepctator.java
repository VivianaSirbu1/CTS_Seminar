package ro.ase.cts.template.clase;

public abstract class TemplateSepctator {
	public abstract void seAseazaLaCoada();
	public abstract void prezintaBiletul();
	public abstract void seFaceControlulCorporal();
	public abstract void ocupaLocul();
	
	public final void intrareaPeStadion() {
		seAseazaLaCoada();
		seFaceControlulCorporal();
		ocupaLocul();
	}

}
