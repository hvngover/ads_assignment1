import java.util.Scanner; // import the Scanner class from the java.util package to read input

public class task3 { // declare a class named Main

    public static void main(String[] args) { // declare a main method, which is the entry point of the program
        Scanner scanner = new Scanner(System.in); // create a new Scanner object to read input
        int n = scanner.nextInt(); // read an integer input entered by the user and assign it to the variable n
        System.out.println(check(n)); // call the check method with the argument n and print its result to standard output
    }

    public static String check(int n) { // declare a static method named check, which checks if the number n is prime or composite
        if (n%2==0) { // if n is even, it is composite
            return "Composite";
        } else { // otherwise, check if n is divisible by any odd number greater than 1
            return "Prime";
        }
        // if n is not divisible by any odd number greater than 1, it is prime
    }
}
}