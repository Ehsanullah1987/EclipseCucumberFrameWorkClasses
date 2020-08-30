package Slide31;

public class Truck extends Car {
//	Create 2 sub classes: Sedan and Truck.
//The Truck  class  has  field  as  weight  
//and  has  its own implementation of  
//calculateSalePrice() method in which returned price calculated as following:
//	if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.

	double weight=20000;
	
	public double calculateSalePrice() {
		if (weight>2000) {
			System.out.println(carPrice*0.1);
		}else {
			System.out.println(carPrice*0.2);
		}
		return carPrice;
	}
	public static void main(String[] args) {
		Truck obj=new Truck();
		obj.calculateSalePrice();
	}
}
