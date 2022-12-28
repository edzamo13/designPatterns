package ec.com.openwebinar.gangOfFour.creationalPattern.abstractFactory.realword;

/**
 * 
 * Product (Wildebeest, Lion, Bison, Wolf) define un objeto producto a ser
 * creado por la fábrica de concreto correspondiente implementa la interfaz de
 * producto abstracto
 * 
 */

public class Wolf implements CarnivoreAbstractProduct {

	@Override
	public void eat(HerbivoreAbstractProduct herbivore) {

		System.out.println(this.getClass().getSimpleName() + " eat " + herbivore.getClass().getSimpleName());

	}

}
