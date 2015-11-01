import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;

public class CharacterCreator
{
    public static void main(String[] args) {

    	boolean window;
    	try {
    		window = args[1].equalsIgnoreCase("command"); //For deciding between command line or JFrame
    	} catch (Exception ex) {
    		window = false;
    	}
        boolean continu = true;
        
        ProgramInterface ui = new Interface(window);
        
        //Checks to see if filename is input.
        //Alternate filenames can be input in the command line.
        //This allows alternate rules, versions, and save files.
        String fileName[] = new String[10];
        
        if (window && args.length >= 2)
            fileName[0] = args[1];
        else if (args.length >= 2)
            fileName[0] = args[2];
        else
            fileName[0] = "list.txt";    //Default list file
        
        //The list file will contain the names of the other files to be used as lists
        //
        /*Add in more for changing other files later.*/
        fileName[1] 	= "races.txt";		//Races
        fileName[2] 	= "adept.txt";		//Adept
        fileName[3] 	= "aristocrat.txt";	//Aristocrat
        fileName[4] 	= "caster.txt";		//Caster
        fileName[5] 	= "commoner.txt";	//Commoner
        fileName[6] 	= "expert.txt";		//Expert
        fileName[7] 	= "warrior.txt";	//Warrior
        fileName[8] 	= "spells.txt";		//Spells
        fileName[9] 	= "weapons.txt";	//Weapons
        fileName[10] 	= "savedCharacters.txt";	//Saved Characters
        //-----------
        
        File fileArray[] = new File[10]; //Declare File array
        
        fileArray[1] = new File (fileName[0]);
        if(!fileArray[1].exists())
            System.out.println("Character List file not found");
        
        
        
        
        
        
        
    }
}
