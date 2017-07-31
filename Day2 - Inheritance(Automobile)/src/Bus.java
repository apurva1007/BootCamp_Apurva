class Bus extends Automobile{
	
	String route;
	String type;
	int noOfSeats;
	int noOfDoors;
	
	Bus() {
		//super();
		System.out.println("Default Bus Constructor\n");
	}

	Bus(long id, String make, String model, double price, String route, String type, int noOfSeats, int noOfDoors) {
		super(id, make, model, price);
		this.route = route;
		this.type = type;
		this.noOfSeats = noOfSeats;
		this.noOfDoors = noOfDoors;
		System.out.println("Customized Bus Constructor\n");
	}

	void display() {
		super.display();
		System.out.println("Route: " + this.route);
		System.out.println("Type: " + this.type);
		System.out.println("No of Seats: " + this.noOfSeats);
		System.out.println("No of Doors: " + this.noOfDoors);		
	}
}
		