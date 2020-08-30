package PracticeWIthJuniadKhan;

public class Slide24Task {

	Slide24Task(){
		
		System.out.println("Hi");
		}
	Slide24Task(int x){
		this();
		System.out.println("Hello");
		}
	Slide24Task(int x,int y){
		this(1);
		System.out.println("How are you");
		}
	public static void main(String[] args) {
		
		Slide24Task obj=new Slide24Task(1,2);
		}
	}
	
