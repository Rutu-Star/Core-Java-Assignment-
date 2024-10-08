package rentalSystem;

public class Truck extends Vehicle{
	
	double TotalRate;
	String  driver="No";
	double driverPrice;
	double diselePrice;
	
	
	Truck(double diselePrice)
	{
	
		super("Truck");
		this.diselePrice=diselePrice;
	}
	
	
	public void driverNeede(String ans)
	{
		driver=ans;
	}
	
	
	@Override
	public double calculateRental(int days) {
		// TODO Auto-generated method stub
		 
		baseRate=500;//rs 500 per day
		if(driver.equals("yes") || driver.equals("Yes") || driver.equals("YES"))
		{
			driverPrice=500;
			TotalRate=baseRate*days+driverPrice*days+diselePrice;
		}
		else
		{ 
			
			TotalRate=baseRate*days+diselePrice;
		}
		
		return TotalRate;
	}
	
	
	
	public void show()
	{
		System.out.println("The total rent for the "+model+" is : "+TotalRate);
	}
	
	

}
