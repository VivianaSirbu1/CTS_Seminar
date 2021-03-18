package ro.ase.cts.clase;

public class BrokerTranzactieLazy {
	private String name; 
	private int vechime;
	private int nrTranzactiiEfectuate;
	
	private static BrokerTranzactieLazy brokerTranzactie=null;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BrokerTranzactieLazy [name=");
		builder.append(name);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append(", nrTranzactiiEfectuate=");
		builder.append(nrTranzactiiEfectuate);
		builder.append("]");
		return builder.toString();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVechime(int vechime) {
		this.vechime = vechime;
	}

	public void setNrTranzactiiEfectuate(int nrTranzactiiEfectuate) {
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}

	private BrokerTranzactieLazy(String name, int vechime, int nrTranzactiiEfectuate) {
		super();
		this.name = name;
		this.vechime = vechime;
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}
	//CU SYNCHRONIZED THREAD SAFE
	public static synchronized BrokerTranzactieLazy getInstance(String name, int vechime, int nrTranz) {
		if( brokerTranzactie==null)
		{
			 brokerTranzactie= new BrokerTranzactieLazy(name, vechime, nrTranz);
		}
		return  brokerTranzactie;
	}
}
