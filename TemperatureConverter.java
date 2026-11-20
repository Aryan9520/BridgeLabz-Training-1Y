import java.util.Scanner;

public class TemperatureConverter {

    public static int getChoice(Scanner sc) {
        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        return sc.nextInt();
    }

    public static double takeTemperature(Scanner sc) {
        System.out.print("Enter temperature value: ");
        return sc.nextDouble();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void displayResult(int choice, double inputTemp, double convertedTemp) {
        if (choice == 1) {
            System.out.println(inputTemp + " Fahrenheit = " + convertedTemp + " Celsius");
        } else if (choice == 2) {
            System.out.println(inputTemp + " Celsius = " + convertedTemp + " Fahrenheit");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = getChoice(sc);
        double temperature = takeTemperature(sc);
        double result = 0;

        if (choice == 1) {
            result = fahrenheitToCelsius(temperature);
        } else if (choice == 2) {
            result = celsiusToFahrenheit(temperature);
        }

        displayResult(choice, temperature, result);

        sc.close();
    }
}
