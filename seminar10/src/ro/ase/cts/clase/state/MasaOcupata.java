package ro.ase.cts.clase.state;

public class MasaOcupata implements Stare {

	@Override
	public void modificareStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStareMasa() instanceof MasaOcupata)
		{
			System.out.println("Nu se poate ocupa");
		}else {
			masa.setStareMasa(this);
			System.out.println("Masa"+ masa.getNrMasa() +" este trecuta in stare ocupata");

		}
	}

}
