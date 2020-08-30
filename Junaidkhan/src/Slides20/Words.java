package Slides20;

public class Words {
	//TASK3
    //Create a method that will take a string and return an array of words from that string.
	// Method should be available only within same class.
	
	private String [] arrayofwords(String name) { // this method or two blocks of code is for the second way
		
		return name.split(" ");
	}
	public static void main(String[] args) {
		
		
		// first way with out using private String [] arrayofwords.
		String sentence=" What a beautiful class everyone got on time here!";
		
		String [] array1=sentence.split(" ");
		for (String word: array1) {
			System.out.println(word);
		}
		// Second way
		Words obj=new Words();
		String [] array=obj.arrayofwords("Mohammad just join us");
		for (String word: array) {
			System.out.println(word);
		
	}
}
}
