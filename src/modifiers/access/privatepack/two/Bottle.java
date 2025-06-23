package modifiers.access.privatepack.two;

public class Bottle {
	
	private int quantity = 5;
	private String color;
	
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void callMethods() {
		fillBottle();
	}
	
	private void fillBottle() {
		System.out.println("Bottle got filled");
	}

}
