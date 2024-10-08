package store;

public class ProductClass {
	String Name;
	double Price;
	int Quantity;
	
	ProductClass(String Name ,double Price,int Quantity)
	{
		this.Name=Name;
		this.Price=Price;
		this.Quantity=Quantity;
	}
	
	public void CalculateDiscount()
	{
	//default no discount 
	}

}
