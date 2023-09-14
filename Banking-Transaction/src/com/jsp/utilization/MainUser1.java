package com.jsp.utilization;

import com.jsp.Account.Account;
import com.jsp.implementation.User1;
import com.jsp.objectCreation.Transaction1;

public class MainUser1 {

	public static void main(String[] args) 
	{
		Account a1=new Account("Abc",123456);
		a1.showdetails();
		Transaction1 t1=new Transaction1();
		User1 u1=t1.createObject(1234);
		u1.transfer(1, 1000.0);
		u1.transfer(2, 2000.0);
		u1.transfer(1, 500.0);
		User1 u2=t1.createObject(2345678);
		u2.transfer(2, 1000.0);
		u2.transfer(1, 500.0);
		System.out.println("-------------------");
		
		
		Account a2=new Account("Xyz",789456);
		a2.showdetails();
		Transaction1 t2=new Transaction1();
		User1 u21=t2.createObject(1234);
		u21.transfer(1, 05000.0);
		u21.transfer(2, 2000.0);
		
		
		

	}

}
