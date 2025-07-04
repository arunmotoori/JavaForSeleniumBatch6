package exceptionhandlingpack;

public class SampleThree {

	public static void main(String[] args) {

		int a = 10, b = 0, c;

		try {
			c = a / b; // new ArithmeticException();
			System.out.println(c);
		} catch (Throwable e) {
			System.out.println("Exception got handled");
		}

		System.out.println(a);
		System.out.println(b);
		System.out.println("End of this program");

		int[] ar = { 9, 5, 1, 7 };

		try {
			System.out.println(ar[4]); // new ArrayIndexOutOfBoundsException();
		} catch (Exception e) {
			System.out.println("ArrayIndexOutOfBoundsException got handled");
		}

		System.out.println("End of this program");

	}

}
