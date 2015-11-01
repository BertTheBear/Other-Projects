
public class Wallet 
{
	private int amount;
	private String owner;
	
	public Wallet()
	{
		amount = 0;
		owner = "none";
	}
	
	public Wallet(String owner, int amount) {	
		this.amount = amount;
		this.owner = owner;
	}
	
	public int getAmount() {	return amount; }
	public String getOwner() {		return owner; }
	
	public void setAmount(int amount) { this.amount = amount;}
	//No setter for owner
}
