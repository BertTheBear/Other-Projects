
import java.text.ParseException;
import java.util.Date;

public class Order 
{
	private Date dateOfOrder;
	private double totalCharge, tax;
	private String mediaItemID;
	private String orderID;
	private int quantity;
	
	public Order()
	{
		dateOfOrder = new Date();
		totalCharge = 0; tax = 0;
		mediaItemID = "";
		orderID = "";
		quantity = 0;
	}
	
	public Order(String orderID, String mediaItemID, Date dateOfOrder, int quantity)
	{
		this.dateOfOrder = dateOfOrder;
		this.mediaItemID = mediaItemID;
		this.orderID = orderID;
		this.quantity = quantity;
		tax = 0.1;//Default, might change
	}
	
	//Takes input from file and separates the data
	public Order(String input) throws ParseException {
		String line[] = input.split(",");
		if(line.length < 4) {
			System.out.println("Error reading Order from file.");
			orderID = "";
		}
		else {
			orderID = line[0];
			mediaItemID = line[1];
			dateOfOrder = CLI_Menu.DATEFORMAT.parse(line[2]);
			quantity = Integer.parseInt(line[3]);
			
			tax = 0.21;//Default, might change
		}
	}
	
	public Date getDateOfOrder() { 	return dateOfOrder;}
	public String getOrderID() { 	return orderID;}
	public double getTotalCharge(){ return totalCharge; }
	public double getTaxRate() { 	return tax;}
	public double getTotalTax() 
	{ 
		return getTotalCharge() * tax;
	}
	public String getItemID() { return mediaItemID;}
	public int getQuantity() {		return quantity; }
	
	public void setDateOfOrder(Date dateOfOrder) { this.dateOfOrder = dateOfOrder; }
	public void setOrderID(String orderID) { this.orderID = orderID; }
	public void setTax(double tax) { this.tax = tax; }
	//public void setTotalCharge() {return totalCharge; }
	public void setQuantity(int quantity) { this.quantity = quantity; }
	
	public String toString() {
		return orderID + "," + mediaItemID + "," + CLI_Menu.DATEFORMAT.format(dateOfOrder) + "," + quantity;
	}
	
}
