package phase1.basics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TipCalculator {

	public static void run() {
		var tipCalc = new TipCalculator();
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter bill amount: ");
			double billAmount = scanner.nextDouble();
			System.out.print("Enter tip percentage: ");
			double tipPercentage = scanner.nextDouble();

			System.out.println("The total amount is: $" + tipCalc.calculateTip(billAmount, tipPercentage));
		}
	}

	public String calculateTip(double billAmount, double tipPercentage) {

		BigDecimal bill = BigDecimal.valueOf(billAmount);
		BigDecimal tip = bill.multiply(BigDecimal.valueOf(tipPercentage))
				.divide(BigDecimal.valueOf(100));

		BigDecimal total = bill.add(tip)
				.setScale(2, RoundingMode.HALF_UP);

		return total.toString();
	}

}
