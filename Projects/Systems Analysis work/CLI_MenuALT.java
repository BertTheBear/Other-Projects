	import java.io.Console;
	import java.io.IOException;
	import java.util.Date;
	import java.text.DateFormat;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.UUID;

	public class CLI_MenuALT extends CLI_Menu{ //Uses console instead of Scanner

	public final static DateFormat DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	Console input;
		
		public void run(MediaRentalSystem rentalSystem) throws IOException, ParseException
		{
			input = System.console();
			boolean loop, go = true;
			User currentUser;//--------------------------
			System.out.println("Welcome to the DVD Rental System.");
			while(go)
			{
				System.out.println("\nTo sign in, enter your username or leave blank to exit!");
				currentUser = logIn(rentalSystem);
				loop = true;
				
				if(currentUser == null) {
					go = false;
					System.out.println("\nExiting System...");
					rentalSystem.exit();
					System.out.println("System exited.");
				}
				else {
					while(loop){
						Type userType = currentUser.getType();
						switch(userType) {
							case CUSTOMER:
								while(loop) {
									loop = customerFunctionalities(currentUser, rentalSystem);
								}
							break;
							
							case EMPLOYEE:
								while(loop) {
									loop = employeeFunctionalities(currentUser, rentalSystem);
								}
								break;
							
							case MANAGER:
								while(loop) {
									loop = managerFunctionalities(currentUser, rentalSystem);
								}
							break;
							
							case ADMINISTRATOR: case ADMIN:
								while(loop) {
									loop = adminFunctionalities(currentUser, rentalSystem);
								}
							break;
							
							default:
								System.out.println("User-type Error");
								loop = false;
						}
					}
				}
			}
			//input.close();
		}
		
		//----------------------------------- LOGIN
		private User logIn(MediaRentalSystem rentalSystem) throws IOException, ParseException {
			
			System.out.print("Please enter your username:\t");
			String option = input.readLine();
			if(option.matches("")){
				return null;
			}
			User currentUser = rentalSystem.getUser(option);
			if(currentUser != null) {
				for(int i = 3; i > 0; i--) {
					System.out.print("\nYou have " + i + " attempts remaining.\nPlease enter your password:\t");
					char[] password = input.readPassword();
					option = new String(password);
					if(option.matches(currentUser.getPassword())) {
						System.out.println("Login successful.\n");
						return currentUser;
					}
				}
				System.out.println("You have no more attempts remaining.\nSystem exiting.");
				return null;
			}
			else
				System.out.println("No user of that name found. Please try again.");
			return logIn(rentalSystem);
		}
		
		
		
		
		//------------------------------------ADMIN FUNCTIONALITIES
		private boolean adminFunctionalities(User currentUser, MediaRentalSystem rentalSystem) throws IOException, ParseException {
			FactoryFactory userFactory = new UserFactory();//-----------------------------------
			String option, option2, userData = ""; 
			String name, accountType = "";
			ArrayList<User> listOfUsers;
			ArrayList<MediaItem> stock;
			boolean loop = true;
			
			System.out.println("\nMenu Options:\n\n"
					+ " 0. Return to previous menu.\n"
					+ " 1. Register User \n"
					+ " 2. Search for User\n"
					+ " 3. Remove User\n"
					+ " 4. Search Stock Inventory\n"
					+ " 5. Edit Stock Inventory\n"
					+ " 6. View all User Account details\n"
					+ " 7. View your account details");
			System.out.println("Leave blank to return to previous menu.\n");
			System.out.print("\nYour selection:\t");
			option = input.readLine();
			if(option.isEmpty()) {
				return false;
			}
			if(option.equals("0"))		//Register user
			{
				return false;
			}
			if(option.equals("1")) {
				while(loop)
				{
					System.out.println("Leave blank to return to previous menu.\n");

					System.out.println(" 0. Return to previous Menu\n"
							+ " 1. Administrator\n"
							+ " 2. Manager\n"
							+ " 3. Employee\n"
							+ " 4. Customer");
					System.out.print("Please choose the type of User:\t");
					option = input.readLine();
					if(option.isEmpty() || option.equals("0")) 
					{
						System.out.println("Returning to previous menu.\n");
						loop = false;
					}

					int selection = Integer.parseInt(option);
					
					boolean cont = true;
					
					switch(selection) {
					case 1:
						userData = "ADMINISTRATOR";
						accountType = "Administrator";
						break;
					case 2:
						userData = "MANAGER";
						accountType = "Manager";
						break;
					case 3:
						userData = "EMPLOYEE";
						accountType = "Employee";
						break;
					case 4:
						userData = "CUSTOMER";
						accountType = "Customer";
						break;
						default:
							System.out.println("Incorrect Entry! Please try again!");
							cont = false;
					}
					
					if(cont) {
						System.out.print("Please enter the name of the new " + accountType + ": \t \t");
						name = input.readLine();
						String check = name.replace(",", ""); //Remove any commas that would tamper with formatting
						
						if(rentalSystem.getUser(check) != null)
							System.out.println("User with that name already exists.");
						else {
							userData +=  "," + check;
							
							System.out.print("Please enter the password of the new " + accountType + ": \t \t");
							String password = input.readLine().replace(",", ""); //Password should be asked after username
		
							System.out.print("Please enter the email address of the new " + accountType + ": \t");//We will allow duplicate emails
							check = input.readLine().replace(",", "");
							userData +=  "," + check;
		
							System.out.print("Please enter the phone number of the new " + accountType + ": \t");
							check = input.readLine().replace(",", "");
							userData +=  "," + check;
		
							userData +=  "," + password;		//Password is asked after username but put in the string much later
							
							Date today = new Date();
							userData += "," + CLI_Menu.DATEFORMAT.format(today);
							
							if(accountType.equals("Customer")) {
								System.out.print("Please enter the address of the new Customer: \t \t");
								check = input.readLine().replace(",", "");
								userData +=  "," + check;
							}
		
							rentalSystem.addUserToList(userFactory.createUser(userData));
						}
					}
				}
				loop = true;//----------------------------------------
			}
			else if(option.equals("2"))		//Search for user
			{
					listOfUsers = rentalSystem.getListOfUsers();
					
					while(loop)//--------------------------------
					{
						System.out.println("You may also enter the name of the user to search or press enter or 0 to exit.");
						option = input.readLine();
						boolean found = false;
						if(option.equalsIgnoreCase("0") || option.equalsIgnoreCase(""))
						{
							loop = false;
						}
						else
						{
							for(User users : listOfUsers)
							{
								if(users.getName().equals(option))
								{
									System.out.println("User found! \n");
									System.out.println("Type of User: \t" + users.getType());
									System.out.println("Name of User: \t" + users.getName());
									System.out.println("Email of User: \t" + users.getEmail());
									System.out.println("Phone of User: \t" + users.getPhone());
									System.out.println("Registration Date of User: " + CLI_Menu.DATEFORMAT.format(users.getJoinDate()) + "\n");
									
									found = true;
								}
							}
							if(!found)
								System.out.println("User not found! Please check spelling!\n\n");
						}
					}
					loop = true;//-----------------------------------
			}
			
			else if(option.equals("3"))
			{
				listOfUsers = rentalSystem.getListOfUsers();
				for(User users : listOfUsers)
				{
					System.out.println("Type of User: \t" + users.getType());
					System.out.println("Name of User: \t" + users.getName() + "\n");
				}
				System.out.print("Please enter the name of the user you wish to remove:\t");
				option = input.readLine();
				
				for(User users : listOfUsers)
				{
					if(users.getName().equalsIgnoreCase(option) && !currentUser.getName().equalsIgnoreCase(option))
					{
						rentalSystem.removeUserFromList(option);
					}
				}
				
			}
			
			else if(option.equals("4"))
			{
				stock = rentalSystem.getStock();
				for(int i=0; i < stock.size(); i++)
				{
					System.out.println(stock.get(i).getTitle());
					System.out.println(stock.get(i).getPrice());
					System.out.println(stock.get(i).getDescription() + "\n");
				}
				
				System.out.println("Please enter the title of the media Item you'd like to search for: ");
				option = input.readLine();
				for(int i=0; i < stock.size(); i++)
				{
					if(stock.get(i).getTitle().contains(option))
					{
						System.out.println(stock.get(i).getTitle());
						System.out.println(stock.get(i).getPrice());
						System.out.println(stock.get(i).getDescription() + "\n");
					}
				}
			}
			
			else if(option.equals("5"))
			{
				stock = rentalSystem.getStock();
				for(int i=0; i < stock.size(); i++)
				{
					System.out.println(stock.get(i).getTitle());
					System.out.println(stock.get(i).getPrice());
					System.out.println(stock.get(i).getDescription() + "\n");
				}
				
				System.out.print("Please enter the title of the media Item you wish to remove:\t");
				option = input.readLine();
				for(int i=0; i < stock.size(); i++)
				{
					if(stock.get(i).getTitle().contains(option))
					{
						System.out.println("Would you like to delete?" + stock.get(i).getTitle());
						option2 = input.readLine();
						if(option2.equals("yes") || option2.equals("y"))
							rentalSystem.removeStockFromList(stock.get(i).getTitle());
					}
				}
			}
			
			else if(option.equals("6"))
			{
				System.out.println("List of User accounts: \n");
				listOfUsers = rentalSystem.getListOfUsers();
				for(User users : listOfUsers)
				{
					System.out.println("Type of User: \t" + users.getType());
					System.out.println("Name of User: \t" + users.getName());
					System.out.println("Email of User: \t" + users.getEmail());
					System.out.println("Phone of User: \t" + users.getPhone());
					System.out.println("Registration Date of User: " + CLI_Menu.DATEFORMAT.format(users.getJoinDate()) + "\n");
				}
			}
			
			else if(option.equals("7"))
			{
				{
					System.out.println("Type of User: " + currentUser.getType());
					System.out.println("Name of User: " + currentUser.getName());
					System.out.println("Email of User: " + currentUser.getEmail());
					System.out.println("Phone of User: " + currentUser.getPhone());
					System.out.println("Registration Date of User: " + CLI_Menu.DATEFORMAT.format(currentUser.getJoinDate()) + "\n");
				}
			}
			else {
				System.out.println("Invalid input. Please try again.\n\n");
			}
			return loop;
		}
		
		
		
		
		
		//------------------------------------------ MANAGER FUNCTIONALITIES
		public boolean managerFunctionalities(User currentUser, MediaRentalSystem rentalSystem) throws IOException, ParseException {
			boolean loop = true;
			String option;
			FactoryFactory stockFactory = new MediaItemFactory();
			
			ArrayList<MediaItem> stock = rentalSystem.getStock();

			//could implement interface to purchase as different users
			System.out.println("Menu Options\n"
					+ " 0. Return to Previous Menu.\n"
					+ " 1. Add Stock to Inventory.\n"
					+ " 2. Place order for more stock.\n"
					+ " 3. View all stock.\n"
					+ " 4. View account details.\n"
					+ " 5. Return Stock.");
			System.out.println("Leave blank to return to previous menu.\n");
			System.out.print("\nYour selection:\t");
			option = input.readLine();
			if(option.equals("0") || option.equals("")) {
				System.out.println("Returning to previous menu.\n");
			}
			else if(option.equals("1"))
			{
				System.out.println(" 0. Update details of an item of stock.\n"
						+ " 1. Register new stock item.");
				System.out.println("Your selection: \t");
				option = input.readLine();
				if(option.equals("0"))
				{
					System.out.println("Please enter the ID or title of the media Item you'd like to update: ");
					option = input.readLine();
					for(int i=0; i < stock.size(); i++)
					{
						if(stock.get(i).getTitle().contains(option) || stock.get(i).getMediaID().equals(option))
						{	//I don't understand this
							System.out.println("ID of Media Item: " + stock.get(i).getMediaID());
							System.out.println("Type of Media Item: " + stock.get(i).getType().toString());
							System.out.println("Please enter the new Title of Media Item: ");
							if(!input.readLine().trim().isEmpty())
								stock.get(i).setTitle(input.readLine());
							System.out.println("Description of Media Item: " + stock.get(i).getDescription());
							if(!input.readLine().trim().isEmpty())
								stock.get(i).setDescription(input.readLine());
							System.out.println("Price of Media Item: " + stock.get(i).getPrice());
							if(!(Double.parseDouble(input.readLine()) < 0))
								stock.get(i).setPrice(Double.parseDouble(input.readLine()));
							System.out.println("Discount of Media Item: " + stock.get(i).getDiscount() + "\n");
							if(!(Double.parseDouble(input.readLine()) < 0 && Double.parseDouble(input.readLine()) > 100))
									stock.get(i).setDiscount(Double.parseDouble(input.readLine()));
						}
					}
				}
				else if(option.equals("1"))
				{
					System.out.println("Please choose the type of Stock:");
					System.out.println("0. Cancel\n"
							+ " 1. Book\n"
							+ " 1. CD\n"
							+ " 2. DVD");
					option = input.readLine();
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
							System.out.print("Please enter the name of the new " + itemType + ": \t");
							String check = input.readLine();
							check = check.replace(",", "");//Remove any commas that would tamper with formatting
							
							if(rentalSystem.getStock(check) != null)
								System.out.println("Stock with that title already exists.");
							else {
								itemData +=  "," + check;
								System.out.print("Please enter the title of the new " + itemType + ":\t");
								check = input.readLine().replace(",", "");
								itemData +=  "," + check;
								
								System.out.print("Please enter the description of the new " + itemType + ":\t");
								check = input.readLine().replace(",", "");
								itemData +=  "," + check;
								if(itemType.equals("Book")) {
									System.out.print("Please enter the author of the new Book:\t");
									check = input.readLine().replace(",", "");
									itemData +=  "," + check;
									System.out.print("Please enter the pages of the new Book:\t");
									check = input.readLine().replace(",", "");
									itemData +=  "," + check;
								}
								else if(itemType.equals("CD")) {
									System.out.print("Please enter the producer of the new CD:\t");
									check = input.readLine().replace(",", "");
									itemData +=  "," + check;
									System.out.print("Please enter the length (in minutes) of the new CD:\t");
									check = input.readLine().replace(",", "");
									itemData +=  "," + check;
								}
								else if(itemType.equals("DVD")) {
									System.out.print("Please enter the censorship of the new DVD:\t");
									check = input.readLine().replace(",", "");
									itemData +=  "," + check;
									System.out.print("Please enter the director of the new DVD:\t");
									check = input.readLine().replace(",", "");
									itemData +=  "," + check;
								}
								
								System.out.print("Please enter the price of the new " + itemType + ":\t");
								check = input.readLine().replace(",", "");
								itemData +=  "," + check;
								
								System.out.print("Please enter the discount of the new " + itemType + ":\t");
								check = input.readLine().replace(",", "");
								itemData +=  "," + check;
								
								check = UUID.randomUUID().toString().replace(",", "");
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
				String UUID = input.readLine();
				for(MediaItem stocks : stock)
				{
					if(stocks.getMediaID().equals(UUID))
					{
						System.out.println("The item " + stocks.getTitle() + " exists!");
						System.out.print("Please enter the quantity of this item you'd like to order: \t");
						String selection = input.readLine();
						if (selection.matches("[0-9]")) {
							int qty = Integer.parseInt(option);
							rentalSystem.modifyStock(stocks, qty);
						}
						else {
							System.out.println("Invalid input.");
						}
					}
					else {
						System.out.println("No item of that ID found. \n\n");
					}/* Can't get this working
					Date today = new Date();
					String ID = UUID.randomUUID().toString().replace(",", "");
					Order order = new Order(stocks, today, ID);
					rentalSystem.registerNewOrder(order);*/
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
				String title = input.readLine();
				for(MediaItem stocks : stock)
				{
					if(stocks.getTitle().trim().equalsIgnoreCase(title.trim()) || stocks.getMediaID().equals(title))
					{
						System.out.println("The item " + stocks.getTitle() + " exists!");
						System.out.print("Please enter the quantity of this item you'd like to return: ");
					    int qty = Integer.parseInt(input.readLine());
					    rentalSystem.modifyStock(stocks, qty);
					}
				}
			}
			else {
				System.out.println("Invalid input. Please try again.\n\n");
			}
		return loop;
		}
		
		
		
		
		
		//------------------------------------------- EMPLOYEE FUNCTIONALITIES
		private boolean employeeFunctionalities(User currentUser, MediaRentalSystem rentalSystem) throws IOException, ParseException {
			boolean loop = true;
			String option;
			ArrayList<MediaItem> stock = rentalSystem.getStock();
			
			
			System.out.println("Menu Options\n"
					+ " 0. Return to Previous Menu.\n"
					+ " 1. Browse Media Inventory.\n"
					+ " 2. Search for Media Item.\n"
					+ " 3. Return an Item \n"
					+ " 4. Complete Transaction.\n"
					+ " 5. View account details.");
			System.out.println("Leave blank to return to previous menu.\n");
			System.out.print("\nYour selection:\t");
			option = input.readLine();
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
				option = input.readLine();
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
			
			else if(option.equals("2"))
			{
				System.out.print("Please enter the ID or the title of the item you'd like to return: ");
				String title = input.readLine();
				for(MediaItem stocks : stock)
				{
					if(stocks.getTitle().trim().equalsIgnoreCase(title.trim()) || stocks.getMediaID().equals(title))
					{
						System.out.println("The item " + stocks.getTitle() + " exists!");
						System.out.print("Please enter the quantity of this item you'd like to return: ");
					    //int qty = Integer.parseInt(input.readLine());
					    //rentalSystem.returnStock(qty, stocks.getMediaID());
					}
				}
			}
			
			/*else if(option.equals("3"))			//Not sure what this does
			{
				System.out.print("Please enter the ID or name of the User you'd like to complete a transaction for:\t");
				String command = input.nextLine();
				ArrayList<User> list = rentalSystem.getListOfUsers();
				for(User thisUser : list)
				{
					if(thisUser.getUserID().equals(command) || thisUser.getName().equals(command))
					{
						rentalSystem.completeTransaction(thisUser);
					}
				}
				
			}*/
			
			else if(option.equals("4"))
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




		//------------------------------------------- CUSTOMER FUNCTIONALITIES
		private boolean customerFunctionalities(User currentUser, MediaRentalSystem rentalSystem) throws IOException, ParseException {
			String option;
			boolean loop = true;
			ArrayList<MediaItem> stock = rentalSystem.getStock();
			
			System.out.println("Menu Options\n"
					+ " 0. Return to Previous Menu.\n"
					+ " 1. Browse Media Inventory.\n"
					+ " 2. Search for Media Item.\n"
					+ " 3. View Shopping Cart. \n"
					+ " 4. Place a Media Item into Basket.\n"
					+ " 5. View Account Details.\n");
			System.out.println("Leave blank to return to previous menu.\n");
			System.out.print("\nYour selection:\t");
			option = input.readLine();
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
				option = input.readLine();
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
			{/*
		
				ArrayList<MediaItem> basketItems = rentalSystem.viewBasket(currentUser);
				for(MediaItem m : basketItems)
				{
					System.out.println("ID of Media Item: \t \t" + m.getMediaID());
					System.out.println("Type of Media Item: \t" + m.getType().toString());
					System.out.println("Title of Media Item: \t" + m.getTitle());
					System.out.println("Description of Media Item:\t" + m.getDescription());
					System.out.println("Price of Media Item: \t" + m.getPrice());
					if(m.getDiscount() < 0)
						System.out.println("Discount of Media Item: \t" + m.getDiscount() + "\n");
					else
						System.out.println("There is no discount on this item.\n");
				}*/
			}
			else if(option.equals("4"))
			{
				ArrayList<MediaItem> items = new ArrayList<MediaItem>();
				while(true)
				{
				System.out.print("Please enter the ID or title of the media Item you'd like to buy or press return to exit: ");
				option = input.readLine();
				if(option.trim().isEmpty())
					break;
				for(int i=0; i < stock.size(); i++)
				{
					if(stock.get(i).getTitle().contains(option) || stock.get(i).getMediaID().equals(option))
					{
						System.out.println("ID of Media Item: \t" + stock.get(i).getMediaID());
						System.out.println("Type of Media Item: \t" + stock.get(i).getType().toString());
						System.out.println("Title of Media Item: \t" + stock.get(i).getTitle());
						System.out.println("Description of Media Item: \t" + stock.get(i).getDescription());
						System.out.println("Price of Media Item: \t" + stock.get(i).getPrice());
						if(stock.get(i).getDiscount() > 0)
							System.out.println("Discount of Media Item: \t" + stock.get(i).getDiscount() + "\n");
						else
							System.out.println("There is no discount on this item.\n");
						System.out.print("Would you like to add this item to your basket? Y/N:\t");
						option = input.readLine();
						if(option.equalsIgnoreCase("y") || option.equalsIgnoreCase("yes"))
						{
							items.add(stock.get(i));
						}
					}
				}
				}
				//rentalSystem.addItemsToBasket(items, currentUser);
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
