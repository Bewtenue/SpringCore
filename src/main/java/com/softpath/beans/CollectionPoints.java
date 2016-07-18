package com.softpath.beans;

import java.util.List;

public class CollectionPoints {
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void drawPoint(){
		System.out.println("Drawing Points");
		for (Point point : points) {
			System.out.println("Point: [" + point.getX() + "," + point.getY() + "]");
		}
		
		
	}
}
