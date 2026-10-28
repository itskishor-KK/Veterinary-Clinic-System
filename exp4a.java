import java.util.Scanner;

class Animal {

    String name;
    int age;

    Animal(String n, int a) {
        name = n;
        age = a;
    }

    void displayAnimal() {
        System.out.println("Pet Name : " + name);
        System.out.println("Age      : " + age);
    }
}

class Patient extends Animal {

    String issue;

    Patient(String n, int a, String i) {
        super(n, a);
        issue = i;
    }

    void displayPatient() {
        System.out.println("Health Issue : " + issue);

        if (age >= 5) {
            System.out.println("Category     : Senior Pet");
        } else {
            System.out.println("Category     : Young Pet");
        }
    }
}

public class exp4a {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pet Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Health Issue: ");
        String issue = sc.nextLine();

        Patient p = new Patient(name, age, issue);

        System.out.println("\n===== VETERINARY CLINIC =====");

        p.displayAnimal();
        p.displayPatient();

        sc.close();
    }
}