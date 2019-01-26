package employee;

public abstract class Employee {
    private int id;
    private String fullName;
    private String externalId;

    private EmployeeType employeeType;

    public Employee(int id, String fullName, String externalId, EmployeeType employeeType) {
        this.id = id;
        this.fullName = fullName;
        this.externalId = externalId;
        this.employeeType = employeeType;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getExternalId() {
        return externalId;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

}
