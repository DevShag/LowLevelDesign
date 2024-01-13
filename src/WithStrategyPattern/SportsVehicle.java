package WithStrategyPattern;
import WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

	//Instead of rewriting the code for each class at runtime
	//we are choosing what type of drive strategy we want
	public SportsVehicle() {
		super(new SportsDriveStrategy());
	}
}
