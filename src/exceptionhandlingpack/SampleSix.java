package exceptionhandlingpack;

import java.util.Scanner;

public class SampleSix {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number for variable a:");
		int a = scanner.nextInt();
		System.out.println("Enter any number for variable b:");
		int b = scanner.nextInt();
		
		
		try {
			int result = a/b;
			System.out.println(result);
		}catch(ArithmeticException ae) {
			//System.out.println("ArithmeticException got handled here");
			//System.out.println(ae);
			//System.out.println(ae.getMessage());
			ae.printStackTrace();
		}finally {
			scanner.close();
			System.out.println("scanner resource got closed");
		}
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("End of this program");
		

	}

}
