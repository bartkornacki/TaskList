package task;

import java.util.ArrayList;
import java.util.List;

public class TaskNotifierImp implements TaskNotifier {
    List<Observer> observers;

    public TaskNotifierImp() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisteredObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifiedObservers() {
        observers.forEach(observer -> observer.update());
    }
}
