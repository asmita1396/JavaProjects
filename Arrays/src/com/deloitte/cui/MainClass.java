package com.deloitte.cui;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] points;
		points= new Point[3];
		
		points[0]= new Point();
		
		points[2]=new Point();
		
		points[0].x= 2;
		points[0].y= 4;
		
		points[2].x= 7;
		points[2].y= 8;
		
		for(Point point: points) {
			if(point!=null) {
			System.out.println(point.x+" , "+ point.y);
			}
		}
		
		
		
		
		

	}

}
