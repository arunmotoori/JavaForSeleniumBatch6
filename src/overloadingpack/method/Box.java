package overloadingpack.method;

public class Box {
	
	public void square(int a) {
		System.out.println(a);
	}
	
	public void square(double a) {
		System.out.println(a);
	}
	
	public void square(int a,double b) {
		System.out.println(a+b);
	}
	
	public void square(double a,int b) {
		System.out.println(a+b);
	}

}
