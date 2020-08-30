package SLides37;

import java.io.IOException;

public class Exceptions {
	public static void main(String[] args) { 
		
		
		try{      
			String name= null;
	int i = 10;          
	int j;           
		j = i/0 ; 
			
			System.out.println("////////////////////////////");
			int [] array= new int[4];
			array[0]=1;
			array[2]=10;
			array[3]=0;
			array[4]=100;
			//array[5]=1;
		
	
		System.out.println(name.length());
			System.out.println(array[4]);
			System.out.println(j);  
			
			 //It will throw exception  
		}catch (NullPointerException n) {
			System.out.println(n);
		
			}catch (ArithmeticException e){  
			System.out.println("Number should not be divided by zero");
			//e.printStackTrace();
				// Print the exception    
			System.out.println(e);
				
				   
			System.out.println("Unhandled Exception");      
			} catch(ArrayIndexOutOfBoundsException e)  {
				
					//System.out.println(e);
				
		
		}
	
		}
	
}

