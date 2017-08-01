/**
 * Created by ruplaga on 7/25/2017.
 */
public class HRService {

    public static boolean eligibleForPromotion(EmployeeService e) {
        if (e.getDesig().equals("Manager")) {
            return true;
        }
        else
            return false;
    }

    public static void changeDesignation(EmployeeService e) {
        if (e.getDesig().equals("Manager"))
            e.setDesig("Senior Manager");

        System.out.println("Your designation is: " + e.getDesig());
    }

    public static void changeProject(EmployeeService e) {
        if(e.getDesig().equals("Manager"))
            System.out.println("Project Changed");
    }

}
