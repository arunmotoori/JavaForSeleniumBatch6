package overloadingpack.method;

public class Calculate {
	
	public void add() {
		
	}
	
	public void add(int a) {
		
	}
	
	public void add(int a,int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	
	public void add(int a,int b,int c) {
		int sum = a + b + c;
		System.out.println(sum);
	}
	
	public void add(int a,int b,int c,int d) {
		int sum = a + b + c + d;
		System.out.println(sum);
	}
	
	public void add(int a,int b,int c,int d,int e) {
		int sum = a + b + c + d + e;
		System.out.println(sum);
	}

}
