package com.jsp.implementation;

import com.jsp.Account.Account;

public class ATM1 extends Account implements User1 
{

	@Override
	public void transfer(int choice ,double amt) 
	{
		
		if(choice==1)
		{
			deposit(amt);
		}
		else
		{
			withdraw(amt);
		}
		

	}
}
