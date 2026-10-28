import java.util.Scanner;

// Abstract Class
abstract class animal {

    String petName, patientId;

    animal(String petName, String patientId) {
        this.petName = petName;
        this.patientId = patientId;
    }

    void displayDetails() {
        System.out.println("\n========== VETERINARY CLINIC ==========");
        System.out.println("Pet Name    : " + petName);
        System.out.println("Patient ID  : " + patientId);
    }

    // Abstract Method
    abstract void treatment(int choice);
}

// Child Class
class treatment extends animal {

    treatment(String petName, String patientId) {
        super(petName, patientId);
    }

    // Implementing Abstract Method
    @Override
    void treatment(int choice) {

        switch (choice) {

            case 1:
                System.out.println("Treatment   : General Checkup");
                break;

            case 2:
                System.out.println("Treatment   : Vaccination");
                break;

            case 3:
                System.out.println("Treatment   : Dental Care");
                break;

            case 4:
                System.out.println("Treatment   : Skin Allergy");
                break;

            case 5:
                System.out.println("Treatment   : Emergency Care");
                break;

            default:
                System.out.println("Invalid Choice!");
                return;
        }

        System.out.println("Status      : Approved");
        System.out.println("Approved By : Veterinarian");
    }
}

// Main Class
public class exp6a {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pet Name   : ");
        String petName = sc.nextLine();

        System.out.print("Enter Patient ID : ");
        String patientId = sc.nextLine();

        System.out.println("\nSelect Treatment");
        System.out.println("1. General Checkup");
        System.out.println("2. Vaccination");
        System.out.println("3. Dental Care");
        System.out.println("4. Skin Allergy");
        System.out.println("5. Emergency Care");
        System.out.print("Enter Choice : ");
        int choice = sc.nextInt();

        animal patient = new treatment(petName, patientId);

        patient.displayDetails();
        patient.treatment(choice);

        sc.close();
    }
}