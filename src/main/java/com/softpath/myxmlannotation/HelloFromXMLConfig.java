package com.softpath.myxmlannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloFromXMLConfig {
	
	@Bean
	public HelloXMLFromJavaClass hello(){
		return new HelloXMLFromJavaClass();
	}
	
}
