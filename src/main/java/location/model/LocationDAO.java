package location.model;

import com.sun.javafx.collections.MappingChange;

import java.util.*;
import location.model.*;

/**
 * Klasa pełniąca role Singletona
 */
public class LocationDAO {
    private Map<Integer,Location> locations;
    /**
     * Klasa Singleton, musi posiadać odniesienie do samej siebie
     */
    private static LocationDAO instance;

    /**
     * Klasa Singleton, musi posiadać prywatny konstruktor aby utworzenie było możliwe
     * tylko w klasie, która ma być singletonem
     */
    private LocationDAO() {
        locations = new HashMap<>();
        Location location1 = new Location("Lodz", "12-123",
                "Pomorska", "123");
        Location location2 = new Location("Radom", "22-123",
                "Nadmorska", "223");
        Location location3 = new Location("Sopot", "32-123",
                "Zamorska", "323");
        Location location4 = new Location("Gdynia", "42-123",
                "Morska", "423");

        locations.put(location1.getId(), location1);
        locations.put(location2.getId(), location2);
        locations.put(location3.getId(), location3);
        locations.put(location4.getId(), location4);
    }

    public Map<Integer, Location> getLocations() {
        return locations;
    }

    /**
     * Metoda, która ma za zadanie zainicjalizować obiekt LocationDAO.
     * Każde kolejne wywołanie zwróci istniejący byt
     * @return {@link LocationDAO}
     */
    public static LocationDAO getInstance() {
        if (instance == null){
            synchronized (LocationDAO.class){
                if(instance == null){
                    return new LocationDAO();
                }
            }
        }
        return instance;
    }
}
