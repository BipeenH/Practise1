package Assignments;

public class CarBase {
	
	String Manufacturer;
	String Model;
	String Color;
	String Type;
	int NoOfGears;
	
	CarBody CB;
		
	
	public void MyCarDetails() {
		System.out.print("My Car is " + Model +  " manufacturer by " + Manufacturer + " with " + Color + " Color. " );
		System.out.println(Model + " has seating capasity of " + CB.SeatingCapacity + " with " + CB.Sunroof + " sunroof");
	}
	
}
