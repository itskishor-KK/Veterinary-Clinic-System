import java.util.Scanner;

class Animal {

    String name;

    Animal(String n) {
        name = n;
    }

    void displayAnimal() {
        System.out.println("Pet Name : " + name);
    }
}

class Patient extends Animal {

    String issue;

    Patient(String n, String i) {
        super(n);
        issue = i;
    }

    void displayPatient() {
        System.out.println("Health Issue : " + issue);
    }
}

class Treatment extends Patient {

    String medicine;

    Treatment(String n, String i, String m) {
        super(n, i);
        medicine = m;
    }

    void displayTreatment() {
        System.out.println("Medicine : " + medicine);

        System.out.println("Medicine Schedule:");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Dose " + i);
        }
    }
}

public class exp4b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pet Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Health Issue: ");
        String issue = sc.nextLine();

        System.out.print("Enter Medicine: ");
        String medicine = sc.nextLine();

        Treatment t = new Treatment(name, issue, medicine);

        System.out.println("\n===== VETERINARY CLINIC =====");

        t.displayAnimal();
        t.displayPatient();
        t.displayTreatment();

        sc.close();
    }
}