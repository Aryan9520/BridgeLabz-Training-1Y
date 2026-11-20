import java.util.Scanner;

public class GCDLCMCalculator {

    public static int[] takeInput(Scanner sc) {
        int[] numbers = new int[2];

        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();

        return numbers;
    }

    public static int calculateGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calculateLCM(int a, int b) {
        int gcd = calculateGCD(a, b);
        if (gcd == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd;
    }

    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("Numbers: " + a + " and " + b);
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = takeInput(sc);
        int a = numbers[0];
        int b = numbers[1];

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b);

        displayResult(a, b, gcd, lcm);

        sc.close();
    }
}
