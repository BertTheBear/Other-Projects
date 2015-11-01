import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;


public class ManagerFunctionality extends EmployeeFunctionality {

	public boolean classFunctionality(User currentUser, MediaRentalSystem rentalSystem, Scanner input) throws IOException, ParseException {
		return managerFunctionalities(currentUser, rentalSystem, input);
	}
	
	public boolean classFunctionality(User currentUser, MediaRentalSystem rentalSystem, Basket basket, Scanner input) throws IOException, ParseException {
		return managerFunctionalities(currentUser, rentalSystem, input);
	}
	

	
	//------------------------------------------ MANAGER FUNCTIONALITIES
	public boolean managerFunctionalities(User currentUser, MediaRentalSystem rentalSystem, Scanner input) throws IOException, ParseException {
		boolean loop = true;
		String option;
		FactoryFactory stockFactory = new MediaItemFactory();
		
		ArrayList<MediaItem> stock = rentalSystem.getStock();

		//could implement interface to purchase as different users
		System.out.println("Menu Options\n"
				+ " 0. Return to login Menu.\n"
				+ " 1. Edit Stock Inventory.\n"
				+ " 2. Place order for more stock.\n"
				+ " 3. View all stock.\n"
				+ " 4. View account details.\n"
				+ " 5. Return Stock.\n");
		System.out.println("Leave blank to return to previous menu.\n");
		System.out.print("Your selection:\t");
		option = input.nextLine();
		
		if(option.equals("0") || option.isEmpty()) {
			System.out.println("Returning to previous menu.\n");
			return false;
		}
		else if(option.equals("1"))
		{
			System.out.println(" 0. Return to previous Menu.\n"
					+ " 1. Update details of an item of stock.\n"
					+ " 2. Register new stock item.");
			System.out.print("Your selection: \t");
			option = input.nextLine();
			if(option.equals("0") || option.isEmpty())
				System.out.println("Returning to previous menu.\n");
			else if(option.equals("1"))
			{
				stock = editInventory(stock, input); //From method in superclass
			}
			else if(option.equals("2"))
			{
				System.out.println("Please choose the type of Stock:");
				System.out.println(" 0. Cancel\n"
						+ " 1. Book\n"
						+ " 2. CD\n"
						+ " 3. DVD");
				option = input.nextLine();
				if(option.isEmpty() || option.equals("0")) 
				{
					System.out.println("Returning to previous menu.\n");
				}
				else {
					int selection = Integer.parseInt(option);
					boolean cont = true;

					String itemData = "";
					String itemType = "";
					switch(selection) {
					case 1:
						itemData = "BOOK";
						itemType = "Book";
						break;
					case 2:
						itemData = "CD";
						itemType = "CD";
						break;
					case 3:
						itemData = "DVD";
						itemType = "DVD";
						break;
					default:
							System.out.println("Incorrect Entry! Please try again!");
							cont = false;
					}
					if(cont) {
						System.out.print("Please enter the title of the new " + itemType + ":\t");
						String check = input.nextLine();
						check = check.replace(",", "");//Remove any commas that would tamper with formatting
						
						if(rentalSystem.getStock(check) != null)
							System.out.println("Stock with that title already exists.");
						else {
							itemData +=  "," + check;
							
							System.out.print("Please enter the description of the new " + itemType + ":\t");
							check = input.nextLine().replace(",", "");
							if(check.equals(""))
								check = "No Description";
							itemData +=  "," + check;
							if(itemType.equals("Book")) {
								System.out.print("Please enter the author of the new Book:\t");
								check = input.nextLine().replace(",", "");
								itemData +=  "," + check;
								System.out.print("Please enter the pages of the new Book:\t");
								check = input.nextLine();
								if(check.matches("{1+}[0-9]"))
									itemData +=  "," + check;
								else {
									System.out.println("Invalid Input. Defaulting value to 1.");
									itemData += ",1";
								}
							}
							else if(itemType.equals("CD")) {
								System.out.print("Please enter the producer of the new CD:\t");
								check = input.nextLine().replace(",", "");
								itemData +=  "," + check;
								System.out.print("Please enter the length (in minutes) of the new CD:\t");
								check = input.nextLine();
								if(check.matches("{1+}[0-9].{0+}[0-9]"))
									itemData +=  "," + check;
								else {
									System.out.println("Invalid Input. Defaulting value to 1.");
									itemData += ",1";
								}
							}
							else if(itemType.equals("DVD")) {
								System.out.print("Please enter the censorship of the new DVD:\t");
								check = input.nextLine().replace(",", "");
								itemData +=  "," + check;
								System.out.print("Please enter the director of the new DVD:\t");
								check = input.nextLine().replace(",", "");
								itemData +=  "," + check;
							}
							
							System.out.print("Please enter the price of the new " + itemType + ":\t");
							check = input.nextLine();
							if(check.matches("{1+}[0-9]"))
								itemData +=  "," + check;
							else {
								System.out.println("Invalid Input. Defaulting value to 1.");
								itemData += ",1";
							}
							
							itemData +=  ",0";//No initial discount
							
							System.out.print("Please enter the quantity of the new " + itemType + ":\t");
							check = input.nextLine();
							if(check.matches("[0-9]"))
								itemData +=  "," + check;
							else {
								System.out.println("Invalid Input. Defaulting value to 1.");
								itemData += ",1";
							}
							
							check = UUID.randomUUID().toString().replace(",", "");
							check = check.substring(0,8);
							itemData +=  "," + check;
							
							rentalSystem.addStockToList(stockFactory.createMediaItem(itemData));
						}
					}
				}
			}
		}
		else if(option.equals("2"))
		{
			//create new order, present options to create one, what do you want, how many, check database
			System.out.print("Please enter the ID of the item you'd like to order: ");
			option = input.nextLine();
			for(MediaItem stocks : stock)
			{
				if(stocks.getMediaID().equals(option))
				{
					System.out.println("The item " + stocks.getTitle() + " exists!");
					System.out.print("Please enter the quantity of this item you'd like to order: \t");
					String selection = input.nextLine();
					if (selection.matches("[0-9]")) {
						int qty = Integer.parseInt(selection);
						if(!rentalSystem.modifyStock(stocks, qty)) {
							System.out.println("Not enough items in stock. Transaction cancelled.");
							rentalSystem.modifyStock(stocks, -qty);
						}
						else {
							Date today = new Date();
							String ID = UUID.randomUUID().toString().replace(",", "");
							ID = ID.substring(0,8);
							Order order = new Order(ID, stocks.getMediaID(), today, qty);
							rentalSystem.addOrderToList(order);				//Add to list. All other eventualities do not
						}
					}
					else {
						System.out.println("Invalid input.");
					}
				}
				else {
					System.out.println("No item of that ID found. \n\n");
				}
			}
			
		}
		else if(option.equals("3")) {
			
			for(MediaItem item : stock)
			{
				System.out.println("Listing all stock items.\n");
				
				System.out.println("Type of Item: \t" + item.getType());
				System.out.println("Title of Item: \t" + item.getTitle());
				System.out.println("Price of Item: \t" + item.getPrice());
				if(item.getDiscount() > 0)
					System.out.println("Item Discount: \t" + item.getDiscount());
				System.out.println("Quantity of Item: \t" + item.getQuantity() + "\n");
			}
		}
		else if(option.equals("4"))
		{
			
			System.out.println("Type of User: " + currentUser.getType());
			System.out.println("Name of User: " + currentUser.getName());
			System.out.println("Email of User: " + currentUser.getEmail());
			System.out.println("Phone of User: " + currentUser.getPhone());
			System.out.println("Registration Date of User: " + CLI_Menu.DATEFORMAT.format(currentUser.getJoinDate()) + "\n");	
		}
		else if(option.equals("5"))
		{
			System.out.print("Please enter the ID or the title of the item you'd like to return: ");
			String title = input.nextLine();
			for(MediaItem stocks : stock)
			{
				if(stocks.getTitle().trim().equalsIgnoreCase(title.trim()) || stocks.getMediaID().equals(title))
				{
					System.out.println("The item " + stocks.getTitle() + " exists!");
					System.out.print("Please enter the quantity of this item you'd like to return: ");
				    int qty = input.nextInt();
				    rentalSystem.modifyStock(stocks, qty);
				}
			}
		}
		else {
			System.out.println("Invalid input. Please try again.\n\n");
		}
	return loop;
	}
	
	
	
	
}
