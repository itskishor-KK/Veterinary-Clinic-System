
package clinic;

import java.util.Scanner;

public class Patient {

    String patientId;
    String petName;
    String species;
    int age;
    String ownerName;

    public void input() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Patient ID:");
        patientId = sc.nextLine();

        System.out.println("Enter Pet Name:");
        petName = sc.nextLine();

        System.out.println("Enter Species:");
        species = sc.nextLine();

        System.out.println("Enter Age:");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Owner Name:");
        ownerName = sc.nextLine();
        
    }

    public void display() {

        System.out.println("===================================");
        System.out.println(" VETERINARY CLINIC PATIENT DETAILS ");
        System.out.println("===================================");
        System.out.println("Patient ID : " + patientId);
        System.out.println("Pet Name : " + petName);
        System.out.println("Species : " + species);
        System.out.println("Age : " + age);
        System.out.println("Owner Name : " + ownerName);
    }
}