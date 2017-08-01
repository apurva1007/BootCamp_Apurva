/**
 * Created by ruplaga on 7/28/2017.
 */
public class CalculatorDemo {
    public static void main(String[] args) {

        CalculatorService.calculateMethod(45.5, 65.4, (double val1, double val2) -> {
            System.out.printf("Result is: %s%n", (val1 + val2));
        });

        CalculatorService.calculateMethod(10.9, 34.7, (double val1, double val2) -> {
            System.out.printf("Result is: %s%n", (val1 - val2));
        });

        CalculatorService.calculateMethod(50.8, 65.7, (double val1, double val2) -> {
            System.out.printf("Result is: %s%n", (val1 * val2));
        });

        CalculatorService.calculateMethod(45.5, 65.4, (double val1, double val2) -> {
            System.out.printf("Result is: %s%n", (val1 / val2));
        });
    }
}
