package employee;

public abstract class Employee {
    private String fullName;
    private EmployeeType employeeType;
    private int id;
    private static int counter = 1;

    public Employee(String fullName, EmployeeType employeeType) {
        this.id = counter++;
        this.fullName = fullName;
        this.employeeType = employeeType;
    }
}
