package interfacespack;

public class Demo {

	public static void main(String[] args) {
		
		//new Bank();
		
		System.out.println(Bank.ACCOUNT_TYPE_ONE);
		System.out.println(Bank.ACCOUNT_TYPE_TWO);

		HDFCBank hdfcBank = new HDFCBank();
		hdfcBank.openBankAccount();
		hdfcBank.depositMoney();
		hdfcBank.transferMoney();
		hdfcBank.openFixedDeposit();

		AxisBank axisBank = new AxisBank();
		axisBank.openBankAccount();
		axisBank.depositMoney();
		axisBank.transferMoney();
		axisBank.openFixedDeposit();
	}

}
