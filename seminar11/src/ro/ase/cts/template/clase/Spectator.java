package ro.ase.cts.template.clase;

public class Spectator  extends TemplateSepctator{
	private String name;
	

	public Spectator(String name) {
		super();
		this.name = name;
	}

	@Override
	public void seAseazaLaCoada() {
		System.out.println(name+ " se aseaza la coada");
		
	}

	@Override
	public void prezintaBiletul() {
		System.out.println(name+ " prezinta biletul");
		
	}

	@Override
	public void seFaceControlulCorporal() {
		System.out.println(name+ " se face controlul corporal");
		
	}

	@Override
	public void ocupaLocul() {
		System.out.println(name+ " ocupa locul");
		
	}

}
