import java.util.Scanner;

class Animal {

    private String name;
    private int age;

    Animal(String n, int a) {
        name = n;
        age = a;
    }

    public void show() {
        System.out.println("The pet name: " + name);
        System.out.println("The pet age: " + age);
    }
}

class Dog extends Animal {

    private String healthIssue;

    Dog(String n, int a, String issue) {
        super(n, a);
        healthIssue = issue;
    }

    // Method Overriding
    @Override
    public void show() {

        super.show();

        System.out.println("Health issue: " + healthIssue);
        System.out.println("This method is overridden in Dog class.");
    }
}

public class exp5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        System.out.print("Enter pet age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter health issue: ");
        String issue = sc.nextLine();

        Dog d = new Dog(name, age, issue);

        System.out.println("\n===== VETERINARY CLINIC =====");

        d.show();

        sc.close();
    }
}