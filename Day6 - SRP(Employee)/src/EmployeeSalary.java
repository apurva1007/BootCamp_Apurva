import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ruplaga on 7/25/2017.
 */
public class EmployeeSalary {

    public static void main(String[] args) {
        ArrayList<Double> salaryList = new ArrayList(10);

        salaryList.add(68483.789);
        salaryList.add(87.97);
        salaryList.add(97343.8);
        salaryList.add(435.79);
        salaryList.add(4663.54);
        salaryList.add(474.789);
        salaryList.add(3774.46);
        salaryList.add(3735.678);
        salaryList.add(574.7);
        salaryList.add(3563.546);

        printHRA(salaryList);
        printList(salaryList);
        increaseSalary(salaryList);
        System.out.println();
        printList(salaryList);

    }

    private static void increaseSalary(ArrayList<Double> salaryList) {
        Iterator<Double> iterator = salaryList.iterator();
        int i = 0;
        while(iterator.hasNext()) {
            double salary = iterator.next();
            if (salary < 20000.00){
                salary += salary * 0.2;
                salaryList.set(i, salary);
            }
            i++;
        }
    }

    private static void printHRA(ArrayList<Double> salaryList) {
        Iterator<Double> iterator = salaryList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next()*0.3);
        }
    }

    private static void printList(ArrayList<Double> salaryList) {
        Iterator<Double> iterator = salaryList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
