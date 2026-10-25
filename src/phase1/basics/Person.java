package phase1.basics;

public class Person {

	private String name;
	private int age;
	private Height height;
	private String FavColor;
	
	private Person() {}
	
	public Person(String name,int age, int feet, int inches, String FavColor) {
		this.name = name;
		this.age = age;
		this.height = new Height(feet,inches);
		this.FavColor = FavColor;
	}
	
	public Person(String name,int age, int centimeters, String FavColor) {
		this.name = name;
		this.age = age;
		this.height = new Height(centimeters);
		this.FavColor = FavColor;
	}
	
	@Override
	public String toString() {
		
		String output;
		
		if(height.isCentimeters) {
			output = ("Hello, I'm " + this.name + " and I'm " + this.age + (this.age < 2 ?" year":" years") + " old. \n");
			output += ("I am " + this.height.centimeters + " cm tall and my favorite color is " + this.FavColor + "\n\n");
		}
		else {
			output = ("Hello, I'm " + this.name + " and I'm " + this.age + (this.age < 2 ?" year":" years") + " old. \n");
			output += ("I am " + this.height.feet + "' "+ this.height.inches + "\" " +  "tall and my favorite color is " + this.FavColor + "\n\n");
		}
		return output;
	}
	
	private class Height{
		
		private int feet;
		private int inches;
		
		private int centimeters;
		private boolean isCentimeters;
		
		// For feet and inches
		Height(int feet, int inches){
			this.feet = feet;
			this.inches = inches;
			this.isCentimeters = false;
		}
		
		// This is for centimeters
		Height(int centimeters){
			this.isCentimeters = true;
			this.centimeters = centimeters;
		}
		
	}
	
}
