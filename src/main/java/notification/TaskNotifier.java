package notification;

//Subject
public interface TaskNotifier {

    void registerObserver(Observer o);

    void unregisterObserver(Observer o);

    void notifyObservers();

}
