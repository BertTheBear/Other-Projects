import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MediaItemFactory extends FactoryFactory{
	/*

	This is the Factory class for the Media class.
	Factories usually use Interfaces rather than abstract classes, 
	but I don't think it matters very much.

	This class will create the objects for the listOfStock Array List
	This will make modifying the constructors of the classes easier.

	*/

	private ArrayList<MediaItem> itemList;

	MediaItemFactory() {
		//Default Constructor
		//Not sure if anything needs to be put in here
		/* For reference
		 * -1 - Error, to be deleted
		 * 0 - Book
		 * 1 - CD
		 * 2 - DVD
		*/
	}

	MediaItemFactory(File fileToBeRead) throws IOException {
		//Do all the work done by MediaRentalSystem otherwise
		if(fileToBeRead.exists()) {
			itemList = new ArrayList<MediaItem>();
			String inputLine;
			Scanner input = new Scanner(new BufferedReader(new FileReader(fileToBeRead)));
			while (input.hasNext()) 
			{
				inputLine = input.nextLine();
				itemList.add(createMediaItem(inputLine));
			}
			input.close();
		}
		else
			System.out.println("Stock file not found.\n" +
				"Please verify that the file is present before continuing.");
	}

	public MediaItem createMediaItem(String inputLine) {
		String[] lineArray = inputLine.split(",");
		
		MediaItem returnItem;

		//Converting Strings to doubles
		double price, discount = 0;
		price = Double.parseDouble(lineArray[5]);
		discount = Double.parseDouble(lineArray[6]);
		int quantity = Integer.parseInt(lineArray[7]);
		Type type = Type.valueOf(lineArray[0]);

		switch(type) {
			case BOOK:
				int pages = Integer.parseInt(lineArray[4]);
					returnItem =  new Book(type, lineArray[1], lineArray[2], lineArray[3], pages, price, discount, quantity, lineArray[8]);
			break;
			case CD:
				double minsLength = Double.parseDouble(lineArray[4]);
					returnItem = new CD(type, lineArray[1], lineArray[2], lineArray[3], minsLength, price, discount, quantity, lineArray[8]);
			break;
			case DVD:
					returnItem = new DVD(type, lineArray[1], lineArray[2], lineArray[3], lineArray[4], price, discount, quantity, lineArray[8]);
			break;
			default:
				System.out.println("Error reading file. Invalid user type entry.");
				return null;
		}
		return returnItem;
	}
	//*/

	public ArrayList<MediaItem> returnList() {
		return itemList;
	}
	
	public User createUser(String inputLine) {
		return null;
	}
}