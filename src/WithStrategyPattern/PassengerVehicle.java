package WithStrategyPattern;

import WithStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
	
	//Instead of rewriting the code for each class at runtime
	//we are choosing what type of drive strategy we want
	public PassengerVehicle() {
		super(new NormalDriveStrategy());
	}
}
