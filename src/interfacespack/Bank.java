package interfacespack;

public interface Bank {
	
	String ACCOUNT_TYPE_ONE = "Savings";  
	String ACCOUNT_TYPE_TWO = "Current";  
	
	public void openBankAccount();
	
	public void depositMoney();
	
	public void transferMoney();
	
	public void openFixedDeposit();
	
	default void openFlexiFDs() {
		
		
	}

}
