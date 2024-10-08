package drawingApplication;
import java.util.Scanner; 


public class MyMainClass {
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the shape from below  1.Circle  2.Rectangle C 3.Triangle");
		
		Shape S1=new Shape();
		S1.shape=obj.nextLine();
		
		
			if(S1.shape.equals("Circle") || S1.shape.equals("circle") || S1.shape.equals("CIRCLE") )
			{
				System.out.println("\nEnter the radious of Circle : \n");
				S1.radious=obj.nextFloat();
				S1.draw(S1.radious);
				
			}
			else if(S1.shape.equals("Rectangle") || S1.shape.equals("rectangle") || S1.shape.equals("RECTANGLE"))
			{
				System.out.println("\nEnter the lenght and width of Recatngle : \n");
				S1.length=obj.nextDouble();
				S1.width=obj.nextFloat();
				S1.draw(S1.length,S1.width);
			}
			else if(S1.shape.equals("Triangle") || S1.shape.equals("triangle") || S1.shape.equals("TRIANGLE"))
			{
				System.out.println("\nEnter the base  and height of triangle : \n");
				S1.base=obj.nextFloat();
				
				S1.height=obj.nextFloat();
				S1.draw(S1.base,S1.height);
			}
			else
			{
				System.out.println("Give valid shape name !");
			}
		
		 
		
		
		
		
		
		
	}

}
