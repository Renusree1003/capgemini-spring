package com.casestudy3_25thfeb;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditScoreValidator implements LoanValidator{

	@Override
	public boolean validateLoan(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Validationg using credit score");
		return amount <= 500000;
	}

}
