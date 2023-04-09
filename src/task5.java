import java.util.Scanner;

public class DigitCheck {
    public static boolean check(String s) {
        return s.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (check(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
