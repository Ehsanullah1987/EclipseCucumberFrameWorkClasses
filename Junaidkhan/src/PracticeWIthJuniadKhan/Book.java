package PracticeWIthJuniadKhan;

public class Book {
//	Write program as a Book class   that will have 2 Constructors. 
//	While creating an object make sure:
//	Instance variables are being initialized Both Constructors are being executed
	 int d;
	
	Book(int a){
       d=a;
		System.out.println("I am parameriz"+a);
		
	}
Book(){
	System.out.println("Non paramitraze");
		
	}
public static void main(String[] args) {
	Book b=new Book(10);
	Book B=new Book();
	
	
}

}
