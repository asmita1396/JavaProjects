package com.deloitte.other;

public class RiverBarge  extends Vehicle implements Sailer {

	@Override
	public void dock() {
		System.out.println("river barge at dock");

	}

	@Override
	public void cruise() {
		System.out.println("River barge at cruise");

	}

}
