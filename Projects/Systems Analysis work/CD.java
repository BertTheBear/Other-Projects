public class CD extends MediaItem
{
	/*
	 * Extensible as MusicCD or GameCD
	 * Will add parameters such as String artist or String developer
	 *  	Polymorphism possible with getCreator() etc.
	 */
	private double minsLength;
	private String producer;
	
	/* Inherits
	  title="";
		description="";
		price=0;
		discount=0;
	 */
	public CD()
	{
		super();
		minsLength=0;
		producer = "";
	}
	
	public CD(Type type, String title, String description, String producer, double minsLength, double price, double discount, int quantity, String mediaID)
	{
		super(type, title,description,price, discount, quantity, mediaID);
		this.minsLength = minsLength;
		this.producer = producer;
	}
	
	public void setMinsLength(double minsLength){	this.minsLength = minsLength;}
	public void setProducer(String producer){	this.producer = producer;}
	
	public double getMinsLength(){	return minsLength;}
	public String getProducer(){	return producer;}
	
	@Override
	public String toString() {
		return type.toString() + "," + title + "," + description + "," + producer + "," + minsLength + "," + price + "," + discount 
				+ "," + quantity + "," + mediaID;
	}
}
