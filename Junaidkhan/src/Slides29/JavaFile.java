package Slides29;

public class JavaFile extends File {

	@Override
	void open() {
		System.out.println("open file with notepad++ or sublime text");
		
	}
	public static void main(String[] args) {
		File obj=new JavaFile(); // upcasting
		File obj1=(File)obj; // downcasting
	//	File obj2= new File();// does not work
		obj.open();
		obj1.edit();
		
		
	}

}

