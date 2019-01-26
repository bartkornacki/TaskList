package main;

import employee.Employee;
import employee.EmployeeFactory;
import employee.EmployeeType;
import location.LocationRepository;
import notification.TaskNotifierService;
import notification.TaskNotifier;
import task.model.Priority;
import task.model.Status;
import task.model.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        EmployeeFactory employeeFactory = new EmployeeFactory();

        LocationRepository locationRepository = LocationRepository.getInstance();
        TaskNotifier notifierService = new TaskNotifierService();


        Employee technican1 = employeeFactory.create(EmployeeType.TECHNICAN,1,"Jan Kowalski"
               ,"1234");

        Employee technican2 = employeeFactory.create(EmployeeType.TECHNICAN,1,
                "Adam Kowalski"
                ,"1559");
        Employee dispatcher = employeeFactory.create(EmployeeType.DISPATCHER,1,
                "Krystyna Nowak"
                ,"15999");

        notifierService.registerObserver(technican1);
        notifierService.registerObserver(technican2);


        technican1.printNotification();


        Task task2 = new Task.TaskBuilder(1,"Naprawa Usterki")
                .withDueDate(LocalDate.now().plusDays(5))
                .withPriority(Priority.MEDIUM)
                .withSummary(":)")
                .withLocation(locationRepository.findById(1))
                .withStatus(Status.OPEN)
                .withCreateUserExternalId(dispatcher.getExternalId())
                .build();

        notifierService.notifyObservers();


        System.out.println("After task created");
        technican1.printNotification();

        task2.setAssignedUserExternalId(technican1.getExternalId());

        Task task3 = new Task.TaskBuilder(2,"Instalacja")
                .withDescription("Sprawdzenie uprawnień")
                .withLocation((locationRepository.findById(3)))
                .withCreateUserExternalId(dispatcher.getExternalId())
                .build();






    }
}
