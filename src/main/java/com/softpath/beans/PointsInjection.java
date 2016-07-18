package com.softpath.beans;

import java.util.List;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PointsInjection implements BeanNameAware, InitializingBean, DisposableBean{
	
	private Point pointA;
	private Point pointB;
	
	//Herencia en Spring
	private List<Point> pointList;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public List<Point> getPointList() {
		return pointList;
	}
	public void setPointList(List<Point> pointList) {
		this.pointList = pointList;
	}
	public void DrawingDependencyInjection(){
		System.out.println("Point a: [" + getPointA().getX() + ", " + getPointA().getY() + "]");
		System.out.println("Point b: [" + getPointB().getX() + ", " + getPointB().getY() + "]");
		
		for (Point point : pointList) {
			System.out.println("This list contains this point : [" + point.getX() +"," + point.getY()+"]");
		}
	}
	public void destroy() throws Exception {
		System.out.println("destroying bean");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("something after properties set");
	}
	public void setBeanName(String bean) {
		System.out.println("my bean name is : " + bean);
	}
}
