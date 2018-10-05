package com.collections.CarParkingAssignment.parkingOperations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.collections.CarParkingAssignment.model.Customer;
import com.collections.CarParkingAssignment.model.ParkingId;

public class ParkingOperations {

	static int carCount = 0;
	static int floor = 1;
	static int section = 1;
	static int compartment = 0;

	Map<ParkingId, Customer> parkingMap;
	
	public ParkingOperations() {
		parkingMap = new HashMap<>();
	}

	private ParkingId generateNewParkingId() {
		++carCount;
		compartment++;
		if (compartment > 10) {
			compartment = 1;
			section++;
			if (section > 4) {
				section = 1;
				floor++;
				if (floor > 4) {
					if (carCount == 160) {
						throw new RuntimeException("Parking Full");
					} else {

					}
				}
			}
		}
		ParkingId pId = new ParkingId(floor, section, compartment);
		return pId;

	}

	public ParkingId addCar(Customer car) {
		ParkingId pId = generateNewParkingId();
		parkingMap.put(pId, car);
		return pId;
	}
	
	public Set<Map.Entry<ParkingId, Customer>> getAllDetails()
	{
		return parkingMap.entrySet();
	}
	
	public Customer retrieveByParkingId(ParkingId pid1)
	{	
		Customer c=null;
		Set<ParkingId> parkingKeySet=parkingMap.keySet();
		for(ParkingId p:parkingKeySet)
			if(p.getFloor()==pid1.getFloor()&&p.getSection()==pid1.getSection()&&p.getCompartment()==p.getCompartment())
			{
				c=parkingMap.get(p);
				break;
			}
		
		return c;
		
	}
	
	public Customer removeByParkingId(ParkingId pid1)
	{	
		Customer c=null;
		Set<ParkingId> parkingKeySet=parkingMap.keySet();
		for(ParkingId p:parkingKeySet)
			if(p.getFloor()==pid1.getFloor()&&p.getSection()==pid1.getSection()&&p.getCompartment()==pid1.getCompartment())
			{
				c=parkingMap.remove(p);
				carCount--;
				break;
			}
		
		return c;
		
	}

}
