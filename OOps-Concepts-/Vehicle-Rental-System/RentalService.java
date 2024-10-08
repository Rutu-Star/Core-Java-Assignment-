package rentalSystem;

public class RentalService{
	
	public static void main(String[] args)
	{
		Bike B=new Bike();
		B.calculateRental(2);
		B.show();
		


		Car c1=new Car();
		c1.driverNeede("yes");
		c1.calculateRental(5);
		c1.show();
		
		Car c2=new Car();
		c2.calculateRental(5);
		c2.show();
		
		Truck t1=new Truck(500);
		t1.calculateRental(10);
		t1.show();
		
		
		

		//calculate total cost of all vehicles
		System.out.println("Total cost of all vehicles is : "+(B.TotalRate+c1.TotalRate+c2.TotalRate+t1.TotalRate));

		
		
	}

}
