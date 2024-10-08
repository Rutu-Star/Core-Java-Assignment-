package bank;

public class MyMainClass {
	public static void main(String[] args) 
	{
		System.out.println("Saving Account....");

	    SavingAccount s1= new SavingAccount(1105 , "Rutu",2000);
		s1.deposite(1000);
		s1.CheckBalance();
		s1.withdraw(500);
		s1.CheckBalance();
		s1.withdraw(700);
		s1.CheckBalance();
		
		System.out.println("\n");

		System.out.println("Current Account....");
		
		CurrentAccount c1 =new CurrentAccount(1106 ,"Sandhya");
		c1.deposite(5000);
		c1.CheckBalance();
		c1.deposite(-500);
		c1.withdraw(1000);
		c1.CheckBalance();
		c1.withdraw(5000);
		c1.CheckBalance();
		c1.withdraw(-500);
	
		
	}
}
