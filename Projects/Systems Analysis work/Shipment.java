
import java.util.ArrayList;
import java.util.Date;

public class Shipment 
{
	String address;
	Date shipmentDate;
	int cost;
	ArrayList<Order> listOfOrders;
	
	public Shipment()
	{
		 listOfOrders = new ArrayList<>();
		 shipmentDate = new Date();
		 cost = 0;
		 address = "";
	}
	
	public Shipment(ArrayList<Order> listOfOrders, int cost, Date shipmentDate, String address)
	{
		 this.listOfOrders = listOfOrders;
		 this.shipmentDate = shipmentDate;
		 this.cost = cost;
		 this.address = address;
	}
	
	public String getAddress(){ return address;}
	public int getCost(){ return cost;}
	public Date getShipmentDate(){ return shipmentDate;}
	public ArrayList<Order> getOrders(){ return listOfOrders;}
	
	public void setAddress(String address){ this.address=address;}
	public void setShipmentDate(Date shipmentDate){ this.shipmentDate=shipmentDate;}
	public void setCost(int cost){ this.cost=cost;}
	public void addListOfOrders(ArrayList<Order> listOfOrders){ listOfOrders.addAll(listOfOrders);}
}
