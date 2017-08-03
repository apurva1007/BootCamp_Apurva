import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ruplaga on 7/29/2017.
 */
public class EmployeeService {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        createTestData(employeeList);

        demoOne(employeeList);

        displayTotalSalary(employeeList);

        statsSalary(employeeList);

        String name = (employeeList.stream().min(Comparator.comparingDouble(Employee::getSalary)).get()).getName();

        System.out.println(name);

        name = (employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary)).get()).getName();

        System.out.println(name);

    }

    private static void statsSalary(List<Employee> employeeList) {
        DoubleSummaryStatistics stats = employeeList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary: " + stats.getAverage());
        System.out.println("Total Number of Employees: " + stats.getCount());
        System.out.println("Maximum Salary : " +  stats.getMax());
        System.out.println("Minimum Salary : " + stats.getMin());
    }

    /*private static void averageOfSalary(List<Employee> employeeList) {
        double average = employeeList.stream()
                .map((emp) -> emp.getSalary()/12)
                .reduce((acc, val) -> acc+val).get();

        average = average/employeeList.size();
        System.out.println("Average Salary: " + average);
    }*/

    private static void displayTotalSalary(List<Employee> employeeList) {
        /*double totalSalary = employeeList.stream()
                .map((emp) -> emp.getSalary())
                .reduce((acc, val) -> acc+val).get();*/

        double totalSalary = employeeList.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Total salary: " + totalSalary);
    }

    private static void demoOne(List<Employee> employeeList) {
        /*double totalTDS = employeeList.stream()
                .filter((emp)-> emp.getSalary() > 50000)
                .map((emp) -> emp.getSalary() * 0.01)
                .reduce((acc, val) -> acc+val).get();*/

        double totalTDS = employeeList.stream()
                .filter((emp)-> emp.getSalary() > 50000)
                .map((emp) -> emp.getSalary() * 0.01)
                .collect(Collectors.summingDouble((val) -> val));

        System.out.println("Total TDS: " + totalTDS);
    }

    private static void createTestData(List<Employee> employeeList) {

        Employee employee1 = new Employee(111, "Apurva", 5506759);
        employeeList.add(employee1);
        Employee employee2 = new Employee(2, "Deepika", 73989);
        employeeList.add(employee2);
        Employee employee3 = new Employee(313, "Arshi", 873468);
        employeeList.add(employee3);
        Employee employee4 = new Employee(94, "Rajan", 5376);
        employeeList.add(employee4);
        Employee employee5 = new Employee(51, "Sneh", 78478);
        employeeList.add(employee5);
        Employee employee6 = new Employee(16, "Kamal", 763478);
        employeeList.add(employee6);

    }
}
