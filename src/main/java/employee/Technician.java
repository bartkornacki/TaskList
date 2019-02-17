package employee;

import java.time.LocalDateTime;

public class Technician extends Employee {

    public Technician(String fullName) {
        super(fullName, EmployeeType.TECHNICIAN);
    }

    @Override
    public void update() {
        notifications.add(LocalDateTime.now() + " " + "New task has been created");
    }
}
