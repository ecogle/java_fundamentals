package phase1.basics;

import java.util.Scanner;

/*
 * Given the length and the width
 */
public class QuadrilateralAreaCalc {

	private double length;
	private double width;

	@SuppressWarnings("unused")
	private QuadrilateralAreaCalc() {

	}

	public QuadrilateralAreaCalc(double length, double width) {
		this.length = length;
		this.width = width;

	}

	public static void run() {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Input length: ");
			double length = scanner.nextDouble();
			System.out.print("Input width: ");
			double width = scanner.nextDouble();

			QuadrilateralAreaCalc calc = new QuadrilateralAreaCalc(length, width);

			System.out.println("\nArea is " + calc.GetArea() + "\nPerimeter is: " + calc.GetPerimeter());
		}
	}

	public double GetArea() {

		return Math.round(this.length * this.width * 100.0) / 100.0;

	}

	public double GetPerimeter() {

		return Math.round((this.length + this.width) * 2.0 * 100.0) / 100.0;

	}

}
