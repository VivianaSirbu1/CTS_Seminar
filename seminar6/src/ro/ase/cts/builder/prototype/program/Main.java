package ro.ase.cts.builder.prototype.program;

import ro.ase.cts.builder.prototype.clase.Bilet;
import ro.ase.cts.builder.prototype.clase.ContClient;

public class Main {

	public static void main(String[] args) {
		
		ContClient contClient1=new ContClient("Ioana",21,10);
		ContClient contClient2=(ContClient) contClient1.copiaza();
		System.out.println(contClient1);
		System.out.println(contClient2);
		
		Bilet bilet1=new Bilet(12,"Echipa1","Echipa2","12.2.2021");
		Bilet bilet2=(Bilet)bilet1.copiaza();
		System.out.println(bilet1);
		System.out.println(bilet2);
		
		bilet2.setCodBilet(30);
		System.out.println(bilet2);
		
		
	}

}