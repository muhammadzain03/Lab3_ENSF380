package ca.ucalgary.ensf380;

public class Professor extends Person {
    private String teacherNumber;
    private double salary;

    public Professor(String name, String phoneNumber, String emailAddress, Address address, String teacherNumber, double salary) {
        super(name, phoneNumber, emailAddress, address);
        this.teacherNumber = teacherNumber;
        this.salary = salary;
    }

    public String getName() {
        return super.toString().split(", ")[0]; // Return only the name part
    }

    @Override
    public String toString() {
        return super.toString() + ", Teacher Number: " + teacherNumber + ", Salary: " + salary;
    }
}
