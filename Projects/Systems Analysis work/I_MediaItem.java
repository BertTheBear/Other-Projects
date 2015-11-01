public interface I_MediaItem {
	//Getters
	public Type getType();
	public String getTitle();
	public double getPrice();
	public int getQuantity();
	public String getMediaID();
	public double getDiscount();
	public String getDescription();
	
	//Setters
	public void setTitle(	String title);
	public void setPrice(	double price);
	public void setQuantity(int quantity);
	public void setMediaID(	String mediaID);
	public void setDiscount(double discount);
	public void setDescription(String description);

	//To string for reading and writing
	public abstract String toString();
}