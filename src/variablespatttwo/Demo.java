package variablespatttwo;

public class Demo {
	
	static int a = 5;  // Global variable

	public static void main(String[] args) {
		
		int b = 10;  // Local Variable
		int c = a + b;  // Local Variables
		System.out.println(c);

	}
	
	public static void sampleOne() {
		
		System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
		
	}

}
