import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // For serialization compatibility
    private int employeeId;
    private String name;
    private String designation;
    private double salary;

    public Employee(int employeeId, String name, String designation, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Designation: " + designation + ", Salary: " + salary;
    }
}