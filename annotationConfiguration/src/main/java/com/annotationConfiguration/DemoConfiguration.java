package com.annotationConfiguration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class DemoConfiguration {
	
	@Bean
	//used for 3rd party classes
	public Scanner getScanner() {
		return new Scanner(System.in);	
	}
	
//	@Bean
//	public List<String> getList(){
//		return new ArrayList<String>();
//	}
	
	@Bean
	public List<String> getAbc(){
		return List.of("Miller","Virat");
	}
	
	
	@Bean
	public HashMap<String, Integer> getabc(){

	    HashMap<String, Integer> map = new HashMap<>();
	    map.put("Virat", 1);
	    map.put("renu", 2);

	    return map;   
	}

	
	
}
