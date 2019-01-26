package main;

import employee.Employee;
import employee.EmployeeFactory;
import employee.EmployeeType;
import employee.Technican;
import location.LocationRepository;
import location.model.Location;
import task.model.Priority;
import task.model.Skill;
import task.model.Status;
import task.model.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        EmployeeFactory employeeFactory = new EmployeeFactory();

        LocationRepository locationRepository = LocationRepository.getInstance();

        Employee technican1 = employeeFactory.create(EmployeeType.TECHNICAN,1,"Jan Kowalski"
               ,"1234");

        Employee technican2 = employeeFactory.create(EmployeeType.TECHNICAN,1,
                "Adam Kowalski"
                ,"1559");
        Employee dispatcher = employeeFactory.create(EmployeeType.DISPATCHER,1,
                "Krystyna Nowak"
                ,"15999");

        Task task2 = new Task.TaskBuilder(1,"Naprawa Usterki")
                .withDueDate(LocalDate.now().plusDays(5))
                .withPriority(Priority.MEDIUM)
                .withSummary(":)")
                .withLocation(locationRepository.findById(1))
                .withStatus(Status.OPEN)
                .withCreateUserExternalId(dispatcher.getExternalId())
                .build();

        task2.setAssignedUserExternalId(technican1.getExternalId());

        Task task3 = new Task.TaskBuilder(2,"Instalacja")
                .withDescription("Sprawdzenie uprawnień")
                .withLocation((locationRepository.findById(3)))
                .withCreateUserExternalId(dispatcher.getExternalId())
                .build();






    }
}
