package Slides35;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
	public static void main(String[] args) {
//		. Create a map of a building. Store floor number and it is associated company name.
//		(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values. 
//		●	Check how many entries you have?
//		●	Update company on a 4th floor 
//		●	Remove company on the 7th floor
//		●	Print your map
		
		HashMap<Integer, String> building=new HashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Youtube");
		building.put(4, "Youtube");
		building.put(5, "Oracle");
		building.put(6, "Lyft");
		building.put(7, "Uber");
		building.replace(4, "Amazon");
		//building.clear();
	//building.remove(1);
	//boolean checkElements=building.isEmpty();
	///System.out.println(checkElements);
	//System.out.println(building);
		//boolean check=building.containsKey(4);
		//System.out.println(check);
		//System.out.println(building.containsValMue("Uber"));
		//String name=building.get(1);
		//building.clear();
		//HashMap<Integer, String> map=new HashMap<>();
		
		//map.putAll(building);
		
	System.out.println(building.clone());
	                                        
	//System.out.println(map);
		
	}

}
