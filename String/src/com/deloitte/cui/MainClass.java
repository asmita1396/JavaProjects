package com.deloitte.cui;

public class MainClass {

	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		String str;
		 
		str= "X & Y : "+ p1;
		System.out.println(str);

		System.out.println(p1.equals(p2));	
	}

}
