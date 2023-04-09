import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // read the number of elements from the user
        int[] arr = new int[n]; // create an array of size n
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // read the ith element of the array from the user
        }
        int min = findMin(arr, n); // find the minimum element in the array using the findMin() function
        System.out.println(min); // print the minimum element
    }

    public static int findMin(int[] arr, int n) { // a function to find the minimum element in an array
        int min = arr[0]; // assume the first element is the minimum
        for (int i = 1; i < n; i++) { // loop through the array from the second element
            if (arr[i] < min) { // if the current element is smaller than the current minimum
                min = arr[i]; // update the current minimum to the current element
            }
        }
        return min; // return the minimum element
    }
}