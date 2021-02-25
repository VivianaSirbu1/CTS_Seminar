package program;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Program {

	public static void main(String[] args) {
		Zoo z= new Zoo();

		Giraffe giraffe= new Giraffe("Girafel1");
		Giraffe giraffe2= new Giraffe("Girafel2");
		z.addAnimal(giraffe);
		z.addAnimal(giraffe2);
		
		z.feedAllAnimals();
		
		Zebra z1= new Zebra("z1");
		Zebra z2= new Zebra("z2");
		z.addAnimal(z1);
		z.addAnimal(z2);
		
		z.feedAllAnimals();

	}

}
