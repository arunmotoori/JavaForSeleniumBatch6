package modifiers.access.publicpack.two;

import modifiers.access.publicpack.one.Phone;

public class Sample {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		
		p.company = "iPhone";
		p.modal = "16 Pro Max";
		p.price = 150000;
		
		System.out.println(p.company);
		System.out.println(p.modal);
		System.out.println(p.price);
		
		p.turnOnthePhone();
		p.makeACall();

	}

}
