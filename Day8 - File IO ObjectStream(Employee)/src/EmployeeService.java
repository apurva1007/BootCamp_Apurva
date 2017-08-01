import java.io.*;
import java.util.*;

/**
 * Created by ruplaga on 7/27/2017.
 */
public class EmployeeService {

    public static void main(String[] args) {

        List<Employee> employeeListAll = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();

        createTestData(employeeListAll);

        for (Employee e : employeeListAll) {
            if (e.getSalary() > 40000) {
                employeeList.add(e);
            }
        }

        Collections.sort(employeeList);
        System.out.println("Employees having salary greater than 40000 sorted according to eid: ");
        printData(employeeList);

        writeObjectsToFile(employeeList);
        System.out.println("\nEmployees added to file...");

        System.out.println("\nRetrieved employees from file...");
        getObjectsFromFile();
    }

    private static void getObjectsFromFile() {
        FileInputStream file = null;
        ObjectInputStream ois = null;
        boolean cont = true;
        try {
            file = new FileInputStream("C:\\Users\\ruplaga\\IdeaProjects\\IO2707\\src\\EmployeeDetails.txt");
            ois = new ObjectInputStream(file);

            while(cont) {
                try {
                    Employee e = (Employee) ois.readObject();
                    if ( e != null)
                        System.out.println(e.toString());
                    else
                        cont = false;
                } catch (EOFException e) {
                    return;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null)
                    ois.close();
                if (file != null)
                    file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeObjectsToFile(List<Employee> employeeList) {
        FileOutputStream file = null;
        ObjectOutputStream oos = null;
        try {
            file = new FileOutputStream("C:\\Users\\ruplaga\\IdeaProjects\\IO2707\\src\\EmployeeDetails.txt");
            oos = new ObjectOutputStream(file);
            for (Employee e : employeeList) {
                oos.writeObject(e);
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null)
                    oos.close();
                if (file != null)
                    file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printData(List<Employee> employeeList) {
        for (Employee e : employeeList) {
            System.out.println(e.toString());
        }
    }

    private static void createTestData(List<Employee> employeeListAll) {

        employeeListAll.add(new Employee(1, "Raj", 70000.00));
        employeeListAll.add(new Employee(2, "Ramu", 54370.90));
        employeeListAll.add(new Employee(3, "Amar", 3233.00));
        employeeListAll.add(new Employee(4, "Jaggu", 70800.00));
        employeeListAll.add(new Employee(5, "Pintu", 4350.00));
        employeeListAll.add(new Employee(6, "Priya", 708900.00));
        employeeListAll.add(new Employee(7, "Prem", 5648.76));
        employeeListAll.add(new Employee(8, "Nitesh", 78564.53));
        employeeListAll.add(new Employee(9, "Rakesh", 846475.85));
        employeeListAll.add(new Employee(10, "Ram", 63739.84));
        employeeListAll.add(new Employee(11, "Apurva", 748494.748));
        employeeListAll.add(new Employee(12, "Akshay", 62849.84));
        employeeListAll.add(new Employee(13, "Prachi", 22748.74));
        employeeListAll.add(new Employee(14, "Priyanka", 748494.78));
        employeeListAll.add(new Employee(15, "Laxmi", 78494.53));
        employeeListAll.add(new Employee(16, "Saraswati", 70.8));
        employeeListAll.add(new Employee(17, "Yash", 700.00));
        employeeListAll.add(new Employee(18, "Deepali", 200.00));
        employeeListAll.add(new Employee(19, "Lata", 4000.00));
        employeeListAll.add(new Employee(20, "Sushmita", 8000.00));
        employeeListAll.add(new Employee(21, "Hema", 7300.00));
        employeeListAll.add(new Employee(22, "Neha", 7200.00));
        employeeListAll.add(new Employee(23, "Ratna", 7500.00));

    }
}
