import java.util.Scanner;

public class Fibonacci {
    // Define a recursive function to compute the n-th element in the Fibonacci sequence
    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // The n-th element is the sum of the (n-1)th and (n-2)th elements
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        }
    }

    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // User to enter a number and read the input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Compute the n-th element in the Fibonacci sequence using the recursive function
        int fibonacciNumber = fibonacciRecursive(n);
        
        // Print the result to the console
        System.out.println(fibonacciNumber);
        
        // Close the Scanner object to release any resources it was using
        scanner.close();
    }
}
