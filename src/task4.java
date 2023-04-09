import java.util.Scanner; 

public class Main {

    public static void main(String[] args) { // declare a main method, which is the entry point of the program
        Scanner scanner = new Scanner(System.in); // create a new Scanner object to read input
        int n = scanner.nextInt(); // read an integer input entered by the user and assign it to the variable n
        int factorial = factorial(n); // call the factorial method with the argument n and assign the result to the variable factorial
        System.out.println(factorial); // print the final result of the factorial function to standard output
    }

    public static int factorial(int n) { // declare a static method named factorial, which computes the factorial of the input argument n recursively
        if (n == 0) { // base case: the factorial of 0 is 1
            return 1;
        } else { // recursive case: n! = n * (n - 1)!
            return n * factorial(n - 1);
        }
    }
}
