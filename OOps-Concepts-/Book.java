package management;

public class Book {
	private String title;
	private String author;
	private int quantity=1;
	private int ISBN;
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	

	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	@Override
	public String toString() {
		return "Book Title= " + title + ", Author=" + author + ", Quantity=" + quantity + ", ISBN=" + ISBN ;
	}
	
	
	
	
	


	
	

}
