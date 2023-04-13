package Assignments;

public class ObjectTestCar {
	
	public static void main(String[] args) {
		
		CarBase c1 = new CarBase();
		c1.Manufacturer = "Hyundai";
		c1.Color = "Grey";
		c1.Model = "i10";
	
		CarBase c2 = new CarBase ();
		c2.Manufacturer = "TATA";
		c2.Color = "black";
		c2.Model = "Altroz";
		
				
		CarBody CB1 = new CarBody();
		CarBody CB2 = new CarBody();
		c1.CB = CB1;
		c2.CB = CB2;
//		CB1.SeatingCapacity = 5;
//		CB1.Sunroof= false;
		c1.CB.SeatingCapacity = 5;
		c1.CB.Sunroof= false;
		
		c2.CB.SeatingCapacity = 7;
		c2.CB.Sunroof= true;
		
		CarEngine CE1 = new CarEngine();
		CE1.EngineCapasity = 1.5;
		CE1.Enginetype = "Petrol";
		

		CarEngine CE2 = new CarEngine();
		CE2.EngineCapasity = 2.0;
		CE2.Enginetype = "Diesel";
		
		c1.MyCarDetails();CE1.Fuel();
		c2.MyCarDetails();CE2.Fuel();
		
		
		
		
		
		
		
		
	}

	
	

}
