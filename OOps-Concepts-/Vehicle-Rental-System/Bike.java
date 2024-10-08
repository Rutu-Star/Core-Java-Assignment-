package rentalSystem;

public class Bike extends Vehicle {

	double TotalRate;
	Bike()
	{
		super("Bike");
	}
	
	@Override
	public double calculateRental(int days) 
	{
		baseRate=50.00;//rs 50 per day
		TotalRate=baseRate*days;
		return TotalRate;
	}
	public void show()
	{
		System.out.println("The total rent for the "+model+" is : "+TotalRate);
	}
	
	
}
