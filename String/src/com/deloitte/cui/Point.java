package com.deloitte.cui;

 class Point {
	public int x;
	public int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y =y;

	}
	@Override
	public String toString() {
		
		return (x+" & "+y);
	}
	@Override
	public boolean equals(Object target) {
		
		if(target!= null) {
			 if(target instanceof Point){
				
				Point point = (Point)target;
				if(x==point.x && y==point.y) {
				return true;
				}
			}
			
		}
		return false;
	}
}
