package rentalSystem;

public class Car extends Vehicle
{
	double TotalRate;
	double driverPrice;
	String driver="No";

	Car()
	{
		super("car");
	}
	
	public void driverNeede(String ans)
	{
		driver=ans;
	}
	
	public double calculateRental(int days) 
	{
		baseRate=100.00;//100 rs per day
		if(driver.equals("yes") || driver.equals("Yes") || driver.equals("YES"))
		{
			driverPrice=200;//per day
			TotalRate=baseRate*days+driverPrice*days;
			

		}
		else
		{ 
			
			TotalRate=baseRate*days;
	
		}
		
		return TotalRate;
	}
	
	public void show()
	{
		System.out.println("The total rent for the "+model+" is : "+TotalRate);
	}
	


}
