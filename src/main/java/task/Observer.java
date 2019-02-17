package task;

/**
 * Wzorzec Observer.
 * Interfejs Observer reprezentuje obiekty, które są zapisane na subskrycje
 */
public interface Observer {
    /**
     * Metoda update jest wykonana na obiekcie A (który jest zapisany na subskycje)
     * po zajściu zdarzenia w obiekcie B
     */
    void update();
}
