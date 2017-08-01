import java.util.Arrays;
import java.util.List;

/**
 * Created by ruplaga on 7/28/2017.
 */

public class NumberService {
    public static void main(String[] args) {

        Integer[] arrayInt = new Integer[]{2, 3, 4, 5, 6, 6, 7, 7, 7, 8};

        List<Integer> array = Arrays.asList(arrayInt);

        NumberClass numbers = new NumberClass(array);

        numbers.forEach((Integer num) -> {
            System.out.println("Multiply by 2 is: " + 2 * num);
        });

        numbers.modify((Integer num) -> {
            return num*2;
        });

        printData(array);

        array = numbers.delete((Integer num) -> {
            return num % 2 == 0;
        });

        printData(array);

        int sum = numbers.fold((Integer num1, Integer num2) -> {
            return num1+num2;
        });

        System.out.println("\nSum: " + sum);

    }

    private static void printData(List<Integer> array) {
        for (Integer n : array) {
            System.out.print(n + " ");
        }
    }
}
