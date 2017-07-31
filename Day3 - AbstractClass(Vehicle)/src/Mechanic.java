/* Create a class Vehicle which will have 3 methods and some properties along with 2 constructors.
details -- will show details of vehicle
drive -- will be implemented later
inspect -- will be implemented later
Create 2 subclasses called as Bike and Car will extend Vehicle and will implement all the above given methods
Create a main class called Mechanic also which will be used to test all Vehicles*/

import org.junit.Test;

abstract class Vehicle {
    int vin;
    int speed;
    String name;

    Vehicle() {
        System.out.println("Default Vehicle Constructor");
    }

    Vehicle(int vin, int speed, String name) {
        this.vin = vin;
        this.speed = speed;
        this.name = name;
    }

    void details() {
        System.out.println("VIN: " + vin);
        System.out.println("Speed: " + speed);
        System.out.println("Name: " + name);
    }

    abstract void drive();

    abstract void inspect();
}

class Bike extends Vehicle {

    Bike() {

    }

    Bike(int id, int speed, String name) {
        super(id, speed, name);
    }

    void drive() {
        System.out.println("Driving the Bike");
    }

    void inspect() {
        System.out.println("Inspecting the Bike");
    }
}

class Car extends Vehicle {

    Car() {

    }

    Car(int id, int speed, String name) {
        super(id, speed, name);
    }

    void drive() {
        System.out.println("Driving the Car");
    }

    void inspect() {
        System.out.println("Inspecting the Car");
    }
}

public class Mechanic {

    @Test
    public void testCar() {
        Car car = new Car(45, 56, "XYZ");
        car.details();
        car.drive();
        car.inspect();
    }

    @Test
    public void testBike() {
        Bike bike = new Bike(45, 56, "XYZ");
        bike.details();
        bike.drive();
        bike.inspect();
    }
}

		
	
	
	
	
