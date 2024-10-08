package bank;

public class BankAccount {
	
	private int accountNumber;
	private String accountHolder;
	double balance;
	
	
	
	public BankAccount(int accountNumber, String accountHolder) {
		
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	void deposite(double balance)
	{
		if(balance<1)
		{
			System.out.println("Invalid Amount Enter!");
		}
		else
		{
			this.balance=this.balance+balance;
			System.out.println("Credited "+balance +" Successfully");

		}
		
	}
	
	void  withdraw(double balance)
	{
		
		
	}
	
	
	void CheckBalance()
	{
		System.out.println("Current Balance : "+balance+" rs.");
	}
	
	
	
}
