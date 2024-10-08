package schoolManagement;

public class Student extends Person{
	
	Student(String Name , int Age)
	{
		super(Name,Age);
	}
	protected  int  StudentId;
	protected String Grade;
	
	//override displayInfo()
	void displayInfo() {
		
		System.out.println("Student Information !");
		System.out.println("Name : "+Name+", Age : "+Age+", StudentId :"+StudentId+", Grade : "+Grade);
	}

}
