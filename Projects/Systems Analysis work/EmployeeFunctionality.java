import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeFunctionality implements I_ClassFunctionality {
	
	public boolean classFunctionality(User currentUser, MediaRentalSystem rentalSystem, Scanner input) throws IOException, ParseException {
		return employeeFunctionalities(currentUser, rentalSystem, input);
	}
	
	public boolean classFunctionality(User currentUser, MediaRentalSystem rentalSystem, Basket basket, Scanner input) throws IOException, ParseException {
		return employeeFunctionalities(currentUser, rentalSystem, input);
	}
	
	

	//------------------------------------------- EMPLOYEE FUNCTIONALITIES
	private boolean employeeFunctionalities(User currentUser, MediaRentalSystem rentalSystem, Scanner input) throws IOException, ParseException {
		boolean loop = true;
		String option;
		ArrayList<MediaItem> stock = rentalSystem.getStock();
		
		
		System.out.println("Menu Options\n"
				+ " 0. Return to login Menu.\n"
				+ " 1. Browse Media Inventory.\n"
				+ " 2. Search for Media Item.\n"
				+ " 3. Edit an item in stock.\n"
				+ " 4. Return an Item. \n"
				+ " 5. View account details.");
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
				if(stockItem.getDiscount() > 0)
					System.out.println("Discount of Media Item: \t" + stockItem.getDiscount() + "\n");
				else
					System.out.println("There is no discount on this item.\n");
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
		
		else if(option.equals("3"))			//Not sure what this does
		{
			stock = editInventory(stock, input);
		}
		
		else if(option.equals("4"))
		{
			System.out.print("Please enter the ID or the title of the item you'd like to return: ");
			String title = input.nextLine();
			for(MediaItem stocks : stock)
			{
				if(stocks.getTitle().trim().equalsIgnoreCase(title.trim()) || stocks.getMediaID().equals(title))
				{
					System.out.println("The item " + stocks.getTitle() + " exists!");
					System.out.print("Please enter the quantity of this item you'd like to return: ");
				    int qty= input.nextInt();
				    rentalSystem.modifyStock(stocks, qty);
				}
			}
		}
		
		else if(option.equals("5"))
		{
			
			System.out.println("Type of User: " + currentUser.getType());
			System.out.println("Name of User: " + currentUser.getName());
			System.out.println("Email of User: " + currentUser.getEmail());
			System.out.println("Phone of User: " + currentUser.getPhone());
			System.out.println("Registration Date of User: " + CLI_Menu.DATEFORMAT.format(currentUser.getJoinDate()) + "\n");	
		}
		else {
			System.out.println("Invalid input. Please try again.\n\n");
		}
		return loop;
	}



	

	
	
	
	
	protected ArrayList<MediaItem> editInventory(ArrayList<MediaItem> stock, Scanner input) {
		String option;
		System.out.print("Please enter the ID or title of the media Item you'd like to update.\n"
				+ "Title or ID: \t");
		option = input.nextLine();
		boolean found = false;
		for(int i=0; i < stock.size(); i++)
		{
			if(stock.get(i).getTitle().contains(option) || stock.get(i).getMediaID().equals(option))
			{
				found = true;
				System.out.println("ID of Media Item: " + stock.get(i).getMediaID());
				System.out.println("Type of Media Item: " + stock.get(i).getType().toString());
				System.out.println("Enter a new title if you would like to change it.\n"
						+ "Leave blank to not change the title.");
				System.out.print("New Title of Media Item: \t");
				option = input.nextLine();
				if(!option.trim().isEmpty())
					stock.get(i).setTitle(option);
				else
					System.out.println("Entry blank. Value unchanged.\n");
				System.out.println("Description of Media Item: " + stock.get(i).getDescription());
				System.out.println("Enter a new description if you would like to change it.\n"
						+ "Leave blank to not change the price.");
				System.out.print("New Description of Media Item: \t");
				option = input.nextLine();
				if(!option.trim().isEmpty())
					stock.get(i).setDescription(option);
				else
					System.out.println("Entry blank. Value unchanged.\n");
				System.out.println("Price of Media Item: " + stock.get(i).getPrice());
				System.out.println("Enter a new price if you would like to change it.\n"
						+ "Leave blank to not change the price.");
				System.out.print("New Price of Media Item: \t");
				option = input.nextLine();
				double value = 0;
				if(option.trim().isEmpty()) {
					stock.get(i).setDescription(option);
					System.out.println("Entry blank. Value unchanged.\n");
				}
				else {
					value = Double.parseDouble(option);
					if(value > 0)
						stock.get(i).setPrice(value);
				}
				System.out.println("Discount of Media Item: " + stock.get(i).getDiscount() + "\n");
				System.out.println("Enter a new discount if you would like to change the current value.\n"
						+ "Leave blank to not change the title.");
				System.out.print("New discount of Media Item: \t");
				option = input.nextLine();
				if(option.trim().isEmpty()){
					stock.get(i).setDescription(option);
					System.out.println("Entry blank. Value unchanged.\n");
				}
				else {
					value = Double.parseDouble(option);
					if(!(value < 0 && value > 100))
						stock.get(i).setDiscount(value);
				}
			}
		}
		if(!found)
			System.out.println("Item not found.");
		
		return stock;
	}

}
