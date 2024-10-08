package schoolManagement;

public class MyMainClass {
	public static void main(String[] args)
	{
		Teacher T1=new Teacher("Rutu",28,"A12","Maths");
		T1.displayInfo();
		
		
		Student S1=new Student("Sayali",12);
		S1.StudentId=102;
		S1.Grade="A++";
		S1.displayInfo();
	}

}
