package methods;

public class SampleSix {

	public static void main(String[] args) {
		
		addTwoNumbers(5,4);
		//addTwoNumbers(5.5,4.3);
		//addTwoNumbers("Arun","Motoori");
		addThreeNumbers(3,4,5);

	}
	
	public static void addTwoNumbers(int a,int b) {
		
		int sum = a + b;
		System.out.println("The sum of a:"+a+" and b:"+b+" is "+sum);
		
	}
	
	public static void addThreeNumbers(int x,int y,int z) {
		
		int sum = x + y + z;
		System.out.println(sum);
		
	}

}
