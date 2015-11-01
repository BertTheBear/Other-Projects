import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;


public class CustomerFunctionality implements I_ClassFunctionality {
	
	public boolean classFunctionality(User currentUser, MediaRentalSystem rentalSystem, Scanner input) throws IOException, ParseException {
		Basket basket = new Basket();
		return customerFunctionalities(currentUser, rentalSystem, basket, input);
	}
	
	public boolean classFunctionality(User currentUser, MediaRentalSystem rentalSystem, Basket basket, Scanner input) throws IOException, ParseException {
		return customerFunctionalities(currentUser, rentalSystem, basket, input);
	}
	
//------------------------------------------- CUSTOMER FUNCTIONALITIES
	private boolean customerFunctionalities(User currentUser, MediaRentalSystem rentalSystem, Basket basket, Scanner input) throws IOException, ParseException {
		String option;
		boolean loop = true;
		ArrayList<MediaItem> stock = rentalSystem.getStock();
		
		System.out.println("Menu Options\n"
				+ " 0. Return to login Menu.\n"
				+ " 1. Browse Media Inventory.\n"
				+ " 2. Search for Media Item.\n"
				+ " 3. View Shopping Cart. \n"
				+ " 4. Remove an item from your Basket.\n"
				+ " 5. View Account Details.\n");
		System.out.println("Leave blank to return to previous menu.\n");
		System.out.print("\nYour selection:\t");
		option = input.nextLine();
		if(option.equals("0") || option.isEmpty()) {
			System.out.println("Returning to Previous Menu.\n\n");
			return false;
		}
		else if(option.equals("1"))
		{
			for(MediaItem stockItem : stock)
			{
				System.out.println("ID of Media Item: " + stockItem.getMediaID());
				System.out.println("Type of Media Item: " + stockItem.getType().toString());
				System.out.println("Title of Media Item: " + stockItem.getTitle());
				System.out.println("Description of Media Item: " + stockItem.getDescription());
				System.out.println("Price of Media Item: " + stockItem.getPrice());
				if(stockItem.getDiscount() > 0) {
					System.out.println("Discount of Media Item: \t" + stockItem.getDiscount() + "\n");
					System.out.println("Total Price of Media Item: \t" 		+ (stockItem.getPrice() * stockItem.getDiscount()) + "\n");
				}
				else
					System.out.println("There is no discount on this item.\n");
				
				System.out.print("To add this item to your basket, please enter the quantity below.\n"
						+ "Leave blank or enter 0 if you do not wish to add this item to your basket.");
				
				option = input.nextLine();
				if(option.isEmpty()) {
					System.out.println("No items added to basket.\n");
				}
				else {
					try {
						int qty = Integer.parseInt(option);
						if(qty < 0)
							System.out.println("No items added to basket.\n");
						else {
							MediaItem theOrder = stockItem;
							theOrder.setQuantity(qty);
							basket.addItem(theOrder);
							System.out.println(qty + " items added to basket.\n");
						}
					}catch (NumberFormatException ex) {

						System.out.println("No items added to basket.\n");
					}
				}
			}
		}
		else if(option.equals("2"))
		{
			System.out.println("Please enter the ID or title of the media Item you'd like to search for: ");
			option = input.nextLine();
			for(int i=0; i < stock.size(); i++)
			{
				if(stock.get(i).getTitle().contains(option) || stock.get(i).getMediaID().equals(option))
				{
					System.out.println("ID of Media Item: " + stock.get(i).getMediaID());
					System.out.println("Type of Media Item: " + stock.get(i).getType().toString());
					System.out.println("Title of Media Item: " + stock.get(i).getTitle());
					System.out.println("Description of Media Item: " + stock.get(i).getDescription());
					System.out.println("Price of Media Item: " + stock.get(i).getPrice());
					if(stock.get(i).getDiscount() > 0)
						System.out.println("Discount of Media Item: \t" + stock.get(i).getDiscount() + "\n");
					else
						System.out.println("There is no discount on this item.\n");
				}
			}
		}
		else if(option.equals("3"))
		{
	
			basket.listBasket();
			System.out.println("\n");
		}
		else if(option.equals("4"))
		{
			
			System.out.println("Please enter the ID of the media Item you'd like to remove from your basket.");
			System.out.print("ID of item: \t");
			option = input.nextLine();
			if(option.trim().isEmpty())
				loop = false;
			else if(basket.removeOrder(option))
				System.out.println("Item removed from basket.");
			else
				System.out.println("Item not found in basket.");				
		}
		
		else if(option.equals("5"))
		{
			System.out.println("Type of User: \t" + currentUser.getType());
			System.out.println("Name of User: \t" + currentUser.getName());
			System.out.println("Email of User: \t" + currentUser.getEmail());
			System.out.println("Phone of User: \t" + currentUser.getPhone());
			System.out.println("Registration Date of User: " + CLI_Menu.DATEFORMAT.format(currentUser.getJoinDate()) + "\n");
		}
		else {
			System.out.println("Invalid input. Please try again.\n\n");
		}
		return loop;
	}

}
