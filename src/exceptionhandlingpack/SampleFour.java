package exceptionhandlingpack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SampleFour {

	public static void main(String[] args) {
		
		int a = 0,b = 0,c;
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter integer value into variable a:");
			a = scanner.nextInt();
			System.out.println("Enter integer value into variable b:");
			b = scanner.nextInt();
			scanner.close();
			c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException got handled here");
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException got handled here");
		}catch(Exception e) {
			System.out.println("Exception got handled");
		}catch(Throwable e) {
			System.out.println("Exception got handled");
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println("End of this program");

	}

}
