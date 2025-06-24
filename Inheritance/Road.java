package Inheritance;
class Vehicle{
	String brand;
	int year;
	void startEngine() {
		
	}
}

class car extends Vehicle{
	String fueltype;
	@Override
	void startEngine() {
	   System.out.println("Car engine starts"); 
	}
	
	void drive() {
		System.out.println("Car is driving");
	}	
}

class truck extends Vehicle{
	int loadcapacity;
	@Override
	void startEngine() {
	    System.out.println("Truck engine Starts");
	}
	void haul() {
		System.out.println("Truck is hauling");
	}
}
public class Road {

	public static void main(String[] args) {
		car c = new car();
		c.brand= "rolls royal";
		c.year=1999;
		c.startEngine();
		c.drive();
		
		truck t = new truck();
		t.brand= "BMW";
		t.year=1985;
		t.startEngine();
		t.haul();
		

	}

}
