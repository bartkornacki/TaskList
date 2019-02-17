package task;

/**
 * Wzorzec Observer.
 * Interfejs TaskNotifier pełni rolę powiadamiacza obserwatorów
 */
public interface TaskNotifier {

    /**
     * Metoda registerObserver rejestruje obserwatorów na listę subskrybentów
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * Metoda unregisteredObserver usuwa obserwatorów z listy subskrybentów
     * @param observer
     */
    void unregisteredObserver(Observer observer);

    /**
     * Celem metody notifiedObservers jest wywołanie metody update dla wszystkich subskybentów
     * @see Observer#update()
     */
    void notifiedObservers();
}
