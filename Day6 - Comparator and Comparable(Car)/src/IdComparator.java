import java.util.Comparator;

/**
 * Created by ruplaga on 7/26/2017.
 */
public class IdComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getId() - o2.getId() ;
    }
}
