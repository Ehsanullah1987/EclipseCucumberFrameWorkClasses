package Slides27;

public class UserInfo extends SuperTask {
	String UserAddress="4600 Duke Street";

 UserInfo(){
	 
  super("a",2);
	
	
 }
	void userDetail() {
		 
		
		
		System.out.println(" His name is " +name+"\n His telephone number is "  
		+pN+ "\r His Address is the wrong addres "+UserAddress);
	}
	public static void main(String[] args) {
		
		UserInfo obj=new UserInfo();
		
		obj.userDetail();
		
	}
}
