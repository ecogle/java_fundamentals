package phase1.control_flow;

import java.util.Scanner;

public class OddEven {

    public static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number to determine Odd or Even: ");
            int num = scanner.nextInt();
            System.out.println("The number " + num + " is " + isOdd(num));
        }
    }

    public static String isOdd(int number) {
        return ((number % 2) == 0) ? "Even" : "Odd";
    }
}
