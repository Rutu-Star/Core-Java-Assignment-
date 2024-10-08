package rentalSystem;

public abstract class Vehicle {
	
	String model;
	double baseRate;
	Vehicle(String model)
	{
		this.model=model;
		
	}
	public abstract double calculateRental(int days);

}
