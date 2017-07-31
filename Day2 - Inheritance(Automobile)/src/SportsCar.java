class SportsCar extends Car{
	
	int performance;
	float speed;
	
	SportsCar() {
		//super();
		System.out.println("Default SportsCar Constructor\n");
	}

	SportsCar(long id, String make, String model, double price, String color, String engine, int noOfSeats, float fuelCapacity, int performance, float speed) {
		super(id, make, model, price, color, engine, noOfSeats, fuelCapacity);
		this.performance = performance;
		this.speed = speed;
		System.out.println("Customized SportsCar Constructor");
	}

	void display() {
		super.display();
		System.out.println("Performance: " + this.performance);
		System.out.println("Speed: " + this.speed);
	}
}
		