package ec.com.openwebinar.gangOfFour.creationalPattern.abstractFactory.realword;

/**
 * 
 * AbstractProduct (Herbivore, Carnivore) declara una interfaz para un tipo de
 * objeto de producto
 */

public interface CarnivoreAbstractProduct {

	public abstract void eat(HerbivoreAbstractProduct herbivore);
}
