package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.BrokerTranzactieLazy;

public class Main {

	public static void main(String[] args) {
		BrokerTranzactie broker1= BrokerTranzactie.getInstance();
		BrokerTranzactie broker2=  BrokerTranzactie.getInstance();
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		broker1.setName("Alina");
		broker2.setNrTranzactiiEfectuate(9);
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		
		BrokerTranzactieLazy lazy1= BrokerTranzactieLazy.getInstance("ana",2,30);
		BrokerTranzactieLazy lazy2= BrokerTranzactieLazy.getInstance("Oana",3,78);
		System.out.println(lazy1.toString());
		System.out.println(lazy2.toString());
	}
}
