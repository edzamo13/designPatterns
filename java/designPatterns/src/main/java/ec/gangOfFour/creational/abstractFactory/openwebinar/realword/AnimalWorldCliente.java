package ec.com.openwebinar.gangOfFour.creationalPattern.abstractFactory.realword;

/**
 * 
 * Client (AnimalWorld) usa interfaces declaradas por las clases AbstractFactory
 * y AbstractProduct
 */

public class AnimalWorldCliente {

	private HerbivoreAbstractProduct herbivore;
	private CarnivoreAbstractProduct carnivore;

	public AnimalWorldCliente(ContinentFactory factory) {

		herbivore = factory.createHerbivore();
		carnivore = factory.createCarnivore();

	}

	public void runRoodChain() {
		carnivore.eat(herbivore);
	}
	
	
	

	public static void main(String[] args) {

		AfricaConcreteFactory africaFactory = new AfricaConcreteFactory();
		AmericaConcreteFactory americaFactory = new AmericaConcreteFactory();

		AnimalWorldCliente animalWorld = new AnimalWorldCliente(africaFactory);
		AnimalWorldCliente animalWorldAmerica = new AnimalWorldCliente(americaFactory);
		animalWorld.runRoodChain();
		animalWorldAmerica.runRoodChain();

	}

}
