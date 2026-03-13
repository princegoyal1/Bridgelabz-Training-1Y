class Employee {

    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.name = "Rahul";
        e.id = 101;
        e.salary = 50000;

        e.displayDetails();
    }
}