package PracticeWIthJuniadKhan;

import java.util.Arrays;
import java.util.Scanner;

public class SlidePractice {
	public static void main(String[] args) {
		
	
//	Write a program that reads two people's first names and if they expecting boy or girl? 
//	Based on the input suggests a name for a baby:
//	Example Output:Mom’s first name? Mary Dad’s first name? 
	//Danie lBoy or Girl? boy Suggested baby name: DANRY
	
	Scanner scan=new Scanner (System.in);


     System.out.println("Mom's first name");
     String mom=scan.nextLine();
	
	System.out.println("dad's first name");
	String dad=scan.nextLine();
	
	System.out.println("boy or girl");
	String gender=scan.nextLine();
	if(gender.equals("boy")) {
		char[] fMom=mom.toCharArray();
		Arrays.sort(fMom);
	System.out.println(dad.substring(0,3)+fMom[fMom.length-2]+fMom[fMom.length-1]);
		
		
	}
	
	else if( gender.equals("girl")) {
		char [] fDad=dad.toCharArray();
		Arrays.sort(fDad);
		System.out.println( mom.substring(0,3)+fDad[dad.length()-2]+fDad[dad.length()-1]);
	}
	
}
}