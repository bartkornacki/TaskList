package employee;

import task.model.Task;

public class DispatcherService {

    public void assignTaskToTechnician(Employee employee, Task task){
        if (employee instanceof Technican){
            task.setAssignedUserExternalId(employee.getExternalId());
        }
    }
}
