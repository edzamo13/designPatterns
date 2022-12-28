package ec.com.openwebinar.gangOfFour.creationalPattern.abstractFactory.realword;

/**
 * 
 * AbstractFactory (ContinentFactory)
 * 
 * declara una interfaz para operaciones que crean productos abstractos
 * 
 */
public interface ContinentFactory {

	public abstract HerbivoreAbstractProduct createHerbivore();

	public abstract CarnivoreAbstractProduct createCarnivore();

}
