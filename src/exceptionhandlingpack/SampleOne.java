package exceptionhandlingpack;

public class SampleOne {

	public static void main(String[] args) {
		
		int a = 10, b = 0, c;
		
		try {
			c = a/b;   // new ArithmeticException();
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException got handled");
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("End of this program");
		
	}

}
