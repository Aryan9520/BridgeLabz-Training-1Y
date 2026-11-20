import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static int generateGuess(int low, int high, Random rand) {
        return low + rand.nextInt(high - low + 1);
    }

    public static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.nextLine().toLowerCase();
    }

    public static int[] determineNextRange(int guess, String feedback, int low, int high) {
        if (feedback.equals("high")) {
            high = guess - 1;
        } else if (feedback.equals("low")) {
            low = guess + 1;
        }
        return new int[]{low, high};
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int low = 1;
        int high = 100;
        int attempts = 0;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (true) {
            if (low > high) {
                System.out.println("Inconsistent feedback. Game over.");
                break;
            }

            int guess = generateGuess(low, high, rand);
            attempts++;
            System.out.println("Computer's guess: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number in " + attempts + " attempts.");
                break;
            } else if (feedback.equals("high") || feedback.equals("low")) {
                int[] range = determineNextRange(guess, feedback, low, high);
                low = range[0];
                high = range[1];
            } else {
                System.out.println("Invalid feedback. Please enter high, low, or correct.");
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        playGame();
    }
}
