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
		PersonalInfo();
	}
	
	public static void PersonalInfo() {
		
		var demo = new DemoStorage();
		
		demo.AddPerson(new Person("Chad", 54, 6,4, "Grey"));
		demo.AddPerson(new Person("Ashley",43,265,"Blue"));
		
		demo.PrintPeople(demo);
		
	}

}
