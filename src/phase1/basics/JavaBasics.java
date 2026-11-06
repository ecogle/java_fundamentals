/**
 * 
 */
package phase1.basics;

import phase1.database.Demo;

/**
 * 
 */
public class JavaBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PersonalInfo();
		// ConvertTemp();
		// QuadrilateralMeasurements();
		// ConvertTemp();
		// TipCalculator();
		// OddEven();
		Demo.listActors().stream().forEach((d) -> System.out.println(d));
	}

	public static void PersonalInfo() {

		var demo = new DemoStorage();

		demo.AddPerson(new Person("Chad", 54, 6, 4, "Grey"));
		demo.AddPerson(new Person("Ashley", 43, 265, "Blue"));

		demo.PrintPeople(demo);

	}

	public static void ConvertTemp() {
		TempConverter.run();
	}

	public static void QuadrilateralMeasurements() {
		QuadrilateralAreaCalc.run();
	}

	public static void TipCalculator() {
		phase1.basics.TipCalculator.run();
	}

	public static void OddEven() {
		phase1.control_flow.OddEven.run();
	}

}
