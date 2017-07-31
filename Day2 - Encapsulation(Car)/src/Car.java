/**
 * Created by ruplaga on 7/31/2017.
 */
class Car {

    String name;
    String color;
    int price;
    int noOfWheels;
    int speed;

    void accelerate() {
        this.speed++;
        System.out.println("Accelerated.Speed is: " + speed);
    }

    void start() {
        System.out.println("Start...");
    }

    void stop() {
        System.out.println("Stop...");
    }

    void brake() {
        this.speed--;
        System.out.println("Break.Speed is: " + speed);
    }

}
