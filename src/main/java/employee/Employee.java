package employee;

import task.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements Observer {
    private String fullName;
    private EmployeeType employeeType;
    private int id;
    private static int counter = 1;
    protected List<String> notifications;

    public Employee(String fullName, EmployeeType employeeType) {
        this.id = counter++;
        this.fullName = fullName;
        this.employeeType = employeeType;
        this.notifications = new ArrayList<>();
    }

    public void printNotifications() {
        System.out.println(notifications);
    }

    public String getFullName() {
        return fullName;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public List<String> getNotifications() {
        return notifications;
    }
}
