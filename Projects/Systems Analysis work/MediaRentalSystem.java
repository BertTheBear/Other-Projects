import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class MediaRentalSystem 
{
	//For initial run, initialising lists
	boolean initialise = true;
	//Lists of objects and their counters
	ArrayList<User> 	listOfUsers 	= new ArrayList<User>();
	ArrayList<MediaItem> listOfStock	= new ArrayList<MediaItem>();
	ArrayList<Order> 	listOfOrders	= new ArrayList<Order>();
	//ArrayList<Shipment> listOfShipments	= new ArrayList<Shipment>();	//Removed
	//ArrayList<Basket> 	listOfBaskets	= new ArrayList<Basket>();		//Removed
	ArrayList<Wallet> 	listOfWallets	= new ArrayList<Wallet>();
	
	int usersCount = 	0;
	int stockCount = 	0;
	int ordersCount = 	0;
  //int shipmentsCount= 0;
  //int basketsCount = 	0;
	int walletsCount = 	0;
	
	
	//IO objects
	//File theFile;
	//FileWriter fileWriter;
	//BufferedReader myReader;
	//Scanner input;
	PrintWriter writeTo;
	
	//These are the names of the files used by the program 
	// They have been written up here for ease of modification etc.
	private final String usersFilename = 		new String("users.txt");
	private final String ordersFilename = 		new String("orders.txt");
  //private final String shipmentsFilename = 	new String("shipments.txt"); 	//Removed
	private final String walletsFilename = 		new String("wallets.txt");
  //private final String basketsFilename = 		new String("baskets.txt");		//Removed
	private final String stockFilename = 		new String("stock.txt");
	
	private String filename;
	//This will be the file used in each method. It will be set to the correct filename at the start of each method.
	private String aLine; //Used for reading files. Easier than redeclaring each time.

	MediaRentalSystem() throws IOException, ParseException
	{
		listOfUsers = 		getListOfUsers();
		listOfStock = 		getStock();
		listOfOrders = 		getListOfOrders();
	  //listOfShipments = 	getListOfShipments(); 	//Removed
	  //listOfBaskets = 	getListOfBaskets();		//Removed
		listOfWallets = 	getListOfWallets();
		
		initialise = false;
	}

	public ArrayList<User> getListOfUsers() throws IOException, ParseException
	{
		if(initialise) {
			//Set filename
			filename = usersFilename;
			
			//Checks if list is empty before writing to it
			if (!listOfUsers.isEmpty())
				listOfUsers.clear();
	
			//Checks that the file exists
			File theFile = new File(filename);
			if(theFile.exists()) {
				/* Or just
				UserFactory factoryPattern = new UserFactory(theFile);
				listOfUsers = factoryPattern.returnList();
				*/
				BufferedReader myReader = new BufferedReader(new FileReader(theFile));
				Scanner input = new Scanner(myReader);
				FactoryFactory factoryPattern = new UserFactory();
				while (input.hasNext()) 
				{
					aLine = input.nextLine();
					addUserToList(factoryPattern.createUser(aLine));
				}
				input.close();
				myReader.close();
			}
			else
				System.out.println("File " + filename + " not found.\n" +
					"Please verify that the file is present before continuing.");
		}//If not first run, just return list
		return listOfUsers;
	}//For adding users to list
	public void addUserToList(User theUser) {
		if(theUser != null) {
			listOfUsers.add(theUser);
			usersCount++;
		}
		else
			System.out.println("Error creating user.");
	}//For removing users from list
	public void removeUserFromList(String username) {
		for(int i = 0; i < usersCount; i++) {
			if(listOfUsers.get(i).getName().equalsIgnoreCase(username)) {
				listOfUsers.remove(i);
				usersCount--;
			}
		}
	}//For finding users by name. Used by logIn method in CLI_Menu
	public User getUser(String name) throws IOException, ParseException
	{
		listOfUsers = getListOfUsers();
		for (int i = 0; i < usersCount; i++) 
		{
			if (name.equals(listOfUsers.get(i).getName()))
				return listOfUsers.get(i);
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	public ArrayList<MediaItem> getStock() throws IOException, ParseException
	{
		if(initialise) {
			filename = stockFilename;
			
			
			if (!listOfStock.isEmpty())
				listOfStock.clear();
	
	
			File theFile = new File(filename);
			if(theFile.exists()) {
				//MediaItemFactory itemFactory = new MediaItemFactory(theFile);
				//listOfStock = itemFactory.returnList();
				FactoryFactory itemFactory = new MediaItemFactory();
				BufferedReader myReader = new BufferedReader(new FileReader(theFile));
				Scanner input = new Scanner(myReader);
				while (input.hasNext()) 
				{
					aLine = input.nextLine();
					addStockToList(itemFactory.createMediaItem(aLine));
				}
				input.close();
				myReader.close();
			}
			else
				System.out.println("File " + filename + " not found.\n" +
					"Please verify that the file is present before continuing.");
		}//If not first run, just return list
		return listOfStock;
	}//For adding stock to list
	public void addStockToList(MediaItem item) {
		if(item != null) {
			listOfStock.add(item);
			stockCount++;
		}
		else
			System.out.println("Error creating user.");
	}//For removing stock from list
	public void removeStockFromList(String name) {
		for(int i = 0; i < stockCount; i++) {
			if(listOfStock.get(i).getTitle().equalsIgnoreCase(name)) {
				listOfStock.remove(i);
				stockCount--;
			}
		}
	}//For finding users by name. Used by logIn method in CLI_Menu
	public MediaItem getStock(String name) throws IOException, ParseException
	{
		for (int i = 0; i < stockCount; i++) 
		{
			if (name.equals(listOfStock.get(i).getTitle()))
				return listOfStock.get(i);
		}
		return null;
	}
	public boolean modifyStock(MediaItem item, int amount) {
		int index = listOfStock.indexOf(item);
		int quantity = listOfStock.get(index).getQuantity();
		if(quantity + amount < 0) 
			return false;
		listOfStock.get(index).setQuantity(quantity + amount);
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public ArrayList<Order> getListOfOrders() throws IOException, ParseException
	{
		if(initialise) {
			//Set filename
			filename = ordersFilename;
	
			//Verifies that list is empty
			if (!listOfOrders.isEmpty())
				listOfOrders.clear();
	
			//Checks that the file exists
			File theFile = new File(filename);
			if(theFile.exists()) {
				BufferedReader myReader = new BufferedReader(new FileReader(theFile));
				Scanner input = new Scanner(myReader);
				while (input.hasNext()) 
				{
					aLine = input.nextLine();
					addOrderToList(new Order(aLine));
				}
				input.close();
				myReader.close();
			}
			else
				System.out.println("File " + filename + " not found.\n" +
					"Please verify that the file is present before continuing.");
		}//If not first run, just return list
		return listOfOrders;
	}//For adding users to list
	public void addOrderToList(Order theOrder) {
		if(theOrder != null && !theOrder.getOrderID().isEmpty()) {
			listOfOrders.add(theOrder);
			ordersCount++;
		}
		else
			System.out.println("Error creating user.");
	}//For removing orders from list
	public void removeOrderFromList(String orderID) {
		for(int i = 0; i < ordersCount; i++) {
			if(listOfOrders.get(i).getOrderID().equalsIgnoreCase(orderID)) {
				listOfOrders.remove(i);
				ordersCount--;
			}
		}
	}//For finding users by name. Used by logIn method in CLI_Menu
	public Order getOrder(String orderID) throws IOException, ParseException
	{
		for (int i = 0; i < ordersCount; i++) 
		{
			if (orderID.equals(listOfOrders.get(i).getOrderID()))
				return listOfOrders.get(i);
		}
		return null;
	}
	
	
	
	
	
	
/*			//Removed
	public ArrayList<Shipment> getListOfShipments() throws IOException
	{
		if(initialise) {
			filename = shipmentsFilename;
	
			if (!listOfShipments.isEmpty())
				listOfShipments.clear();
	
			theFile = new File(filename);
			if(theFile.exists()) {
				fileReader = new BufferedReader(new FileReader(theFile));
				Scanner input = new Scanner(fileReader);
				while (input.hasNext()) 
				{
					aLine = input.nextLine();
					String[] lineComponents = aLine.split(",");
					if (lineComponents[0].equals("User")) 
					{
						User aUser = new User(lineComponents[0],
								lineComponents[1], lineComponents[2],
								lineComponents[3], lineComponents[4]);
						listOfUsers.add(aUser);
					}
				}
				input.close();
				fileReader.close();
			}
			else
				System.out.println("File " + filename + " not found.\n" +
					"Please verify that the file is present before continuing.");
		}//If not first run, just return list
		return listOfShipments;
	}//For adding users to list
	public void addUserToList(User theUser) {
		if(theUser != null) {
			listOfUsers.add(theUser);
			usersCount++;
		}
		else
			System.out.println("Error creating user.");
	}//For removing users from list
	public void removeUserFromList(String username) {
		for(int i = 0; i < usersCount; i++) {
			if(listOfUsers.get(i).getName().equalsIgnoreCase(username)) {
				listOfUsers.remove(i);
				usersCount--;
			}
		}
	}//For finding users by name. Used by logIn method in CLI_Menu
	public User getUser(String name) throws IOException, ParseException
	{
		listOfUsers = getListOfUsers();
		for (int i = 0; i < usersCount; i++)
		{
			if (name.equals(listOfUsers.get(i).getName()))
				return listOfUsers.get(i);
		}
		return null;
	}//*/
	
	
	
	
/*		//Removed
	public ArrayList<Basket> getListOfBaskets() throws IOException
	{
		if(initialise) {
			filename = basketsFilename;
			
			if (!listOfBaskets.isEmpty())
				listOfBaskets.clear();
			
			theFile = new File(filename);
			if(theFile.exists()) {
				fileReader = new BufferedReader(new FileReader(theFile));
				Scanner input = new Scanner(fileReader);
				while (input.hasNext()) 
				{
					aLine = input.nextLine();
					String[] lineComponents = aLine.split(",");
					if (lineComponents[0].equals("User")) 
					{
						User aUser = new User(lineComponents[0],
								lineComponents[1], lineComponents[2],
								lineComponents[3], lineComponents[4]);
						listOfUsers.add(aUser);
					}
				}
				input.close();
				fileReader.close();
			}
			else
				System.out.println("File " + filename + " not found.\n" +
					"Please verify that the file is present before continuing.");
		}//If not first run, just return list
		return listOfBaskets;
	}//For adding users to list
	public void addUserToList(User theUser) {
		if(theUser != null) {
			listOfUsers.add(theUser);
			usersCount++;
		}
		else
			System.out.println("Error creating user.");
	}//For removing users from list
	public void removeUserFromList(String username) {
		for(int i = 0; i < usersCount; i++) {
			if(listOfUsers.get(i).getName().equalsIgnoreCase(username)) {
				listOfUsers.remove(i);
				usersCount--;
			}
		}
	}//For finding users by name. Used by logIn method in CLI_Menu
	public User getUser(String name) throws IOException, ParseException
	{
		listOfUsers = getListOfUsers();
		for (int i = 0; i < usersCount; i++) 
		{
			if (name.equals(listOfUsers.get(i).getName()))
				return listOfUsers.get(i);
		}
		return null;
	}//*/
	
	
	
	
	
	
	
	
	
	

	public ArrayList<Wallet> getListOfWallets() throws IOException
	{
		if(initialise) {
			filename = walletsFilename;
	
			if (!listOfWallets.isEmpty())
				listOfWallets.clear();
	
			File theFile = new File(filename);
			if(theFile.exists()) {
				BufferedReader myReader = new BufferedReader(new FileReader(theFile));
				Scanner input = new Scanner(myReader);
					while (input.hasNext()) 
					{
						aLine = input.nextLine();
						String[] parts = aLine.split(",");
						Wallet tempWallet = new Wallet(parts[0],Integer.parseInt(parts[1]));
						listOfWallets.add(tempWallet);
					}
				input.close();
				myReader.close();
			}
			else
				System.out.println("File " + filename + " not found.\n" +
					"Please verify that the file is present before continuing.");
		}//If not first run, just return list
		return listOfWallets;
	}//For adding wallets to list
	public void addWalletToList(Wallet theWallet) {
		if(theWallet != null) {
			listOfWallets.add(theWallet);
			walletsCount++;
		}
		else
			System.out.println("Error creating user.");
	}//For removing wallets from list
	public void removeWalletFromList(String username) {
		for(int i = 0; i < usersCount; i++) {
			if(listOfWallets.get(i).getOwner().equalsIgnoreCase(username)) {
				listOfWallets.remove(i);
				walletsCount--;
			}
		}
	}//For finding users by name. Used by logIn method in CLI_Menu
	public Wallet getWallet(String name) throws IOException, ParseException
	{
		for (int i = 0; i < usersCount; i++) 
		{
			if (name.equals(listOfWallets.get(i).getOwner()))
				return listOfWallets.get(i);
		}
		return null;
	}
	
	
	
	
	
	
//------------------------------------------------------------------------------ Exit methods
	
	public void exit() throws IOException {
		writeUsers(usersFilename);
		writeOrders(ordersFilename);
		//writeShipments(shipmentsFilename);	//Removed
		writeWallets(walletsFilename);
		//writeBaskets(basketsFilename);		//Removed
		writeStock(stockFilename);
		
		writeTo.close();
	}
	
	
	public void writeUsers(String filename) throws IOException 	{
		writeTo = new PrintWriter(new FileWriter(filename, false));
		
		//Write the users to file
		for(int i = 0; i < usersCount; i++) {
			writeTo.println(listOfUsers.get(i).toString());
		}
		
		//Close writer
		writeTo.close();
	}
	
	public void writeOrders(String filename) throws IOException {
		writeTo = new PrintWriter(new FileWriter(filename, false));
		
		//Write the data to file
		for(int i = 0; i < ordersCount; i++) {
			writeTo.println(listOfOrders.get(i).toString());
		}
		
		//Close writer
		writeTo.close();
	}
	
	/*		//Removed
	public void writeShipments(String filename) throws IOException {
		writeTo = new PrintWriter(new FileWriter(filename, false));
		
		//Write the data to file
		for(int i = 0; i < shipmentsCount; i++) {
			writeTo.println(listOfShipments.get(i).toString());
		}
		
		//Close writer
		writeTo.close();
	}*/
	
	public void writeWallets(String filename) throws IOException {
		writeTo = new PrintWriter(new FileWriter(filename, false));
		
		//Write the data to file
		for(int i = 0; i < walletsCount; i++) {
			writeTo.println(listOfWallets.get(i).toString());
		}
		
		//Close writer
		writeTo.close();
	}
	/*//Removed
	public void writeBaskets(String filename) throws IOException {
		writeTo = new PrintWriter(new FileWriter(filename, false));
		
		//Write the data to file
		for(int i = 0; i < basketsCount; i++) {
			writeTo.println(listOfBaskets.get(i).toString());
		}
		
		//Close writer
		writeTo.close();
	}*/
	
	public void writeStock(String filename) throws IOException {
		writeTo = new PrintWriter(new FileWriter(filename, false));
		
		//Write the items to file
		for(int i = 0; i < stockCount; i++) {
			writeTo.println(listOfStock.get(i).toString());
		}
		
		//Close writer
		writeTo.close();
	}
	
	
}