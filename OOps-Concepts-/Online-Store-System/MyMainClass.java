package store;

public class MyMainClass {
	public static void main(String[] args)
	{
		ElectronicClass E1=new ElectronicClass("Mobile",10000,1);
		E1.CalculateDiscount();
		ElectronicClass E2=new ElectronicClass("HeadPhones",500,3);
		E2.CalculateDiscount();
		
		ClothingStore C1 =new ClothingStore("T-Shirt",200,11);
		C1.CalculateDiscount();
		ClothingStore C2 =new ClothingStore("Dress",5000,1);
		C2.CalculateDiscount();
		ClothingStore C3 =new ClothingStore("Pant",500,1);
		C3.CalculateDiscount();
		
		GroceryStore G1=new GroceryStore("Sugar",500,5);
		G1.CalculateDiscount();
		
		
		
	}

}
