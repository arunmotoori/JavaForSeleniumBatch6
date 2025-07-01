package interfacespack;

public class HDFCBank implements Bank {

	@Override
	public void openBankAccount() {
		
		System.out.println("HDFC Bank Account opened");
		
	}

	@Override
	public void depositMoney() {
		
		System.out.println("Money deposited in HDFC Bank");
		
	}

	@Override
	public void transferMoney() {
		
		System.out.println("Money transferred to HDFC Bank");
		
	}

	@Override
	public void openFixedDeposit() {
		
		System.out.println("Fixed Deposit opened in HDFC Bank");
		
	}


}
