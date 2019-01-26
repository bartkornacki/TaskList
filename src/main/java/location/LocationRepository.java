package location;
import java.util.*;
import location.model.*;
// Singleton
public class LocationRepository {

    //Instancja Singletona
    private static LocationRepository instance = null;

    //Zmienne Singletina ....
    private Map<Integer,Location> locations;

    //Singleton musi mieć prywatny konstruktor
    private LocationRepository() {
        locations = new HashMap<>();
        locations.put(1,new Location(1,"Łódź","90-500","Rudzka","9"));
        locations.put(2,new Location(2,"Łódź","90-550","Brzeska","19"));
        locations.put(3,new Location(3,"Łódź","90-590","Zielona","23"));
        locations.put(4,new Location(4,"Łódź","90-570","Wschodnia","32"));
    }

    //Pobranie oaz inicjalizacja instancji Singletona
    //Klient(jakaś klasa) sama nie może utworzyć obiekty poprzez new
    public static LocationRepository getInstance(){
        if (instance == null) {
            synchronized (LocationRepository.class) {
                if (instance == null) {
                    instance = new LocationRepository();
                }
            }
        }
        return instance;
    }

    public void addLocation (Location location) {
        locations.put(location.getId(), location);
    }

    public void deleteLocation(Location location) {
        locations.remove(location.getId());
    }

    public Location findById (int id) {
        return locations.get(id);
    }

}
