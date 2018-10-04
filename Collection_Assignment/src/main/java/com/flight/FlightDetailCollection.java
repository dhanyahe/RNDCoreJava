package com.flight;

import java.util.Collections;

import java.util.LinkedList;

import com.flight.model.Flight;

public class FlightDetailCollection {

	LinkedList<Flight> flightList;

	public FlightDetailCollection() {
		flightList = new LinkedList<Flight>();
	}

	public LinkedList<Flight> getAllFlights() {
		return flightList;
	}

	public void addNewFlight(Flight f) {
		flightList.add(f);
	}

	public Flight getFlightByNo(int flightNo) {
		for (Flight f : flightList) {
			if (f.getFlightNo() == flightNo) {
				return f;
			}
		}
		throw new RuntimeException("No Flight!!!");

	}

	public LinkedList<Flight> removeFlight(int flightNo) {
		flightList.remove(flightNo);
		return flightList;
	}

	public LinkedList<Flight> updateFlightTime(int flightNo, int deptTime,
			int arrTime) {
		for (Flight f : flightList) {
			if (f.getFlightNo() == flightNo) {
				f.setDeptTime(deptTime);
				f.setArrTime(arrTime);
				return flightList;
			}
		}
		throw new RuntimeException("No Flight");
	}

	public LinkedList<Flight> updateFlightDestination(int flightNo,
			String DestCity) {
		for (Flight f : flightList) {
			if (f.getFlightNo() == flightNo) {

				f.setDestCity(DestCity);
				return flightList;
			}
		}
		throw new RuntimeException("No Flight");
	}

	public LinkedList<Flight> sortFlightByFastestRoute() {

		Collections
				.sort(flightList, (Flight f1, Flight f2) -> f1.getRouteTime()
						- f2.getRouteTime());
		return flightList;
	}

	public LinkedList<Flight> sortFlightByCheapestCost() {

		Collections.sort(flightList, (Flight f1, Flight f2) -> f1.getCost()
				- f2.getCost());
		return flightList;
	}

	public void getFlightByMorningDeparture() {
		for (Flight f : flightList) {
			if ((f.getDeptTime() >= 6) && (f.getDeptTime() <= 11)) {
				System.out.println(f);

			}
			throw new RuntimeException("No Flights at this hour!");

		}
	}

	public static void main(String[] args) {
		FlightDetailCollection flist = new FlightDetailCollection();
		flist.addNewFlight(new Flight(101235, "Indian Airlines", 14, 18, 8000,
				"Mumbai", "Goa", 2));
		flist.addNewFlight(new Flight(101236, "Kingfisher", 6, 8, 12000,
				"Mumbai", "Goa", 2));
		flist.addNewFlight(new Flight(101237, "Indian Airlines", 7, 9, 13000,
				"Mumbai", "Goa", 2));
		flist.addNewFlight(new Flight(101238, "Kingfisher", 8, 10, 14000,
				"Mumbai", "Goa", 2));
		flist.addNewFlight(new Flight(101233, "Indigo", 15, 18, 15000,
				"Mumbai", "Goa", 3));
		flist.addNewFlight(new Flight(101232, "Indian Airlines", 13, 18, 7000,
				"Mumbai", "Goa", 5));
		flist.addNewFlight(new Flight(101223, "Indigo", 8, 10, 10000, "Mumbai",
				"Goa", 2));
		flist.addNewFlight(new Flight(101245, "Jet Airways", 9, 11, 14000,
				"Mumbai", "Goa", 2));
		flist.addNewFlight(new Flight(101256, "Indian Airlines", 22, 0, 17000,
				"Mumbai", "Goa", 2));

		for(Flight f : flist.getAllFlights()) {
			System.out.println(f);
		}
		
		System.out.println("===========================================\n");
		
		
	/*	flist.getFlightByMorningDeparture();
		System.out.println("===========================================\n");*/
		
		for(Flight f : flist.sortFlightByCheapestCost()) {
			System.out.println(f);
		}
		System.out.println("===========================================\n");
		
		for(Flight f : flist.sortFlightByFastestRoute()) {
			System.out.println(f);
		}

	}

}
