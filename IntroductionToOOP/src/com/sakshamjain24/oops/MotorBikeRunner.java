package com.sakshamjain24.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(80);

//		ducati.start("Ducati");
//		honda.start("Honda");

		ducati.setSpeed(100);
		honda.setSpeed(80);

		int x = ducati.getSpeed();
		int y = honda.getSpeed();

		System.out.println(x);
		System.out.println(y);
	}

}
