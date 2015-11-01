import java.util.Date;

public class Customer extends User
{
	private String address;

	Customer()
	{
		super();
		address = "";
	}
	
	Customer(Type type, String name, String email, String phone, String password, 
		Date registrationDate, String address)
	{
		super(type, name, email, phone, password, registrationDate);
		this.address = address;
	}

	//New setter and getter
	public String getAddress(){ return address;}
	public void setAddress(String address){ this.address = address;}
	
	//Define toString()
		@Override
		public String toString() {
			return type.toString() + "," + name + "," + email + "," + phone + "," + password + 
			"," + CLI_Menu.DATEFORMAT.format(registrationDate) + "," + CLI_Menu.DATEFORMAT.format(lastOnline) +
			"," + address;
		}
}