package store;

public class GroceryStore extends ProductClass {
	

	GroceryStore(String Name ,double Price,int Quantity)
	{
		super(Name,Price,Quantity);
	}
	
	public void CalculateDiscount()
	{
		double discount;
	
		if(Price>=500)
		{
			double StorePrice;
			//10% discount
			discount=(Price*10)/100;
			StorePrice=Price-discount;
			System.out.println("Product: "+Name +", Original Price :"+Price +", Discounted Price : "+StorePrice);
		}
		else
		{
			System.out.println("No Discount.. Thank you for shoping 'Grocery Store '!");
		}
	}

}
