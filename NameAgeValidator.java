import java.util.Scanner;
public class NameAgeValidator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Name input validation
        if (name.trim().isEmpty()) {
            System.out.println("Invalid input. Name cannot be empty.");
            return;
        }

        // Add Reg Ex to your program to make sure that the name only contains letters (a-z).
        if (!name.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid input. Name can only contain letters and spaces.");
            return;
        }

        // Ask user for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Age input validation
        if (age <= 0) {
            System.out.println("Invalid input. Age must be a positive number.");
            return;
        }

        // Add Reg Ex to your program to make sure that the age only contains digits (0-9).
        String ageStr = Integer.toString(age);
        if (!ageStr.matches("[0-9]+")) {
            System.out.println("Invalid input. Age must be a positive number.");
            return;
        }

    }

}
