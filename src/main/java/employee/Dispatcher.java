package employee;

import notification.NotificationDTO;

public class Dispatcher extends Employee {
    public Dispatcher(int id, String fullName, String externalId, EmployeeType employeeType) {
        super(id, fullName, externalId, employeeType);
    }

    @Override
    public void update(NotificationDTO notificationDTO) {

    }
}
