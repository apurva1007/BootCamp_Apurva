import org.junit.Test;

public class Driver {

	@Test
	public void testFlyingCar() {
		FlyingCar flyingCar1 = new FlyingCar();
		flyingCar1.display();

		FlyingCar flyingCar2 = new FlyingCar(6563523L, "XYZ", "DDS", 764738.78, "DFGT", "VDD", 2, 1.7F, "SDF", 73.7F);
		flyingCar2.display();
	}

	@Test
	public void testSportsCar() {
		SportsCar sportsCar1 = new SportsCar();
		sportsCar1.display();

		SportsCar sportsCar2 = new SportsCar(6563523L, "XYZ", "DDS", 764738.78, "DFGT", "VDD", 2, 1.7F, 5, 78.8F);
		sportsCar2.display();

		double price2 = sportsCar2.getPrice();
		System.out.println("Price using getter method: " + price2);
	}

	@Test
	public void testBus() {
		Bus bus1 = new Bus();
		bus1.display();

		Bus bus2 = new Bus(1234764478L, "ABC", "XYZ", 897893.88, "EFG", "KLM", 25, 2);
		bus2.display();

		double price = bus2.getPrice();
		System.out.println("Price using getter method: " + price);
	}

	@Test
	public void testCar() {
		Car car1 = new Car();
		car1.display();

		Car car2 = new Car(7837834L, "DFG", "OPK", 798385.89, "FFD", "DFR", 45, 7.9F);
		car2.display();
	}
}