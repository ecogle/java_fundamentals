package phase1.basics;

import java.util.ArrayList;
import java.util.List;

public class DemoStorage {

	private List<Person> People = new ArrayList<Person>();
	
	public List<Person> AddPerson(Person person){
		
		People.add(person);
		
		return People;
		
	}
	
	public void PrintPeople(DemoStorage demo) {
		
		demo.People.forEach((p) -> System.out.println(p.toString()));
		
	}
	
	
}
