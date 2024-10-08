package store;

public class ElectronicClass extends ProductClass{

	ElectronicClass(String Name ,double Price,int Quantity)
	{
		super(Name,Price,Quantity);
	}
	public void CalculateDiscount()
	{
		//if price is above 1000 then 10% discount on product
		if(Price>=1000)
		{
			double discount=(Price*10)/100;
			double StorePrice;
			StorePrice=Price-discount;
			System.out.println("Product: "+Name +", Original Price :"+Price +", Discounted Price : "+StorePrice);

		}
		else
		{
			System.out.println("No Discount.... Thank you for shoping 'Electronic Store' !");
		}
	}
}
