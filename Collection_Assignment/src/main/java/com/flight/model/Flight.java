package com.flight.model;


public class Flight {
	int flightNo;
	String airline;
	int deptTime;
	int arrTime;
	int cost;
	String destCity;
	String originCity;
	int routeTime;
	public int getRouteTime() {
		return routeTime;
	}
	public void setRouteTime(int routeTime) {
		this.routeTime = routeTime;
	}
	public Flight(int flightNo, String airline, int deptTime, int arrTime,
			int cost, String destCity, String originCity,int routeTime) {
		super();
		this.flightNo = flightNo;
		this.airline = airline;
		this.deptTime = deptTime;
		this.arrTime = arrTime;
		this.cost = cost;
		this.destCity = destCity;
		this.originCity = originCity;
		this.routeTime= routeTime;
	}
	public Flight() {
		super();
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public int getDeptTime() {
		return deptTime;
	}
	public void setDeptTime(int deptTime) {
		this.deptTime = deptTime;
	}
	public int getArrTime() {
		return arrTime;
	}
	public void setArrTime(int arrTime) {
		this.arrTime = arrTime;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getDestCity() {
		return destCity;
	}
	public void setDestCity(String destCity) {
		this.destCity = destCity;
	}
	public String getOriginCity() {
		return originCity;
	}
	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}
	
	public int compareTo(Flight f) {
		return f.getRouteTime()-getRouteTime();
	}
	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", airline=" + airline
				+ ", deptTime=" + deptTime + ", arrTime=" + arrTime + ", cost="
				+ cost + ", destCity=" + destCity + ", originCity="
				+ originCity + ", routeTime=" + routeTime + "]";
	}
	

}
