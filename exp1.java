class Patient {
    String patientId;
    String petName;
    String species;
    String breed;
    int age;
    String ownerName;
    String healthIssue;

    // Constructor
    Patient(String patientId, String petName, String species, String breed,
            int age, String ownerName, String healthIssue) {

        this.patientId = patientId;
        this.petName = petName;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.ownerName = ownerName;
        this.healthIssue = healthIssue;
    }

    // Method to display details
    void displayPatientDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Patient ID   : " + patientId);
        System.out.println("Pet Name     : " + petName);
        System.out.println("Species      : " + species);
        System.out.println("Breed        : " + breed);
        System.out.println("Age          : " + age);
        System.out.println("Owner Name   : " + ownerName);
        System.out.println("Health Issue : " + healthIssue);
    }
}

public class exp1 {
    public static void main(String[] args) {

        Patient p1 = new Patient(
                "V101",
                "Bruno",
                "Dog",
                "Labrador",
                4,
                "Arjun",
                "Fever");

        Patient p2 = new Patient(
                "V102",
                "Kitty",
                "Cat",
                "Persian",
                2,
                "Meena",
                "Skin Allergy");

        System.out.println("===== VETERINARY CLINIC SYSTEM =====");

        p1.displayPatientDetails();
        p2.displayPatientDetails();
    }
}