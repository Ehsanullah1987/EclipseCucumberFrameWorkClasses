package Slide36;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestPerson extends Person{
	TestPerson(String name, String lastName, int age, int salary) {
		super(name, lastName, age, salary);
		
	}

	public static void main(String[] args) {
		Map<Integer, String> map=new TreeMap<>();
		
		map.put(100, "Junaid");
		map.put(101, "Samir");
		map.put(102, "DR");
		map.put(103, "Attaullah");
		map.put(104, "Zubair");
	Person obj=new Person("Junaid", "Ali", 25, 10000);
	obj.userDetails();
	Set<Entry<Integer, String>> set=map.entrySet();
	
	for(Entry<Integer, String> entry1: set) {
		System.out.println(entry1.getKey()+ " "+entry1.getValue());
	//for(Map.Entry<Integer, String> entry: map.entrySet()) {
		
		//System.out.println(entry.getKey()+ ", "+ entry.getValue());
		
	}
	
	
	}

}
