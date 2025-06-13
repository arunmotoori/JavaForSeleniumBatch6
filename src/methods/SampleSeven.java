package methods;

public class SampleSeven {

	public static void main(String[] args) {
		
		demoOne();
		demoTwo(9);
		int s = demoThree(3,4);
		System.out.println(s);
		System.out.println(demoThree(6,8));
		int r = demoFour();
		System.out.println(r); 
		String m = demoFive();
		System.out.println(m);

	}
	
	public static String demoSix(int a,String b) {
		return a+b;
	}
	
	public static double demoSeven(int a,double b) {
		return a+b;
	}
	
	public static void demoOne() {
		
		System.out.println("demoOne method got executed");
		
	}
	
	public static void demoTwo(int a) {
		
		System.out.println(a);
		
	}
	
	public static int demoThree(int x,int y) {
		
		int z = x + y;
		return z;
		
	}
	
	public static int demoFour() {
		
		return 10;
		
	}
	
	public static String demoFive() {
		return "Arun";
	}

}
