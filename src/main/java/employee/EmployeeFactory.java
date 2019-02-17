package employee;

/**
 * Fabryka Employee
 */
public class EmployeeFactory {
    public Employee create(EmployeeType employeeType, String fullName) {
        if (employeeType.equals(EmployeeType.TECHNICIAN)) {
            return new Technician(fullName);
        } else if (employeeType.equals(EmployeeType.DISPATCHER)) {
            return new Dispatcher(fullName);
        }
        return null;
    }
}
