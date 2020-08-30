package PracticeWIthJuniadKhan;

public class StudentSlide24Task {
//	Write program as a Student class   that has instance variables name and address.
//	Create a constructor that will initialize those variables. 
//	Print name & address of given  student by the displayInfo method.
	
	String name;
	String State;
//	StudentSlide24Task(String name, String VA){
//		this.name =name;
//		this.State=VA;
//		
//	}
	public String disPlayInfo(String name, String State) {
		String fullAd=name+State;
		System.out.println(name+" : "+ State);
		return fullAd;
	}
	public static void main(String[] args) {
		StudentSlide24Task obj=new StudentSlide24Task();
		obj.disPlayInfo("Farid", "VA");
	}
	
}
