package employee;

import notification.NotificationDTO;
import notification.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee implements Observer {
    private int id;
    private String fullName;
    private final String externalId;
    private EmployeeType employeeType;
    protected List<NotificationDTO> notification;

    public Employee(int id, String fullName, String externalId, EmployeeType employeeType) {
        this.id = id;
        this.fullName = fullName;
        this.externalId = externalId;
        this.employeeType = employeeType;
        notification = new ArrayList<>();
    }

    public List<NotificationDTO> getNotification() {
        return notification;
    }

    public void setNotification(List<NotificationDTO> notification) {
        this.notification = notification;
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


    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public void printNotification(){
        notification.forEach(s -> System.out.println(s));
    }

}
