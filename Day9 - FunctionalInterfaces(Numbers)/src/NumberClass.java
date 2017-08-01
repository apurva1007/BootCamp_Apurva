import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by ruplaga on 7/28/2017.
 */
public class NumberClass {

    List<Integer> array = new ArrayList<>();

    NumberClass(List<Integer> a) {
        this.array = a;
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int n : array) {
            consumer.accept(n);
        }
    }

    public void modify(Function<Integer, Integer> function) {
        for (int i = 0; i < array.size(); i++) {
            array.set(i, function.apply(array.get(i)));
        }
    }

    public List<Integer> delete(Predicate<Integer> predicate) {
        List<Integer> newList = new ArrayList<>();
        Iterator<Integer> itr = array.iterator();
        while (itr.hasNext())
        {
            int value = itr.next();
            if (value > 10)
                newList.add(value);
        }

        return newList;
    }

    public int fold(BiFunction<Integer, Integer, Integer> biFunction){
        int sum = 0;
        for (int i = 0; i < array.size(); i+=2) {
            sum += biFunction.apply(array.get(i), array.get(i+1));
        }
        return sum;
    }

}
