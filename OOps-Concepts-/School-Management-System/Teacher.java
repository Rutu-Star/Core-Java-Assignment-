package schoolManagement;

public class Teacher extends Person{
	
	protected String  EmployeeId;
	protected String Subject;
	
	Teacher(String Name , int Age,String EmployeeId,String Subject)
	{
		super(Name,Age);
		this.EmployeeId=EmployeeId;
		this.Subject=Subject;
	}
	
	//override displayInfo()
	void displayInfo() {
		
		System.out.println("Teacher Information !");
		System.out.println("Name : "+Name+", Age : "+Age+", EmployeeId :"+EmployeeId+", Subject :"+Subject);
	}
	

}
