import java.util.Scanner;
import java.util.InputMismatchException;

// User-defined Exception
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class exp8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Pet Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Pet Age: ");
            int age = sc.nextInt();

            if (age <= 0) {
                throw new InvalidAgeException( "Pet age must be greater than 0.");
            }

            System.out.println("\n===== VETERINARY CLINIC =====");
            System.out.println("Pet Name : " + name);
            System.out.println("Pet Age  : " + age);
            System.out.println("Patient registration successful.");

        } 
        catch (InvalidAgeException e) {

            System.out.println("User-defined Exception: "
                               + e.getMessage());

        } 
        catch (InputMismatchException e) {

            System.out.println("Predefined Exception: "
                               + "Please enter a valid age.");

        } 
        finally {

            System.out.println("Clinic process completed.");
        }

        sc.close();
    }
}