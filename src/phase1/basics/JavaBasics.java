/**
 * 
 */
package phase1.basics;

import java.util.Scanner;

/**
 * 
 */
public class JavaBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalInfo();
	}
	
	public static void PersonalInfo() {
		
		var message = """
				Select an option:
				1. Add a person
				2. Print People
				X to Exit
				""";
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println(message);
			
			String choice = scanner.next();
			
			if (choice.equalsIgnoreCase("x")) {
				System.out.println("program exit 0");
				break;
			}
			
			switch (choice){
			
			case "1":
				AddPerson(scanner);
				break;
			case "2":
				System.out.println("Option 2 selected");
				break;
			default:
				System.out.println("Invalid input");
				
			}
		}
		
		
		
//		var demo = new DemoStorage();
//		
//		demo.AddPerson(new Person("Chad", 54, 6,4, "Grey"));
//		demo.AddPerson(new Person("Ashley",43,265,"Blue"));
//		
//		demo.PrintPeople(demo);
		
	}
	
	public static void AddPerson(Scanner scanner) {
		
		
		System.out.print("Name: ");
		String name = scanner.next();
		System.out.print("Age: ");
		int age = Integer.parseInt(scanner.next());
		System.out.print("Height: ");
		String height = scanner.next();
		
		
		
	}

}
