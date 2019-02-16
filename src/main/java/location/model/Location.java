package location.model;

public class Location {

    private static int counter = 1;
    private int id;
    private String city;
    private String postalCode;
    private String street;
    private String streetNo;

    public Location(String city, String postalCode, String street, String streetNo) {
        this.id = counter++;
        this.id = id;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.streetNo = streetNo;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }
}
