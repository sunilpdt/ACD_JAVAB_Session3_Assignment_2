package com.acadgild;

public class Vehicle {

	 private String vehicleType;
	 Vehicle(String type){
		this.vehicleType=type; 
	 }
	 
	 public void displayType(){
		 System.out.println("VehicleType: "+vehicleType);
	 }
}
