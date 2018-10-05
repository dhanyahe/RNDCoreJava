package com.collections.CarParkingAssignment.model;

public class ParkingId {

	int floor;
	int section;
	int compartment;
	
	
	public ParkingId()
	{
		
	}

	public ParkingId(int floor, int section, int compartment) {
		super();
		this.floor = floor;
		this.section = section;
		this.compartment = compartment;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getCompartment() {
		return compartment;
	}

	public void setCompartment(int compartment) {
		this.compartment = compartment;
	}

	@Override
	public String toString() {
		return "ParkingID [floor=" + floor + ", section=" + section + ", compartment=" + compartment + "]";
	}

}
