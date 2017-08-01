/**
 * Created by ruplaga on 7/25/2017.
 */
public class Employee {
    public static void main(String[] args) {

        EmployeeService e1 = new EmployeeService(1, "Raj", 670098.89, "9850334370", "Manager");

        FinanceService.updateSalary(e1);
        System.out.println(e1.getSalary());

        double tds = FinanceService.calculateTDS(e1);
        System.out.println(tds);

        if(HRService.eligibleForPromotion(e1))
            System.out.println("You are promoted");

        HRService.changeDesignation(e1);

        HRService.changeProject(e1);
    }
}
