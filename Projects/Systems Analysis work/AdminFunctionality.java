import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class AdminFunctionality implements I_ClassFunctionality {
	
	public boolean classFunctionality(User currentUser, MediaRentalSystem rentalSystem, Scanner input) throws IOException, ParseException {
		return adminFunctionalities(currentUser, rentalSystem, input);
	}
	
	public boolean classFunctionality(User currentUser, MediaRentalSystem rentalSystem, Basket basket, Scanner input) throws IOException, ParseException {
		return adminFunctionalities(currentUser, rentalSystem, input);		
	}
	
	//------------------------------------ ADMIN FUNCTIONALITIES
	private boolean adminFunctionalities(User currentUser, MediaRentalSystem rentalSystem, Scanner input) throws IOException, ParseException {
		FactoryFactory userFactory = new UserFactory();//-----------------------------------
		String option, option2, userData = ""; 
		String name, accountType = "";
		ArrayList<User> listOfUsers;
		ArrayList<MediaItem> stock;
		boolean loop = true;
		
		System.out.println("\nMenu Options:\n\n"
				+ " 0. Return to login menu.\n"
				+ " 1. Register User \n"
				+ " 2. Search for User\n"
				+ " 3. Remove User\n"
				+ " 4. Search Stock Inventory\n"
				+ " 5. Edit Stock Inventory\n"
				+ " 6. View all User Account details\n"
				+ " 7. View your account details");
		System.out.println("\nLeave blank to return to previous menu.\n");
		System.out.print("Your selection:\t");
		option = input.nextLine();
		if(option.isEmpty() || option.equals("0")) {
			System.out.println("Returning to previous menu.\n");
			return false;
		}
		else if(option.equals("1")) {
			while(loop)
			{
				System.out.println("Leave blank to return to previous menu.\n");

				System.out.println(" 0. Return to previous Menu\n"
						+ " 1. Administrator\n"
						+ " 2. Manager\n"
						+ " 3. Employee\n"
						+ " 4. Customer");
				System.out.print("Please choose the type of User:\t");
				option = input.nextLine();
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
					name = input.nextLine();
					String check = name.replace(",", ""); //Remove any commas that would tamper with formatting
					
					if(rentalSystem.getUser(check) != null)
						System.out.println("User with that name already exists.");
					else {
						userData +=  "," + check;
						
						System.out.print("Please enter the password of the new " + accountType + ": \t \t");
						String password = input.nextLine().replace(",", ""); //Password should be asked after username
	
						System.out.print("Please enter the email address of the new " + accountType + ": \t");//We will allow duplicate emails
						check = input.nextLine().replace(",", "");
						userData +=  "," + check;
	
						System.out.print("Please enter the phone number of the new " + accountType + ": \t");
						check = input.nextLine().replace(",", "");
						userData +=  "," + check;
	
						userData +=  "," + password;		//Password is asked after username but put in the string much later
						
						Date today = new Date();
						userData += "," + CLI_Menu.DATEFORMAT.format(today);
						
						if(accountType.equals("Customer")) {
							System.out.print("Please enter the address of the new Customer: \t \t");
							check = input.nextLine().replace(",", "");
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
					option = input.nextLine();
					boolean found = false;
					if(option.equalsIgnoreCase("0") || option.equalsIgnoreCase(""))
					{
						System.out.println("Returning to previous menu.\n");
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
			option = input.nextLine();
			
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
			option = input.nextLine();
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
			option = input.nextLine();
			for(int i=0; i < stock.size(); i++)
			{
				if(stock.get(i).getTitle().contains(option))
				{
					System.out.println("Would you like to delete?" + stock.get(i).getTitle());
					option2 = input.nextLine();
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
	

}
