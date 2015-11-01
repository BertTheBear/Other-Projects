import java.util.Date;

public abstract class User implements I_User
{
	//Declaring variables
	//Using protected as they will be used by sub-classes
	protected String name;
	protected String email;
	protected String phone;
	protected String password;
	protected Type type;
	/*
	 * 0 - Admin
	 * 1 - Manager
	 * 2 - Employee
	 * 3 - User
	*/
	protected Date registrationDate, lastOnline;
	protected boolean isActive;

	public User()
	{
		type = Type.ERROR;
		name = "";
		email = "";
		phone = "";
		password = "";
		registrationDate = new Date();
		lastOnline = new Date();
		isActive = true;
	}
	
	public User(Type type,String name, String email, String phone, String password, Date registrationDate)
	{
		this.type = type;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.password=password;
		this.registrationDate = registrationDate;
		lastOnline = new Date();
		isActive = true;
	}
	
	//The setter and Getter methods are limited to one line each for brevity
	// they are also aligned for ease of reading.

	//Getters definitions
	public Type 	getType() { 		return type; }
	public String 	getName() { 		return name; }
	public String 	getEmail() { 		return email; }
	public String 	getPhone() { 		return phone; }
	public String 	getPassword() { 	return password; }
	public Date 	getLastOnline() { 	return lastOnline; }
	public Date 	getJoinDate() { 	return registrationDate; }
	public boolean 	getActive() { 		return isActive; }
	
	//Setters definitions
	public void setName(	String name) { 		this.name = name; }
	public void setEmail(	String email) { 	this.email = email; }
	public void setPhone(	String phone) { 	this.phone = phone; }
	public void setPassword(String password) { 	this.password = password; }
	public void setLastOnline(Date date) { 		lastOnline = date; }
	public void setActive(	boolean status) { 	isActive = status; }

	public abstract String toString();
	
}