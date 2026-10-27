/**
 * 
 */
package phase1.basics;

/**
 * 
 */
public class JavaBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PersonalInfo();
		//ConvertTemp();
		QuadrilateralMeasuments();
	}
	
	public static void PersonalInfo() {
		
		var demo = new DemoStorage();
		
		demo.AddPerson(new Person("Chad", 54, 6,4, "Grey"));
		demo.AddPerson(new Person("Ashley",43,265,"Blue"));
		
		demo.PrintPeople(demo);
		
	}
	
	public static void ConvertTemp() {
		
		String temp;
		String type;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter temp: ");
			temp = scanner.next();
			System.out.print("Enter Type (F or C): ");
			type = scanner.next();
		}
		TempConverter tc = new TempConverter(Double.parseDouble(temp),type);
		
		System.out.println(temp + " in " + type + " is: " + tc.convertTemp());
		
	}
	
	public static void QuadrilateralMeasuments() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input length: ");
		double length = scanner.nextDouble();
		System.out.print("Input width: ");
		double width = scanner.nextDouble();
		
		QuadrilateralAreaCalc calc = new QuadrilateralAreaCalc(length, width);
		
		System.out.println("\nArea is " + calc.GetArea() + "\nPerimeter is: " + calc.GetPerimeter());
	}

}
