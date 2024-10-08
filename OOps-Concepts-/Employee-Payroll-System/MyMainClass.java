package employeePayroll;

public class MyMainClass {
	public static void main(String[] args)
	{
		Employee E1=new Employee("Rutu",102);
		E1.Salary=150000.00;
		System.out.println(E1);
		
		Employee E2=new Employee("Sandhya",103 ,50000.00);
		System.out.println(E2);

		
		Employee E3=new Employee("Sayali",103);
		E3.Salary=550000.00;
		System.out.println(E3.toString());

		
	}

}
