import java.util.ArrayList;

public class Basket 
{

	private ArrayList<MediaItem> listOfItems;
	private int basketCount = 0;
	
	public Basket()
	{
		listOfItems = new ArrayList<MediaItem>();
	}
	
	public ArrayList<MediaItem> listOfItems() { return listOfItems;}
	
	public void addItem(MediaItem theOrder) {
		boolean found = false;
		for(int i = 0; i < basketCount; i++) {
			if(listOfItems.get(i).getMediaID().equals(theOrder.getMediaID())) {
				listOfItems.get(i).setQuantity(theOrder.getQuantity() + listOfItems.get(i).getQuantity());
				found = true;
			}
		}
		if(!found) {
			listOfItems.add(theOrder);
			basketCount++;
		}
	}
	public boolean removeOrder(String itemID) {
		for(int i = 0; i < basketCount; i++) {
			if(listOfItems.get(i).getMediaID().equalsIgnoreCase(itemID) || listOfItems.get(i).getTitle().equalsIgnoreCase(itemID)) {
				listOfItems.remove(i);
				basketCount--;
				return true;
			}
		}
		return false;
	}
	

	public void listBasket() {
		for(MediaItem item : listOfItems) {
			System.out.println("Title of Media Item: \t" 		+ item.getTitle());
			System.out.println("ID of Media Item: \t \t" 		+ item.getMediaID());
			System.out.println("Type of Media Item: \t" 		+ item.getType().toString());
			System.out.println("Description of Media Item:\t" 	+ item.getDescription());
			System.out.println("Price of Media Item: \t" 		+ item.getPrice());
			if(item.getDiscount() > 0) {
				System.out.println("Discount of Media Item: \t" + item.getDiscount() + "\n");
				System.out.println("Total Price of Media Item: \t" 		+ (item.getPrice() * item.getDiscount()) + "\n");
			}
			else
				System.out.println("There is no discount on this item.\n");
		}
	}
	
	public void shortList() {
		
	}

}
