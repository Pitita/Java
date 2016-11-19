package serie7.implementation3;

public class Account {
	private final double RATE = 0.035;
	
	private long acctNumber;
	private double balance;
	private String name;
	
	public Account (String owner, long account, double initial){
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	
	public Account (String owner, long account){
		name = owner;
		acctNumber = account;
		balance = 0.0;
	}
	
	public double deposit (double amount) {
		if(amount > 0)
		{
			balance = balance + amount;
		}
		else
		{
			System.out.println("Error: negative Zahl!");
		}
		return balance;
	}
	
	public double withdraw(double amount, double fee)
	{
		if(amount+fee >= balance)
		{
			balance = balance - amount - fee;
		}
		else
		{
			System.out.println("keine Auszahlung möglich!");
		}
		return balance;
	}

}
