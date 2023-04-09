import java.util.Scanner;
public class task2{

    // Function to calculate the average of an array of n elements
    public static double calculateAverage(int[] arr, int n) {
        int sum = 0;
        // loop through the array and add up all the elements
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        // calculate the average by dividing the sum by n and return it
        double avg = (double) sum / n;
        return avg;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prompt the user to enter the value of n
        int n = scanner.nextInt();
        // create an array of size n to hold the elements
        int[] arr = new int[n];
        // loop through the array and prompt the user to enter the elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // call the calculateAverage function with the array and n as arguments
        double avg = calculateAverage(arr, n);
        // print the average to the console
        System.out.println(avg);
    }
}