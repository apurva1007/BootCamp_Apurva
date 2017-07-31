class FlyingCar extends Car{
	
	String wings;
	float takeOffSpeed;
	
	FlyingCar() {
		//super();
		System.out.println("Default FlyingCar Constructor\n");
	}

	FlyingCar(long id, String make, String model, double price, String color, String engine, int noOfSeats, float fuelCapacity, String wings, float takeOffSpeed) {
		super(id, make, model, price, color, engine, noOfSeats, fuelCapacity);
		this.wings = wings;
		this.takeOffSpeed = takeOffSpeed;
		System.out.println("Customized FlyingCar Constructor");
	}

	void display() {
		super.display();
		System.out.println("Wings: " + this.wings);
		System.out.println("Take-off Speed: " + this.takeOffSpeed);
	}
}
		