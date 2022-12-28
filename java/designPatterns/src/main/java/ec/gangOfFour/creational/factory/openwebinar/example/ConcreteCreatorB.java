package ec.com.openwebinar.gangOfFour.creationalPatter.factory.example;

public class ConcreteCreatorB implements Creator{

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProdcutB();
	}

}
