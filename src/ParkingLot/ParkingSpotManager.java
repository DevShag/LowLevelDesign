package ParkingLot;

import java.util.List;

public class ParkingSpotManager {
	List<ParkingSpot> list;
	
	public ParkingSpotManager(List<ParkingSpot> ls) {
		this.list=ls;
	}
	
	public ParkingSpot findParkingSpot() {
		return null;
	}
	
	public void addParkingSpace(ParkingSpot spot) {
		list.add(spot);
	}
	
	public void removeParkingSpace(ParkingSpot spot) {
		list.remove(spot);
	}
	
	public void parkVehicle(Vehicle v) {
		
	}
	
	public void removeVehicle(Vehicle v) {
		
	}
}
