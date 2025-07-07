package exceptionhandlingpack;

import java.util.Scanner;

public class SampleSeven {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your childs age:");

		int age = scanner.nextInt();

		scanner.close();

		if (age <= 5) {
			System.out.println("Welcome to the garden");
		} else {
			try {
				throw new Exception("Childs age should be less than 6");
			} catch (Exception e) {
				System.out.println(e);
			}

		}

		System.out.println("End of this program");

	}

}
