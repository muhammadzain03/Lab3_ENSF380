package ca.ucalgary.ensf380;

public class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public boolean validate() {
        // Implement your validation logic here
        return street != null && city != null && state != null && postalCode != null && country != null;
    }

    public String outputAsLabel() {
        return street + ", " + city + ", " + state + ", " + postalCode + ", " + country;
    }
}
