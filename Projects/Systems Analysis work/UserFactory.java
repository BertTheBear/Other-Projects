import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;

public class UserFactory extends FactoryFactory {
	/*

	This is the Factory class for the User class.
	Factories usually use Interfaces rather than abstract classes, 
	but I don't think it matters very much.

	This class will create the objects for the listOfUsers Array List
	This will make modifying the constructors of the classes easier.

	*/

	private ArrayList<User> userList;

	UserFactory() {
		//Default Constructor
		//Not sure if anything needs to be put in here
		/* For reference
		 * 0 - Admin
		 * 1 - Manager
		 * 2 - Employee
		 * 3 - User
		*/
	}

	UserFactory(File fileToBeRead) throws IOException, ParseException {
		//Do all the work done by MediaRentalSystem otherwise
		if(fileToBeRead.exists()) {
			userList = new ArrayList<User>();
			String inputLine;
			Scanner input = new Scanner(new BufferedReader(new FileReader(fileToBeRead)));
			while (input.hasNext()) 
			{
				inputLine = input.nextLine();
				userList.add(createUser(inputLine));
			}
			input.close();
		}
		else
			System.out.println("Users file not found.\n" +
				"Please verify that the file is present before continuing.");
	}


	public User createUser(String inputLine) throws ParseException {
		String[] lineArray = inputLine.split(",");
		if(lineArray.length < 7)  { //Not enough elements to properly create user
			System.out.println("Error creating user. Data corrupted.");
			return null;
		}
		/*
		0 - type
		1 - name
		2 - email
		3 - phone
		4 - password
		5 - regDate
		6 - lastOnline
		7 - address
		*/
		
		User returnUser;

		//Converting Strings to values
		Type type = Type.valueOf(lineArray[0]);
		Date regDate = CLI_Menu.DATEFORMAT.parse(lineArray[5]);

		switch(type) {
			case ADMIN:
				returnUser = new Administrator(type, lineArray[1], lineArray[2], lineArray[3], lineArray[4], regDate);
			break;
			case MANAGER:
				returnUser =  new Manager(type, lineArray[1], lineArray[2], lineArray[3], lineArray[4], regDate);
			break;
			case EMPLOYEE:
				returnUser =  new Employee(type, lineArray[1], lineArray[2], lineArray[3], lineArray[4], regDate);
			break;
			case CUSTOMER:
				try {
					returnUser =  new Customer(type, lineArray[1], lineArray[2], lineArray[3], lineArray[4], regDate, lineArray[7]);
				}catch(ArrayIndexOutOfBoundsException ex) {//In case of any input errors
					returnUser =  new Customer(type, lineArray[1], lineArray[2], lineArray[3], lineArray[4], regDate, "");
				}
			break;
			default:
				System.out.println("Error creating user. Invalid user type entry.");
				return null;//Default
		}
		return returnUser;
	}
	
	//In order to use FactoryFactory
	public MediaItem createMediaItem(String inputLine) {
		return null;
	}

	public ArrayList<User> returnList() {
		return userList;
	}
}