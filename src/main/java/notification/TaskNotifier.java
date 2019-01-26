package notification;

//Subject - Implementacje tej klasy będą notyfikować obserwatorów
public interface TaskNotifier {

    void registerObserver(Observer o);

    void unregisterObserver(Observer o);

    void notifyObservers();

}
