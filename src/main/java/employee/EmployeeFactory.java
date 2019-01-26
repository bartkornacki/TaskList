package employee;

public class EmployeeFactory {
    public Employee create (EmployeeType employee, int id,
                             String fullName, String externalID ){
        if(EmployeeType.TECHNICAN.equals(employee)){
            return new Technican(id,fullName, externalID,employee);

        } else if (EmployeeType.DISPATCHER.equals(employee)){
            return new Dispatcher(id, fullName, externalID,employee);
        }
        return null;
    }

}
