package WithoutStrategyPattern;

public class SportsVehicle extends Vehicle{

	//writing new code for drive method as required is
	//not available in parent
	public void drive() {
		//different drive logic
		System.out.println("sports drive capability");
	}
}
