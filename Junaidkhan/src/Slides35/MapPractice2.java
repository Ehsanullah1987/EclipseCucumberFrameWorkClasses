package Slides35;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapPractice2 {
	public static void main(String[] args) {
//		1.Create  a  map  of  countries  with  its capital  that  will  store  countries  in alphabetical order.
//		●Print  all  keys  and  values  from  a country map using for each loop and iterator.
//		●Print  all  values  from  a  country  map using for each loop and iterator.

		Map<String, String> Countries = new TreeMap<>();

		Countries.put("Pakistan", " Islam Abad");
		Countries.put("Iran", "Tehran");
		Countries.put("Indai", "New Delhi");
		Countries.put("Afghanistan", "Laghman");
		Countries.put("USA", "Virginia");
		

		Set<String> keys = Countries.keySet();
		
		for(String key: keys ) {
			//System.out.println(" Keys values is country: "+key +" The value is capital "+ Countries.get(key));
			
			
			
		}
		
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext()){
			
			String keyname=it.next();
			
			//System.out.println(" Value is the Capital name "+ Countries.get(keyname));
		}
		
		Collection<String>  value=Countries.values();
		
		for( String values: value) {
			
			//System.out.println(values);
		}
		
		Iterator <String> iterator=value.iterator();
		while(iterator.hasNext()) {
			String Keyvalue=iterator.next();
			System.out.println(Keyvalue);
		}
		

	}

}
