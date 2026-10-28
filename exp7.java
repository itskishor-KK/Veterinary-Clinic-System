import clinic.Patient;
import clinic.Treatment;
import java.util.Scanner;
public class exp7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient p = new Patient();
        Treatment t = new Treatment();

        // Patient details
        p.input();

        // Treatment details
        System.out.println("Enter Consultation Fee:");
        double consultation = sc.nextDouble();

        System.out.println("Enter Medicine Fee:");
        double medicine = sc.nextDouble();

        // Calculate bill
        t.calculate(consultation, medicine);

        // Display patient details
        p.display();

        // Display bill
        System.out.println("\n===== TREATMENT BILL =====");
        t.displayBill();
        sc.close();
    }
}