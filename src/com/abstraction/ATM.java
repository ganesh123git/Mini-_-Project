package com.abstraction;    // class  6

public class ATM extends Bank {
	
	@Override
	public void pin() {
		
		System.out.println("pin num is:1234");
		//public la datatype illa so syso la type panirom
		
	}
	public static void main(String[] args) {
		
		ATM a = new ATM();
		a.accnum(1234567889);
		a.branch("porur");
		a.pin();
	
		
	}

}
