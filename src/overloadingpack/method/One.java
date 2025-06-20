package overloadingpack.method;

public class One {

	public static void main(String[] args) {
		 
		Calculate c = new Calculate();
		
		c.add();
		c.add(5);
		c.add(1, 2);
		c.add(1, 2,3);
		c.add(1,2,3,4);
		c.add(1,2,3,4,5);

	}

}
