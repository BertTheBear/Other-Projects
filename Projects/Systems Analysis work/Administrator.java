import java.util.Date;

public class Administrator extends User {

	Administrator()
	{
		super();
	}
	
	Administrator(Type type, String name, String email, String phone, String password, 
		Date registrationDate)
	{
		super(type,name,email,phone,password, registrationDate);
	}
	
	@Override
	public String toString() {
		return type.name() + "," + name + "," + email + "," + phone + "," + password +
			"," + CLI_Menu.DATEFORMAT.format(registrationDate) + "," + CLI_Menu.DATEFORMAT.format(lastOnline);
	}
}
