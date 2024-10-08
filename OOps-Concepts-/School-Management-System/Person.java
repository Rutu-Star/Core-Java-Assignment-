package schoolManagement;

public class Person {
	
	protected String Name;
	protected int Age;
	
	Person(String Name,int Age)
	{
		this.Name=Name;
		this.Age=Age;
	}
	
	void displayInfo()
	{
		System.out.println("Name : "+Name+", Age : "+Age);
	}

}
