package com.jsp.Account;

public class Account 
{
		long AccNo;
		double bal;
		String Owner;
		public Account()
		{
			
		}
		public Account(String Owner,long AccNo)
		{
			this.AccNo=AccNo;
			this.Owner=Owner;
		}
		public void showdetails()
		{
			System.out.println(Owner);
			System.out.println(AccNo);
		}
		
		public void deposit( double amt)
		{
			bal=bal+amt;
			System.out.println("Current bal ="+ bal + ", Deposit amt=" + amt);
		}
		public void withdraw( double amt)
		{
			if(bal>amt)
			{
				bal=bal-amt;
			
			System.out.println("Current bal ="+ bal + ",withdraw amt=" + amt);
			}
			else
			{
				System.out.println("Invalid transaction");
			}
		}
	

	

}
