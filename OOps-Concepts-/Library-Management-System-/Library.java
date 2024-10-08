package management;

public class Library {

	Book b;
	void add(Book b)
	{
		this.b=b;
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		Book b=new Book();
		b.setTitle("Life of Pi");
		b.setAuthor("Yann Martel");
		b.setISBN(10258);
		
		Book b1=new Book();
		b1.setTitle("Yayati");
		b1.setAuthor("V.S.Khandekar");
		b1.setISBN(10259);
		b1.setQuantity(5);
		
		Book b2=new Book();
		b2.setTitle("Panchatantra");
		b2.setAuthor("Vishnu Sharma");
		b2.setISBN(10260);
		b2.setQuantity(4);
		
		Book b3=new Book();
		b3.setTitle("Shivaj Maharaj");
		b3.setAuthor("Babasaheb Purandare");
		b3.setISBN(10261);
		b3.setQuantity(10);
		
		Book b4=new Book();
		b4.setTitle("Mrityunjay");
		b4.setAuthor("Shivaji Sawant");
		b4.setISBN(10262);
		b4.setQuantity(7);
		
		
		
		
		Library l1=new Library();
		l1.add(b);
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
	
		System.out.println(b.toString());//explicitly calling method
		System.out.println(b1.toString());

		System.out.println(b2);//implicitly calling method
		System.out.println(b3);
		System.out.println(b4);
		
		
		
	}
}
