package ec.com.openwebinar.gangOfFour.creationalPattern.abstractFactory.example;

public class Client {

	private AbstractProductA abstractProductA;
	private AbstractProductB abstractProductB;

	public Client(AbstractFactory abstractFactory) {

		abstractProductA = abstractFactory.createProductoA();
		abstractProductB = abstractFactory.createProductoB();
	}
	
	public void run( ) {
		
		abstractProductB.interact(abstractProductA);
		
	}

}
