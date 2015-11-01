public abstract class MediaItem implements I_MediaItem {

	protected String title, description, mediaID;
	protected double price, discount = 0;
	protected Type type;
	protected int quantity;
	
	public MediaItem()
	{
		type = Type.ERROR;
		title = "";
		description = "";
		price = 0;
		discount = 0;
		mediaID = "";
	}
	
	public MediaItem(Type type, String title, String description, double price, double discount, int quantity, String mediaID)
	{
		this.type = type;
		this.title = title;
		this.description = description;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.mediaID = mediaID;
	}
	
	public Type getType(){			return type; } //No set type because that's stupid
	public String getTitle() {		return title; }
	public double getPrice() {		return price; }
	public String getMediaID() {	return mediaID; }
	public int getQuantity() {		return quantity; }
	public double getDiscount() {	return discount; }
	public String getDescription() {return description; }
 	
	public void setTitle(String title) {		this.title=title; }
	public void setPrice(double price) {		this.price=price; }
	public void setMediaID(String mediaID) {	this.mediaID= mediaID; }
	public void setQuantity(int quantity) {		this.quantity = quantity; }
	public void setDiscount(double discount) {	this.discount = discount; }
	public void setDescription(String description) { this.description=description; }

	public abstract String toString();
}