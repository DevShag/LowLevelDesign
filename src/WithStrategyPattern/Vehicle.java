package WithStrategyPattern;

import WithStrategyPattern.Strategy.*;

public class Vehicle {
	
	DriveStrategy driveObject;
	
	//this is known as constructor 
	//Now at runtime we can decide which type of drive stratergy we want
	public Vehicle(DriveStrategy driveObject) {
		this.driveObject=driveObject;
	}
	
	public void drive() {
		driveObject.drive();		
	}
}
