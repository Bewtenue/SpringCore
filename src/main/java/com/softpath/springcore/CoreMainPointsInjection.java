package com.softpath.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softpath.beans.CollectionPoints;
import com.softpath.beans.PointsInjection;

public class CoreMainPointsInjection {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring_point_injection.xml");
		//PointsInjection points = (PointsInjection) factory.getBean("mypoint");
		//PointsInjection points = (PointsInjection) factory.getBean("mypoint-alias");//tambien se puede llamar por un alias creado en el xml
		//points.DrawingDependencyInjection();
		PointsInjection points = (PointsInjection) factory.getBean("mypoint");
		points.DrawingDependencyInjection();
	}
}
