package exceptionhandlingpack;

public class SampleTwo {

	public static void main(String[] args) {
		
		int[] ar = {9,5,1,7};
		
		try {
			System.out.println(ar[4]);  // new ArrayIndexOutOfBoundsException();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException got handled");
		}
		
		System.out.println("End of this program");

	}

}
