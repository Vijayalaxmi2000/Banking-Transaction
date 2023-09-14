package com.jsp.objectCreation;

import com.jsp.implementation.ATM1;
import com.jsp.implementation.User1;
import com.jsp.implementation.Web1;

public class Transaction1 
{
	User1 u;
	public User1 createObject(int pin)
	{
		if(pin==1234)
		{
			u=new ATM1();
			return u;
			
			
		}
		else
		{
			u=new Web1();
			return u;
		}
	}
	

}
