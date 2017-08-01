/**
 * Created by ruplaga on 7/25/2017.
 */
public class FinanceService {

    public static void updateSalary(EmployeeService e) {
        e.setSalary(e.getSalary() + 0.2 * e.getSalary());
    }

    public static double calculateTDS(EmployeeService e) {
        double tds = 0.2 * e.getSalary();
        return tds;
    }
}
