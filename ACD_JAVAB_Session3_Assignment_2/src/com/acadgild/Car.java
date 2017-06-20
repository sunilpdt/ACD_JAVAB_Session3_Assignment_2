package com.acadgild;

public class Car extends Vehicle {

	private int speed;
	private String carName;
	private int chassisNo;
	Car(String type,int speed,String carName,int chassisNo) {
		super(type);
		this.speed=speed;
		this.carName=carName;
		this.chassisNo=chassisNo;
		// TODO Auto-generated constructor stub
		
	 
	}
	
	public void displayCarInfo(){
		 System.out.println("The details of the car you are purchasing are:");
		 System.out.println("Speed: "+speed+" "+"CarName: "+carName+" "+"ChassisNo :"+chassisNo);
		 super.displayType();
	 }
	
	public static void main(String[] args){
		
		Car car=new Car("Sedan",3000, "Suzuki Alto", 32456765);
		car.displayCarInfo();
	}
	

	
}
