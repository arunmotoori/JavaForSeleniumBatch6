package modifiers.access.privatepack.two;

public class Sample {

	public static void main(String[] args) {
		
		Bottle b = new Bottle();
		
		//b.setQuantity(1);
		System.out.println(b.getQuantity());
		
		//b.setQuantity(2);	
		System.out.println(b.getQuantity());
		
		b.callMethods();

	}

}
