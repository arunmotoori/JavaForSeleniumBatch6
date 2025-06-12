package methods;

public class SampleThree {

	public static void main(String[] args) {

		System.out.println("start of main method");
		demoMethodOne(); 
		System.out.println("end of main method");

	}

	public static void demoMethodOne() {

		System.out.println("start of demoMethodOne");
		demoMethodTwo();
		System.out.println("end of demoMethodOne");

	}

	public static void demoMethodTwo() {

		System.out.println("start of demoMethodTwo");
		demoMethodThree();
		System.out.println("end of demoMethodTwo");

	}

	public static void demoMethodThree() {

		System.out.println("start of demoMethodThree");
		System.out.println("end of demoMethodThree");

	}

}
