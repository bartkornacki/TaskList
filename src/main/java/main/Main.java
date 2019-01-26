package main;

import employee.Employee;
import employee.EmployeeFactory;
import employee.EmployeeType;
import location.LocationRepository;
import notification.NotificationDTO;
import notification.TaskNotifierService;
import notification.TaskNotifier;
import notification.strategy.NotificationSortASCStrategy;
import notification.strategy.NotificationSortStrategy;
import notification.strategy.NotificationSortStrategyFactory;
import notification.strategy.NotificationSortStrategyType;
import task.model.Priority;
import task.model.Status;
import task.model.Task;

import java.util.*;

import javax.naming.OperationNotSupportedException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws OperationNotSupportedException {
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
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Task task3 = new Task.TaskBuilder(2,"Instalacja")
                .withDescription("Sprawdzenie uprawnień")
                .withLocation((locationRepository.findById(3)))
                .withCreateUserExternalId(dispatcher.getExternalId())
                .build();

        notifierService.notifyObservers();

        System.out.println("After second task created");
        technican1.printNotification();

        NotificationSortStrategyFactory notificationSortStrategyFactory = new NotificationSortStrategyFactory();

        /*try {
            technican1.setNotification(notificationSortStrategyFactory
                    .getStrategy(NotificationSortStrategyType.DESCENDING)
                    .sort(technican1.getNotification()));

            technican1.printNotification();
        } catch (OperationNotSupportedException e) {
            e.printStackTrace();
        }*/

        //Pobranie strategii sortowania na podstawie typu sortowania
        NotificationSortStrategy strategy =
                notificationSortStrategyFactory
                        .getStrategy(NotificationSortStrategyType.ASCENDING);

        //Użycie algorytmu sortowania z pobranej strategii
        List<NotificationDTO> sortedList =
                strategy.sort(technican1.getNotification());

        technican1.setNotification(sortedList);



    }
}
