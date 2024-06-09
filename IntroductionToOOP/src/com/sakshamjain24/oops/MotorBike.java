package com.sakshamjain24.oops;

public class MotorBike {
	private int speed = 150;

	MotorBike(int speed) {
		this.speed = speed;
	}
	// state

//	// behavior
//	void setSpeed(int speed) {
////		System.out.println(this.speed);
//		this.speed = speed;
////		System.out.println(speed);
////		System.out.println(this.speed);
//	}
//
//	int getSpeed() {
//		return this.speed;
//	}

	void start(String name) {
		System.out.printf("%s start", name);
		System.out.println();

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
