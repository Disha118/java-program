package bankdemo;

public class Account {
	private int accountNo; private String name; 
	private double balance;
	// Constructor
	public Account(int accountNo, String name, double balance)
	{
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	// Deposit method 
	public void deposit(double amount)
	{ 
		if (amount <= 0)
		{
			throw new ArithmeticException("Deposit amount cannot be zero or negative.");
	}
	balance += amount;
	System.out.println("Deposited: " + amount);
	}
	// Withdraw method
	public void withdraw(double amount) throws InsufficientBalanceException 
	{
		if (amount <= 0)
		{
			throw new ArithmeticException("Withdrawal amount cannot be zero or negative.");
	}
	if (amount > balance)
	{
		throw new InsufficientBalanceException("Insufficient balance for withdrawal!");
	}
	balance -= amount;
	System.out.println("Withdrawn: " + amount);
	}
	// Show Balance 
	public void showBalance() {
	System.out.println("Account No: " + accountNo + ", Name: " + name + ", Balance: " + balance);
	}
}
