import java.io.IOException;
import java.text.ParseException;

public class RunProgram {

	public static void main (String[] args) throws IOException, ParseException {
		  CLI_Menu menu = new CLI_Menu();
		  MediaRentalSystem system = new MediaRentalSystem();
		  menu.run(system);
	}

}