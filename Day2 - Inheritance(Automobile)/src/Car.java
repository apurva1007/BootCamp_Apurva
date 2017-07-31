class Car extends Automobile{
	
	String color;
	String engine;
	int noOfSeats;
	float fuelCapacity;
	
	Car() {
		//super();
		System.out.println("Default Car Constructor\n");
	}

	Car(long id, String make, String model, double price, String color, String engine, int noOfSeats, float fuelCapacity) {
		super(id, make, model, price);
		this.color = color;
		this.engine = engine;
		this.noOfSeats = noOfSeats;
		this.fuelCapacity = fuelCapacity;
		System.out.println("Customized Car Constructor");
	}
	
	void display() {
		super.display();
		System.out.println("Color: " + this.color);
		System.out.println("Engine: " + this.engine);
		System.out.println("No of Seats: " + this.noOfSeats);
		System.out.println("Fuel Capacity: " + this.fuelCapacity);		
	}
}
		