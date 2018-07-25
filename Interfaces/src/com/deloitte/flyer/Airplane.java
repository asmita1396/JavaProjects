package com.deloitte.flyer;

import com.deloitte.other.Vehicle;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Taking off");

	}

	@Override
	public void land() {
		System.out.println("Landing");

	}

	@Override
	public void fly() {
		System.out.println("Flying");

	}

}
