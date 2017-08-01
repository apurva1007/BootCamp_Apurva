import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by ruplaga on 7/25/2017.
 */
public class CarService {

    public static void main(String[] args) {

        IdComparator idComparator = new IdComparator();
        BrandComparator brandComparator = new BrandComparator();

        Set<Car> carSet = new TreeSet<>();                                  //natural sorting by price(as defined in compareTo() of Car class
        createTestData(carSet);
        System.out.println("Natural Ordering by price: ");
        printData(carSet);

        Car[] list = new Car[carSet.size()];
        carSet.toArray(list);

        Arrays.sort(list, idComparator);                                     //compare by id
        System.out.println("Ordering by id: ");
        for (Car car : list) {
            System.out.println(car.toString());
        }

        Arrays.sort(list, brandComparator);                                 //compare by brand
        System.out.println("Ordering by brand: ");
        for (Car car : list) {
            System.out.println(car.toString());
        }
    }

    private static void printData(Set<Car> carSet) {
        Iterator<Car> iterator = carSet.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void createTestData(Set<Car> carSet) {
        carSet.add(new Car(1,88409.789, "BMW"));
        carSet.add(new Car(2,88409.789, "Mahindra"));
        carSet.add(new Car(3,409.89, "Honda"));
        carSet.add(new Car(4,889.78, "Tata"));
        carSet.add(new Car(5,8849.79, "Audi"));
        carSet.add(new Car(5,8849.79, "BMW"));
        carSet.add(new Car(6,88436.789, "Mahindra"));
        carSet.add(new Car(7,88409.789, "Tata"));
        carSet.add(new Car(9,409.89, "BMW"));
        carSet.add(new Car(9,889.78, "Mahindra"));
        carSet.add(new Car(10,8849.79, "BMW"));
        carSet.add(new Car(10,8849.79, "Honda"));
        carSet.add(new Car(11,88409.789, "Honda"));
        carSet.add(new Car(12,88409.789, "Mahindra"));
        carSet.add(new Car(13,409.89, "BMW"));
        carSet.add(new Car(14,87489.78, "Mahindra"));
        carSet.add(new Car(14,8849.79, "BMW"));
        carSet.add(new Car(16,8849.79, "Mahindra"));
        carSet.add(new Car(17,98409.789, "Tata"));
        carSet.add(new Car(17,34409.789, "Audi"));
        carSet.add(new Car(18,29.89, "Honda"));
        carSet.add(new Car(18,81239.78, "Honda"));
        carSet.add(new Car(20,176389.79, "Audi"));
        carSet.add(new Car(20,884739.79, "Honda"));
    }
}
