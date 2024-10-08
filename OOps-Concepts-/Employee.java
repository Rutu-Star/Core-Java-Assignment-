package employeePayroll;

public class Employee {
	
	String Name;
	int EmployeeId;
	double Salary;
	double hra=6000.00;//housing rent allowance
	double Tax;//Tax based on employee salary
	
	Employee(String Name,int EmployeeId)
	{
		this.Name=Name;
		this.EmployeeId=EmployeeId;
	}
	
	Employee(String Name,int EmployeeId, double Salary)
	{
		this.Name=Name;
		this.EmployeeId=EmployeeId;
		this.Salary=Salary;
	}
	
	double CalculatePay()
	{
		if(Salary<=100000.00)
		{
			//1% tax
			Tax=(Salary*1)/100;
		}
		else if(Salary>100000.00 && Salary<=500000.00)
		{
			//2% tax
			Tax=(Salary*2)/100;

		}
		else
		{
			//3% tax
			Tax=(Salary*3)/100;

		}
		
		return (Salary+hra)-Tax;
		
	}

	@Override
	public String toString () 
	{
		return "Employee Name=" + Name + ", EmployeeId=" + EmployeeId + ", Salary=" + CalculatePay() ;
	}
	
	

}
