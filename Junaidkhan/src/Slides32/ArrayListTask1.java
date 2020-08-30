package Slides32;

import java.util.ArrayList;

public class ArrayListTask1 {
	
//	Create a generic ArrayList that will store 5 names into it.
//	●Find  out  whether  the  given ArrayList  is empty or not? 
//	●Check  whether  the  specific  name  is present in an ArrayList or not?
//	●Find the size of your arrayList and print all values from that
	
	public static void main(String[] args) {
		ArrayList   names=new ArrayList();
		names.add(123);
		names.add('A');
		names.add("Samir");
		names.add("zubair");
		names.add("Ehsanullah");
		
		//System.out.println(names.get(0));
		
		//names.set(0, "Ehsanullah");
		//names.replaceAll();
		names.remove(0);
		//names.removeAll(names);
		//int t=names.size();
		System.out.println(names);

		//boolean value=names.isEmpty();
	//System.out.println(value);
		
//		
//		
//		System.out.println(value);
//		
		
	}
}
