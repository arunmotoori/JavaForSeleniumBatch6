package modifiers.nonaccess.staticpack;

public class Sample {
	
	static int result = 10; //static  
	int maximum = 50; //instance
	

	public static void main(String[] args) {
		
		System.out.println(result);	
		
		Sample s = new Sample();
		
		System.out.println(s.maximum);
		
		demoOne();
		s.demoTwo();

	}
	
	public static void demoOne() {
		
		System.out.println(result);
		
		Sample s = new Sample();
		
		System.out.println(s.maximum);
		
		demoOne();
		s.demoTwo();
		
	}
	
	public void demoTwo() {
		
		System.out.println(result);
		System.out.println(maximum);
		
		demoOne();
		demoTwo();
		
	}

}
