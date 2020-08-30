package Slide31;

public class Sedan extends Car {
//	The Sedan class has field as length and also does   it   is   own   implementation   of calculateSalePrice():
//	if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
double length=200;
public double calculateSalePrice() {
	if (length>20) {
		System.out.println(carPrice*0.05);
		
	}else {
		System.out.println(carPrice*0.1);
	}
	return carPrice;
}
public static void main(String[] args) {
	Sedan obj=new Sedan();
	obj.calculateSalePrice();
}
	
	
}
