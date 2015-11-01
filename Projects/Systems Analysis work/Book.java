public class Book extends MediaItem
{
	/*
	 * Extensible with SchoolBook or ColouringBook
	 * 
	 */
	private String author;
	private int numberOfPages;
	
	public Book()
	{
		super();
		author="";
		numberOfPages=0;
	}
	
	public Book(Type type, String title, String description, String author, int numberOfPages, double price, double discount, int quantity, String mediaID)
	{
		super(type, title,description,price, discount, quantity, mediaID);
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	
	public void setauthor(String author){			this.author = author;}
	public void setnumberOfPages(int numberOfPages){this.numberOfPages = numberOfPages;}
	
	public String getauthor(){		return author;}
	public int getnumberOfPages(){	return numberOfPages;}
	
	@Override
	public String toString() {
		return type.toString() + "," + title + "," + description + "," + author + "," + numberOfPages + "," + price + "," + discount 
				+ "," + quantity + "," + mediaID;
	}
}
