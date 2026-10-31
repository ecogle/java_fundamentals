package phase1.control_flow;

import java.util.Scanner;
import phase1.CanStart;;

public class GradeCalculator implements CanStart {

    public GradeCalculator() {

        while (true) {

            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Input a numberic value to be assigned a grade: ");
                var num = scanner.nextInt();

                break;
            }
        }

    }

    public void Start() {

    }
}
