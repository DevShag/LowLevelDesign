package WithStrategyPattern;

import WithStrategyPattern.Strategy.SportsDriveStrategy;

public class GoodsVehicle extends Vehicle {
	
	//Instead of rewriting the code for each class at runtime
	//we are choosing what type of drive strategy we want 
	public GoodsVehicle() {
		super(new SportsDriveStrategy());
	}
}
