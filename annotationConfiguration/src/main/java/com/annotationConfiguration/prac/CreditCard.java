package com.annotationConfiguration.prac;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class CreditCard implements Payment{
	public void send() {
		System.out.println("sent through credit card");
	}

}
