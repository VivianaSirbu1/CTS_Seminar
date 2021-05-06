package ro.ase.cts.clase.state;

public class MasaLibera implements Stare{

	@Override
	public void modificareStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStareMasa() instanceof MasaOcupata || masa.getStareMasa() instanceof MasaRezervata) {
			System.out.println("Masa"+ masa.getNrMasa() +" trece in stare libera");
			masa.setStareMasa(this);
		}else {
			System.out.println("Masa"+ masa.getNrMasa() +" este deja libera");
		}
	}

}
