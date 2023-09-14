package com.jsp.implementation;

import com.jsp.Account.Account;

public class Web1 extends Account implements User1 {

	@Override
	public void transfer(int choice,double amt) 
	{
		
		if(choice==1) 
		{
			withdraw(amt);	
		}
		else
		{
			deposit(amt);
		}
		
		
	}


}
