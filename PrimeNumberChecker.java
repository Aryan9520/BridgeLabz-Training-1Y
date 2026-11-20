import java.util.Scanner;

public class PrimeNumberChecker {

    public static int takeInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void displayResult(int number, boolean result) {
        if (result) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = takeInput(sc);
        boolean result = isPrime(number);
        displayResult(number, result);

        sc.close();
    }
}
