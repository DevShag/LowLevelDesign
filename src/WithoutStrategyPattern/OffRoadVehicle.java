package WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{
	
	//OffRoadVehicle and SportsVehicle are using same drive logic
	//and this logic is not present in parent Vehicle class so we have
	//to duplicate the code which is bad practice
	@Override
	public void drive() {
		//different drive logic
		System.out.println("sports drive capability");
	}
}
