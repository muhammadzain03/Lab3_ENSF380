package ca.ucalgary.ensf380;

public abstract class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;
    private static int lastPersonalNumber;

    public Person(String name, String phoneNumber, String emailAddress, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        lastPersonalNumber++;
    }

    public static String nextPersonalNumber(short type) {
        return String.valueOf(lastPersonalNumber) + type;
    }

    public boolean hasValidAddress() {
        return address.validate();
    }

    @Override
    public String toString() {
        return name + ", " + phoneNumber + ", " + emailAddress + ", " + address.outputAsLabel();
    }
}
