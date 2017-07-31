import org.junit.Test;

/**
 * Created by ruplaga on 7/31/2017.
 */
public class Driver {

    @Test
    public void testCar() {
        Car car1 = new Car();
        car1.start();
        car1.accelerate();
        car1.brake();
        car1.stop();
    }
}


