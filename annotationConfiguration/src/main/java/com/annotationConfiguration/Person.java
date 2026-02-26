package com.annotationConfiguration;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	//Dependency Injection
	//@Autowired
	private Mobile mobile;
	
	//-------FIELD INJECTION--------
	@Autowired
	private Scanner scan;
	
	
	
	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public void message() {
		System.out.println("Hiii");
	}
	
	public Mobile getMobile() {
		return mobile;
	}
	//-----SETTER INJECTION---------
	@Autowired
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	//---CONSTRUCTOR INJECTION------
	public Person(Mobile mobile) {
		this.mobile = mobile;	
	}

	

}
