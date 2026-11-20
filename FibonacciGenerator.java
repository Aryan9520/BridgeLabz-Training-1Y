import java.util.Scanner;

public class FibonacciGenerator {

    public static int takeInput(Scanner sc) {
        System.out.print("Enter the number of terms: ");
        return sc.nextInt();
    }

    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Invalid number of terms.");
            return;
        }

        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int terms = takeInput(sc);
        printFibonacci(terms);

        sc.close();
    }
}
