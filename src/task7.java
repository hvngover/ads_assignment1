import java.util.Scanner;

public class task7 {

    // A recursive method that prints an array of n elements in reverse order
    public static void reverseArray(int[] arr, int n) {
        if (n == 0) { // Base case: if n is 0, do nothing and return
            return;
        } else { // Recursive case: print the last element and call the method with the rest of the array
            System.out.print(arr[n - 1] + " "); // Print the last element of the array
            reverseArray(arr, n - 1); // Call the method with the rest of the array (n-1 elements)
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the value of n and create an array of n elements
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the elements of the array from input
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the reverseArray method with the array and n as arguments
        reverseArray(arr, n);
    }
}