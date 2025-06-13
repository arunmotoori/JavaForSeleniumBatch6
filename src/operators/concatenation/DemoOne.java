package operators.concatenation;

public class DemoOne {

	public static void main(String[] args) {
		
		int a = 5, b = 4;
		
		System.out.println(a+b); // Addition Operator
		
		System.out.println("The value stored in the variable a is: "+a); // Concatenation operator
		
		System.out.println("The sum of a: "+a+" and b: "+b+" is: "+a+b);
		
		// The sum of a: 
		// The sum of a: 5
		// The sum of a: 5 and b: 
		// The sum of a: 5 and b: 4
		// The sum of a: 5 and b: 4 is: 
		// The sum of a: 5 and b: 4 is: 5
		// The sum of a: 5 and b: 4 is: 54
		
		System.out.println("The sum of a: "+a+" and b: "+b+" is: "+(a+b));
		
		// The sum of a: 
		// The sum of a: 5
		// The sum of a: 5 and b: 
		// The sum of a: 5 and b: 4
		// The sum of a: 5 and b: 4 is: 
		// The sum of a: 5 and b: 4 is: 9

	}

}
