package com.softpath.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softpath.beans.CollectionPoints;
import com.softpath.beans.Market;

public class CoreMainMarket {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring_market.xml");//con este cambio el XML se tiene que mover a la altura del main
		Market market = (Market) factory.getBean("market_child");
		market.descripcion();
	}
}
