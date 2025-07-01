package interfacespack;

public class AxisBank implements Bank {

	@Override
	public void openBankAccount() {
		
		System.out.println("Axis Bank Account opened");
		
	}

	@Override
	public void depositMoney() {
		
		System.out.println("Money deposited in Axis Bank");
		
	}

	@Override
	public void transferMoney() {
		
		System.out.println("Money transferred to Axis Bank");
		
	}

	@Override
	public void openFixedDeposit() {
		
		System.out.println("Fixed Deposit opened in Axis Bank");
		
	}

	

}
