package main;

import employee.*;
import location.model.LocationDAO;
import task.model.Priority;
import task.model.Status;
import task.model.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocationDAO locationDAO = LocationDAO.getInstance();
        EmployeeFactory employeeFactory = new EmployeeFactory();

        Employee technicianOne = employeeFactory
                .create(EmployeeType.TECHNICIAN, "Jan Kowalski");
        Employee technicianTwo = employeeFactory
                .create(EmployeeType.TECHNICIAN, "Piotr Okrasa");

        Employee dispatcherOne =
                employeeFactory.create(EmployeeType.DISPATCHER, "Anna Nowak");
        Employee dispatcherTwo =
                employeeFactory.create(EmployeeType.DISPATCHER, "Piotr Kowal");



        Task taskOne = new Task.TaskBuilder("Title no 1").build();
        Task taskTwo = new Task.TaskBuilder("Title no 2")
                .withLocation(locationDAO.getLocations().get(1))
                .withDescription("Random description")
                .withStatus(Status.OPEN)
                .withDueDate(LocalDate.of(2019, 02, 19))
                .build();
        Task taskThree = new Task.TaskBuilder("Title no 3")
                .withStatus(Status.OPEN)
                .withCreateDate(LocalDate.now())
                .withDueDate(LocalDate.of(2019, 10, 31))
                .build();
    }
}
