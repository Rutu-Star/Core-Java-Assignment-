package store;

public class ClothingStore extends ProductClass {
	
	ClothingStore(String Name ,double Price,int Quantity)
	{
		super(Name,Price,Quantity);
	}
	public void CalculateDiscount()
	{
		double discount;
		
		if(Price>=5000)
		{
			double StorePrice;
			//30% discount
			discount=(Price*30)/100;
			StorePrice=Price-discount;
			System.out.println("Product: "+Name +", Original Price :"+Price +", Discounted Price : "+StorePrice);
		}
		else if(Quantity>=10)
		{
			double StorePrice;
			double TotalPrice=Price*Quantity;
			//10% discount
			discount=(TotalPrice*30)/100;
			StorePrice=TotalPrice-discount;
			System.out.println("Product: "+Name +", Original Price :"+Price +", Quantity :"+Quantity+", Total Price: "+TotalPrice+", Discounted Price : "+StorePrice);
		}
		else
		{
			System.out.println("No Discount.... Thank you for shoping 'Clothing Store' !");
		}
		
	}


}
