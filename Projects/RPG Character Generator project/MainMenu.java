import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.*;


public class MainMenu {

    String input = ""; int intput = 0;
    //int continu = 0;
    boolean loop = false; //For looping certain checks.
    boolean menuLoop = true; //For looping for main menu and ending program.
    String spacing = ""; //For displaying 
    ArrayList<String> characterList = new ArrayList<String>(); //?

    Interface ui;
    String text;

    File[] fileList;

    public MainMenu(boolean window, File[] listOfFiles) {
    	
    	ui = new Interface(window);
        fileList = listOfFiles;
        
        
        
        if (window) {     //Jframe
            continu = JOptionPane.showConfirmDialog(null, "Generate New Character", "Choose one", JOptionPane.YES_NO_OPTION);
            if(continu == 0) 
                ;
            else {         //Finish after command interface
                
            }
        }
        else {             //Command window
            while(menuLoop) {
                text = "Please select an option:\n" +
                		" 1.) Character (C)reation\n" +
                		" 2.) Character (V)iew\n" +
                		" 3.) \n" +					//tbd
                		" 4.) \n" +					//tbd
                		" 0.) Exit\n");
                input = in.nextLine();
                
                if (input.matches("[E,e,0]{1}")) {
                    menuLoop = false;
                }
                if (input.matches("[C,c,1]{1}")) { //Character Creation
                    loop = true;
                    while(loop) {
                        System.out.println("Generate New Character?\n (Y)es/(N)o"); //Basic check for when additional functionality is added. Also for practising.
                        input = in.nextLine();
                        if (input.matches("[Y,y]{1}[es]{0+]")) {
                            continu = 1;
                            loop = false;
                        }
                        else if (input.matches("[N,n]{1}[o]{0+]")) {
                            continu = 0;
                            loop = false;
                        }
                        else {
                            System.out.println("Invalid input. Please try again.");
                        }
                    }
                    if (continu == 0)
                        loop = false; //Return to menu
                    else { //Continue character creation.
                        
                    }
                }
                else {
                    System.out.println("Invalid input. Please try again.");
                }
                
                
            }
        }
    }
}
