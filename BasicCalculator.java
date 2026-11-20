import java.util.Scanner;

public class BasicCalculator {

    public static int getChoice(Scanner sc) {
        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        return sc.nextInt();
    }

    public static double[] takeNumbers(Scanner sc) {
        double[] nums = new double[2];
        System.out.print("Enter first number: ");
        nums[0] = sc.nextDouble();
        System.out.print("Enter second number: ");
        nums[1] = sc.nextDouble();
        return nums;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public st
