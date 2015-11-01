import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;


public interface I_ClassFunctionality {
	
	public boolean classFunctionality(User currentUser, MediaRentalSystem rentalSystem, Scanner input) throws IOException, ParseException;
	
	public boolean classFunctionality(User currentUser, MediaRentalSystem rentalSystem, Basket basket, Scanner input) throws IOException, ParseException;

}
