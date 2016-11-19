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
	
	public double deposit (double amount) {
		balance = balance + amount;
		return balance;
	}

}
