package bank;

public class SavingAccount extends BankAccount{
	
	
	SavingAccount(int  accountNumber,String accountHolder ,double balance)
	{
		super(accountNumber,accountHolder);
		super.balance=balance;
	}
	
	
	
	void withdraw(double balance)
	{
		//Saving Account must have rs upto 2000
		double limit=super.balance-balance;
		if(balance<1)
		{
			System.out.println("Invalid Amount Enter !");
		}
		else if(limit<2000)
		{
			System.out.println("Insufficient Balance !"+" Curr Bal : "+super.balance+" Saving Account limit is : "+2000);
		}
		else if(balance>super.balance)
		{
				System.out.println("Insufficient Balance !"+" Curr Bal : "+super.balance);
		}
		else
		{
			super.balance=super.balance-balance;
			System.out.println("Debited "+balance +" Successfully");
		}
		
	}

}
