package overloadingpack.method;

public class Demo {

	public static void main(String[] args) {
		
		Box b = new Box();
		
		b.square(5);
		b.square(5.5);
		b.square(5,6.5);
		b.square(1.2,3);
		

	}

}
