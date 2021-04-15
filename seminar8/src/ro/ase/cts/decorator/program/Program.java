package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorNotaLMA;
import ro.ase.cts.decorator.clase.DecoratorNotaPasteFericit;
import ro.ase.cts.decorator.clase.NotaAbstracta;
import ro.ase.cts.decorator.clase.NotaDePlata;


public class Program {
	public static void main(String[] args) {
		NotaAbstracta nota= new  NotaDePlata(100);
		
		nota.printeaza();
		
		DecoratorAbstract decorator= new DecoratorNotaPasteFericit(nota);
		
		decorator.printeazaFelicitare();
		decorator.printeaza();
		
		System.out.println();
		
		
		DecoratorNotaLMA decoratorLMA= new DecoratorNotaLMA(nota);
		decoratorLMA.printeaza();
		
		NotaAbstracta nota2= new NotaDePlata(36);
		DecoratorAbstract decoratorLMAnou= new  DecoratorNotaLMA(nota2);
		DecoratorAbstract decoratorFelicitare = new DecoratorNotaPasteFericit(decoratorLMAnou);
		decoratorFelicitare.printeaza();
		
	}

}
