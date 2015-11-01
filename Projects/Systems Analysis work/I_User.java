import java.util.Date;


public interface I_User {

	public Type 	getType();
	public String 	getName();
	public String 	getEmail();
	public String 	getPhone();
	public String 	getPassword();
	public Date 	getLastOnline();
	public Date 	getJoinDate();
	public boolean 	getActive();
	
	public void setName(	String name);
	public void setEmail(	String email);
	public void setPhone(	String phone);
	public void setPassword(String password);
	public void setLastOnline(Date date);
	public void setActive(	boolean status);

	public String toString();
}
