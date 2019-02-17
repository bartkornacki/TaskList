package main;

import location.model.LocationDAO;
import task.model.Priority;
import task.model.Status;
import task.model.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocationDAO locationDAO = LocationDAO.getInstance();

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
