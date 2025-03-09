package com.BankingSystemApplication;

import com.BankingServices.BankingService;

public class BankingSystemApp {
	public static void main(String[] args) {
		BankingService bankingSystem = new BankingService();
        bankingSystem.run();
	}	
}
