/**
 * Created by ruplaga on 7/29/2017.
 */
public class Employee {
    private int eid;
    private String name;
    private double salary;

    public Employee(int eid, String name, double salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eid=" + eid +
                ", salary=" + salary +
                '}';
    }
}
