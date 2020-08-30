package Slides20;

public class Palindrome {
	//TASK2
    // Create a method that will take a String and return whether String is palindrome or not.
	// Method should be available to all classes within your projects.

	protected String StringReverse(String name) {
		String result="";
		char [] array=name.toCharArray();
		for(int i=array.length-1; i>=0; i--) {
			result=result+array[i];
			
		}
		return result;
	}

	public boolean isPalindrome(String name1) {
		boolean result3= false;
		String str1=StringReverse(name1);
		
		if(str1.equalsIgnoreCase(name1)) {
			result3=true;
		}else {
			result3 =false;
		}
		
		return result3;
	}
	public static void main(String[] args) {
		
		Palindrome obj=new Palindrome();
		String str4=obj.StringReverse("Anna");
		System.out.println(str4);
		 boolean st=obj.isPalindrome("kayak");
		System.out.println(st);
	}
}
