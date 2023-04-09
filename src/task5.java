import java.util.Scanner; 

public class DigitCheck {
    public static boolean check(String s) {
        
        return s.matches("\\d+"); // The regular expression \d+ matches one or more digits
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a new Scanner object to read input from the user
        String s = scanner.nextLine(); // Read the input string from the user

        if (check(s)) { // Check if the input string consists of only digits
            System.out.println("Yes"); // Print "Yes" if it consists of only digits
        } else {
            System.out.println("No"); // Print "No" if it does not consist of only digits
        }

        scanner.close(); // Close the Scanner object to release any system resources associated with it
    }
}
