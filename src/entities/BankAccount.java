package entities;

public class BankAccount {
	
	private String name;
	private int accountNumber;
	private double deposit;
	//private double withdrawal;
	private double balance;
	
	public BankAccount(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}

	public BankAccount(String name, int accountNumber, double deposit) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		getCreditAccount(deposit);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void getCreditAccount (double deposit) {
		this.balance +=deposit;
		
	}
	
	public void debitAccount (double withdrawal) {
		balance -=(withdrawal+5);
	 
	} 
	
	public String toString() {
		return name
				+" conta: "+accountNumber
				+" saldo  "+String.format("%.2f", balance);
				
		
	}
}

	

