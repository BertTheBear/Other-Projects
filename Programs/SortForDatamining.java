package tempPackage;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class SortForDatamining {
	public static void main(String[] args) throws IOException {

        //For processing Strings
        boolean next; //because it means it's the next word
        String[] line;
        

        //Declare for file and manipulation of file
    	String filename = "work.txt";
        File theFile = new File(filename);

        //Check file exists
        if(theFile.exists()) {
			
			BufferedReader myReader = new BufferedReader(new FileReader(filename));
			Scanner input = new Scanner(myReader);
			
			//Temp string for manipulation
	        String bench = ""; //Cos we work on a bench. Stupid I know
			
			int linecount = 0;
			ArrayList<String> text = new ArrayList<String>();
	        
			try {
				//Put text into arraylist
				while(myReader.ready()) {
					bench = input.nextLine();
		            System.out.println("Line:\t \t" + bench);

					//Add bench to list of all lines, in order to be printed
		            text.add(bench);
		            linecount++;
				}
				//Process each line
				for (int k = 0; k < linecount; k++) {

					bench = text.get(k);
	
		            next = false;
		
		            line = bench.split(" ");
		            //Process lines block by block
		            for(int i = 0; i < line.length; i++) {
		                
		                if(line[i].length() == 0)
		                    next = true;
		                else if(next || line[i].length() <= 1)
		                    line[i-1] = ",";
		                else
		                	next = false;
		            }
		            //Clear bench to be remade into full line
		            bench = "";
		
		            //Now add all of line together to be printed
		            for(int j = 0; j < line.length; j++) {
		                bench += line[j];
		            }
		            
		            //Now insert into list
		            text.set(k, bench);

		        }

				//The thing to print everything
				PrintWriter out = new PrintWriter(filename);
				int counter = 0;
				while(counter < linecount) {
					bench = text.get(counter);
		            System.out.println("End Line:\t" + bench);
		            //Print to file
		            out.println(bench);
		            counter++;
				}
				out.close();

			} finally {
				input.close();
				myReader.close();
			}
		}
		else
			System.out.println("File " + filename + " not found.\n" +
				"Please verify that the file is present before continuing.");
        
    }
}
