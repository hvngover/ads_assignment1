import java.util.Scanner; 

public class Main { 

    public static void main(String[] args) { // declare a main method, which is the entry point of the program
        Scanner scanner = new Scanner(System.in); // create a new Scanner object to read input
        int a = scanner.nextInt(); // read the base number a entered by the user and assign it to the variable a
        int n = scanner.nextInt(); // read the power n entered by the user and assign it to the variable n
        int result = power(a, n); // call the power method with the arguments a and n and assign the result to the variable result
        System.out.println(result); // print the final result of the power function to standard output
    }

    public static int power(int a, int n) { // declare a static method named power, which computes a^n recursively
        if (n == 0) { // base case: a^0 = 1
            return 1;
        } else { // recursive case: a^n = a * a^(n-1)
            return a * power(a, n - 1);
        }
    }
}
