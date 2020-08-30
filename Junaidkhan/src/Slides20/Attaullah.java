package Slides20;

public class Attaullah {

//		/*
//		 * //Create a method that will take 1 parameter as a String and return reversed String.
//		// Method should be visibly only within same package.
//		 */
	
	protected String StringReverse(String name) {
		String result="";
		char [] array=name.toCharArray();
		for(int i=array.length-1; i>=0; i--) {
			result=result+array[i];
			
		}
		return result;
	}

	public static void main(String[] args) {
		Attaullah obj=new Attaullah();
		String str="Anna";
		String str1=obj.StringReverse(str);
		System.out.println(str1);
		
		if(str.equalsIgnoreCase(str1)) {
			
			System.out.println("Plindrome");
		}else {
			System.out.println("Not Plindrome");
		}
	
}
	
}