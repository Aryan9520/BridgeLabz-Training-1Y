import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    System.out.println("Year is a Leap Year");
                } else {
                    if (year % 400 == 0) {
                        System.out.println("Year is a Leap Year");
                    } else {
                        System.out.println("Not a Leap Year");
                    }
                }
            } else {
                System.out.println("Not a Leap Year");
            }

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println("Using single if: Year is a Leap Year");
            } else {
                System.out.println("Using single if: Not a Leap Year");
            }
        } else {
            System.out.println("Year must be >= 1582");
        }

        sc.close();
    }
}
