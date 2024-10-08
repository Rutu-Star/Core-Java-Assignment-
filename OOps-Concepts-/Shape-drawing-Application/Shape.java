package drawingApplication;

public class Shape {

	String shape;
	float radious;
	double length;
	float width;
	float base;
	float height;
	
	
	
	void draw(float radious)
	{
		this.radious=radious;
		System.out.println("Shape's Name : "+shape+", Radious : "+radious);
		
	}
	 
	void draw(double lenght, float width)
	{
		this.length=lenght;
		this.width=width;
		System.out.println("Shape's Name : "+shape+", Lenght : "+lenght+", Width : "+width);
	}
	
	void draw(float base, float height)	
	{
		this.base=base;
		this.height=height;
		System.out.println("Shape's Name : "+shape+", Base : "+base+", height : "+height);
	}
	
	
}
