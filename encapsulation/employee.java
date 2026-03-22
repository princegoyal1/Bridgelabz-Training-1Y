// Interface
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Abstract class
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int id, String name, double salary) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = salary;
    }

    // Getter
    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + calculateSalary());
    }
}

// Full Time
class FullTimeEmployee extends Employee implements Department {
    private String dept;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return getBaseSalary(); // fixed salary
    }

    public void assignDepartment(String dept) {
        this.dept = dept;
    }

    public String getDepartmentDetails() {
        return dept;
    }
}

// Part Time
class PartTimeEmployee extends Employee implements Department {
    private int hours;
    private String dept;

    public PartTimeEmployee(int id, String name, double salary, int hours) {
        super(id, name, salary);
        this.hours = hours;
    }

    public double calculateSalary() {
        return getBaseSalary() * hours;
    }

    public void assignDepartment(String dept) {
        this.dept = dept;
    }

    public String getDepartmentDetails() {
        return dept;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Aman", 50000);
        Employee e2 = new PartTimeEmployee(2, "Riya", 500, 20);

        e1.displayDetails();
        e2.displayDetails();
    }
}