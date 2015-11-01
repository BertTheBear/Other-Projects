import java.util.Date;

public class Manager extends User {
	
	public Manager()
	{
		super();
	}
	
	public Manager(Type type, String name, String email, String phone, String password, 
		Date registrationDate)
	{
		super(type, name, email, phone, password, registrationDate);
	}

	//toString override
	@Override
	public String toString() {
		return type.toString() + "," + name + "," + email + "," + phone + "," + password +  
		"," + CLI_Menu.DATEFORMAT.format(registrationDate) + "," + CLI_Menu.DATEFORMAT.format(lastOnline);
	}
}
