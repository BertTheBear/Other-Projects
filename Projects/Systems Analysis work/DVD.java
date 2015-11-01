public class DVD extends MediaItem
{
	private String censorship;
	private String director;
	
	
	public DVD()
	{
		super();
		censorship="";
		director="";
	}
	
	public DVD(Type type, String title, String description, String censorship, String director, double price, double discount, int quantity, String mediaID)
	{
		super(type, title, description, price, discount, quantity, mediaID);
		this.censorship = censorship;
		this.director = director;
	}
	
	public void setcensorship(String censorship){	this.censorship = censorship;}
	public void setdirector(String director){		this.director = director;}
	
	public String getcensorship(){	return censorship;}
	public String getdirector(){	return director;}
	
	@Override
	public String toString() {
		return type.toString() + "," + title + "," + description + "," + censorship + "," + director + "," + price + "," + discount 
					+ "," + quantity + "," + mediaID;
	}
}