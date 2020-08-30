package Slides29;

 public abstract class File {
//	Create  a  class  File  that  will  have  the following behaviors: open, edit, close. 
//	Edit and close are implemented method while open  is  an  abstract.  Create  3  subclasses:
//		JavaFile,   WordFile,   PDFFile   that   will provide  specific  implementation  of  open behaviour: Example: to open .
//		java file we need notepad++ or sublime text, to open .doc  file  we  need  Microsoft  word  to  be installed etc
	
	
abstract void open();

void edit() {
	System.out.println("I am Edit method");
}
void close() {
	System.out.println("I am close method");
}
	
}
//class JavaFile extends File{
//
//	@Override
//	void open() {
//		System.out.println("open file with notepad++ or sublime text");
//		
//	}
//	
//}
//class wordFile extends File{
//
//	@Override
//	void open() {
//		System.out.println("open file with word doc");
//		
//	}
//	
//}
//class pdfFile extends File{
//
//	@Override
//	void open() {
//		System.out.println("open file with pdf reader");
//		
//	}
//	public static void main(String[] args) {
//		File obj=new pdfFile();
//		//File obj1=(File)obj;
//		obj.open();
//		
//		
//	}
	

