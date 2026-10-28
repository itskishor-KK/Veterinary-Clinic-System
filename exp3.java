import java.util.Scanner;

class Records {

    String patientId;
    String petName;
    String species;
    String breed;
    int age;
    String ownerName;
    String healthIssue;

    void getDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID      : ");
        patientId = sc.nextLine();

        System.out.print("Enter Pet Name        : ");
        petName = sc.nextLine();

        System.out.print("Enter Species         : ");
        species = sc.nextLine();

        System.out.print("Enter Breed           : ");
        breed = sc.nextLine();

        System.out.print("Enter Age             : ");
        age = sc.nextInt();
        sc.nextLine(); // Clears the input buffer

        System.out.print("Enter Owner Name      : ");
        ownerName = sc.nextLine();

        System.out.print("Enter Health Issue    : ");
        healthIssue = sc.nextLine();
        sc.close();
    }

    void display() {

        System.out.println("\n===== VETERINARY CLINIC PATIENT DETAILS =====");

        System.out.println("Patient ID    : " + patientId);
        System.out.println("Pet Name      : " + petName);
        System.out.println("Species       : " + species);
        System.out.println("Breed         : " + breed);
        System.out.println("Age           : " + age);
        System.out.println("Owner Name    : " + ownerName);
        System.out.println("Health Issue  : " + healthIssue);
    }
}

public class exp3 {

    public static void main(String[] args) {

        Records patient = new Records();

        patient.getDetails();

        patient.display();
    }
}
