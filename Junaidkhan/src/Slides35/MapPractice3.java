package Slides35;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
	public static void main(String[] args) {
//		1.Create a map of Best Buy store. Place item id and item name into it.
//		Example (7664847 = Printer, 7879885= TV etc )
//		●Retrieve all keys and values from a Best Buy map using EntrySet.
		
		Map<Integer, String> bestBuy=new LinkedHashMap<>();
		
		
		bestBuy.put(400, "Printer");
		bestBuy.put(500, "TV");
		bestBuy.put(300, "Computer");
		bestBuy.put(null, "Iphone");
		bestBuy.put(200, " Iphone");
		
		//System.out.println(bestBuy);
		
		for(Map.Entry<Integer, String> entry:bestBuy.entrySet()) {
			 
			//System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		
		Iterator <Map.Entry<Integer, String>> it= bestBuy.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> name=it.next();
			System.out.println(name.getKey()+ " " +name.getValue());
		}
			
		}
	
	}

