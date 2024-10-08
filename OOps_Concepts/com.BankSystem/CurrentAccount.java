package bank;

public class CurrentAccount extends BankAccount {
	
	CurrentAccount(int accountNumber, String accountHolder)
	{
		super(accountNumber ,accountHolder);
	}
	
	
	
	
	void withdraw(double balance)
	{
		if(balance<1)
		{
			System.out.println("Invalid Amount Enter !");
		}
		else
		{
			if(balance>super.balance)
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
	
	
	

}
