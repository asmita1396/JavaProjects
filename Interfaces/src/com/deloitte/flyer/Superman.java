package com.deloitte.flyer;

public class Superman extends Kryptonian implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Superman taking off");

	}

	@Override
	public void land() {
		System.out.println("Superman landing");

	}

	@Override
	public void fly() {
		System.out.println("Superman flying");

	}
	
	public void leapBuilding() {
		System.out.println("Leaping from building");

	}
	public void stopBullet() {
		System.out.println("stopping bullet");
	}

}
