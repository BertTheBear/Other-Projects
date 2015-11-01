import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProgramInterface {
	
	private boolean command = false;
	Scanner input = new Scanner(System.in);
	
	
	//Constructor Default
	ProgramInterface() {
		//Default for now. Not sure what to do.
	}
	//Constructor input
	ProgramInterface(boolean type) {
		command = type;
	}
	
	/*
	 * Display method.
	 * This method takes a String input and displays it to screen.
	 * 
	 * Arguments: 	String
	 * Return: 		Void
	 */
	public void display(String text) {
		if(command) {
			System.out.println(text);
		}
		else {
			JOptionPane.showMessageDialog(null, text, "Character Creator", -1);
		}
	}
	
	/*
	 * String Input method.
	 * This method takes a String input and displays it to screen.
	 * Then it takes input from the user and returns it.
	 * 
	 * Arguments: 	String
	 * Return: 		String
	 */
	public String inputString(String text) {
		return inputString(text, "Enter Text");
	}
	public String inputString(String text, String note) {
		if(command) {
			System.out.println(text);
			System.out.print(note + ": \t");
			
			return input.nextLine();
		}
		else {
			try{
				return JOptionPane.showInputDialog(null, text, note);
			} catch(Exception ex) {
				return "";
			}
		}
	}
	
	/*
	 * Integer Input method.
	 * This method takes a String input and displays it to screen.
	 * Then it takes input from the user and returns it.
	 * 
	 * Arguments: 	String
	 * Return: 		Integer
	 */
	public int inputInt(String text) {
		return inputInt(text, "Enter Number");
	}
	public int inputInt(String text, String note) {
		if(command) {
			System.out.println(text);
			System.out.print(note + ": \t");
			
			return input.nextInt();
		}
		else {
			try{
				return Integer.parseInt(JOptionPane.showInputDialog(null, text, note));
			} catch(Exception ex) {
				return -1000;
			}
		}
	}
	
	/*
	 * Double Input method.
	 * This method takes a String input and displays it to screen.
	 * Then it takes input from the user and returns it.
	 * 
	 * Arguments: 	String
	 * Return: 		Double
	 */
	public double inputDouble(String text) {
		return inputDouble(text, "Enter Number");
	}
	public double inputDouble(String text, String note) {
		if(command) {
			System.out.println(text);
			System.out.print(note + ": \t");
			
			return input.nextInt();
		}
		else {
			try{
				return Double.parseDouble(JOptionPane.showInputDialog(null, text, note));
			} catch(Exception ex) {
				return -1000;
			}
		}
	}
	
	public boolean confirm(String text) {
		return confirm(text, "Confirm");
	}
	public boolean confirm(String text, String note) {		
		if(command) {
			String input;
			
			System.out.println(text);
			System.out.println("(Y)es/(N)o");
            input = this.input.nextLine();
            if (input.matches("[Y,y]{1}[es]{0+]")) {
                return true;
            }
            else if (input.matches("[N,n]{1}[o]{0+]")) {
                return false;
            }
            else{
                System.out.println("Invalid input. Please try again.");
                return confirm(text, note);
            }
		}
		else {
			int selection = JOptionPane.showConfirmDialog(null, "Generate New Character", "Choose one", JOptionPane.YES_NO_OPTION);
			if(selection == JOptionPane.OK_OPTION)
				return true;
			return false;
		}
	}
	
	
	/*
	 * Notification messages
	 * These will show certain notifications depending on the system.
	 * 
	 * Input:	String
	 * Output:	Void
	 */
	public void warning(String text){
		warning(text, "Warning!");
	}
	public void warning(String text, String note){
		if (command) {
			System.out.println(note);
			System.out.println(text);
			System.out.println("\n");
		}
		else {
			JOptionPane.showMessageDialog(null, text, note, JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void information(String text){
		warning(text, "Information");
	}
	public void information(String text, String note){
		if (command) {
			System.out.println(note);
			System.out.println(text);
			System.out.println("\n");
		}
		else {
			JOptionPane.showMessageDialog(null, text, note, JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void error(String text){
		warning(text, "Error!");
	}
	public void error(String text, String note){
		if (command) {
			System.out.println(note);
			System.out.println(text);
			System.out.println("\n");
		}
		else {
			JOptionPane.showMessageDialog(null, text, note, JOptionPane.ERROR_MESSAGE);
		}
	}
}
