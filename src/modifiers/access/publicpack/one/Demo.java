package modifiers.access.publicpack.one;

public class Demo {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		
		p.company = "Samsung";
		p.modal = "S25 Ultra";
		p.price = 100000;
		
		System.out.println(p.company);
		System.out.println(p.modal);
		System.out.println(p.price);
		
		p.turnOnthePhone();
		p.makeACall();

	}

}
