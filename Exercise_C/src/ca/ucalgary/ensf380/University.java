package ca.ucalgary.ensf380;

public class University {
    public static void main(String[] args) {
        // Create two Address instances
        Address address1 = new Address("123 Main St", "Calgary", "AB", "T2N 1N4", "Canada");
        Address address2 = new Address("456 Maple Ave", "Edmonton", "AB", "T5J 3K4", "Canada");

        // Create a Professor instance using address1
        Professor profSmith = new Professor("John Smith", "403-123-4567", "jsmith@ucalgary.ca", address1, "P123", 90000.00);

        // Create two Student instances using address2 and assign profSmith as their supervisor
        Student student1 = new Student("Alice Johnson", "403-234-5678", "alice.johnson@ucalgary.ca", address2, "S12345", profSmith, 85.0);
        Student student2 = new Student("Bob Williams", "403-345-6789", "bob.williams@ucalgary.ca", address2, "S67890", profSmith, 75.0);

        // Print out the details of the professor and students
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Details of the Professor and Students:");
        System.out.println(profSmith);
        System.out.println();

        System.out.println("Student 01:");
        System.out.println(student1);
        System.out.println();

        System.out.println("Student 02:");
        System.out.println(student2);
        System.out.println();

        // Check and print if the students are eligible to enroll based on their average marks
        System.out.println("Check if the Students are eligible to enroll:");
        System.out.println("Is student 01 eligible to enroll? " + student1.isEligibleToEnroll());
        System.out.println("Is student 02 eligible to enroll? " + student2.isEligibleToEnroll());
        System.out.println();

        // Validate and print the addresses
        System.out.println("Validating the addresses:");
        System.out.println("Address 1 is valid: " + address1.validate());
        System.out.println("Address 2 is valid: " + address2.validate());
        System.out.println();

        // Check and print if the professor and students have valid addresses
        System.out.println("Checking if the Professor and Students have valid addresses:");
        System.out.println("Professor has valid address: " + profSmith.hasValidAddress());
        System.out.println("Student1 has valid address: " + student1.hasValidAddress());
        System.out.println("Student2 has valid address: " + student2.hasValidAddress());
    }
}
