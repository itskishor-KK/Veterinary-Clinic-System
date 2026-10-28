import java.util.Scanner;

// Interface
interface treatmentApproval {
    void approveTreatment(int choice);
}

// Parent Class
class animal {

    String petName, patientId;

    Animal(String petName, String patientId) {
        this.petName = petName;
        this.patientId = patientId;
    }

    void displayDetails() {
        System.out.println("\n========== VETERINARY CLINIC ==========");
        System.out.println("Pet Name    : " + petName);
        System.out.println("Patient ID  : " + patientId);
    }
}

// Child Class
class patient extends animal {

    patient(String petName, String patientId) {
        super(petName, patientId);
    }
}

// Grandchild Class (Implements Interface)
class Approval extends Patient implements treatmentApproval {

    Approval(String petName, String patientId) {
        super(petName, patientId);
    }

    // Interface Method
    public void approveTreatment(int choice) {

        displayDetails();

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
public class exp6b {

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

        treatmentApproval approval =
                new Approval(petName, patientId);

        approval.approveTreatment(choice);

        sc.close();
    }
}