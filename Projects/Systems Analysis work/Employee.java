import java.util.Date;

public class Employee extends User {
	
	public Employee()
	{
		super();
	}
	
	public Employee(Type type, String name, String email, String phone, String password, 
		Date registrationDate)
	{
		super(type, name, email, phone, password, registrationDate);
	}

	//toString implementation
		@Override
		public String toString() {
			return type.toString() + "," + name + "," + email + "," + phone + "," + password +  
			"," + CLI_Menu.DATEFORMAT.format(registrationDate) + "," + CLI_Menu.DATEFORMAT.format(lastOnline);
		}

}
