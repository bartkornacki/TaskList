package employee;

import java.time.LocalDateTime;

public class Dispatcher extends Employee{

    public Dispatcher(String fullName) {
       super(fullName, EmployeeType.DISPATCHER);
    }

    @Override
    public void update() {
        notifications.add(LocalDateTime.now() + " " + "New task has been created");
    }
}
