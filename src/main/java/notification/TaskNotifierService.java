package notification;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//Klasa przechowuje obserwatorów oraz notyfikuje ich
public class TaskNotifierService implements TaskNotifier {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(new NotificationDTO(LocalDateTime.now(),
                    "New task has been created"));
        }
    }
}
