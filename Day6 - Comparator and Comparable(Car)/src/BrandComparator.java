import java.util.Comparator;

/**
 * Created by ruplaga on 7/26/2017.
 */
public class BrandComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
