import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CLI_Menu //Uses scanner
{

public final static DateFormat DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm");
Scanner input;
	
	public void run(MediaRentalSystem rentalSystem) throws IOException, ParseException
	{
		input = new Scanner(System.in);
		I_ClassFunctionality function;
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
					System.out.println("User type: \t" + userType.toString());
					switch(userType) {
						case CUSTOMER:
							Basket basket = new Basket();
							while(loop) {
								function = new CustomerFunctionality();
								loop = function.classFunctionality(currentUser, rentalSystem, basket, input);
							}
						break;
						
						case EMPLOYEE:
							while(loop) {
								function = new EmployeeFunctionality();
								loop = function.classFunctionality(currentUser, rentalSystem, input);
							}
						break;
						
						case MANAGER:
							while(loop) {
								function = new ManagerFunctionality();
								loop = function.classFunctionality(currentUser, rentalSystem, input);
							}
						break;
						
						case ADMINISTRATOR: case ADMIN:
							while(loop) {
								function = new AdminFunctionality();
								loop = function.classFunctionality(currentUser, rentalSystem, input);
							}
						break;
						
						default:
							System.out.println("User-type Error");
							loop = false;
					}
				}
			}
		}
		input.close();
	}
	
	//----------------------------------- LOGIN
	private User logIn(MediaRentalSystem rentalSystem) throws IOException, ParseException {
		
		System.out.print("Please enter your username:\t");
		String option = input.nextLine();
		if(option.matches("")){
			return null;
		}
		User currentUser = rentalSystem.getUser(option);
		if(currentUser != null) {
			for(int i = 3; i > 0; i--) {
				System.out.print("\nYou have " + i + " attempts remaining.\nPlease enter your password:\t");
				option = input.nextLine();
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
	
	

}
