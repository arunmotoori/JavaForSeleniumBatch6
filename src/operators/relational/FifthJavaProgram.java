package operators.relational;

public class FifthJavaProgram {

	public static void main(String[] args) {
		
		int a=9,b=5,c=3,d=9,e=19;
		
		System.out.println(a==b); // false
		System.out.println(a==e); // false
		System.out.println(a==d); // true
		
		System.out.println(a!=b); // true
		System.out.println(a!=e); // true
		System.out.println(a!=d); // false
		
		System.out.println(a>b); // true
		System.out.println(a>e); // false
		System.out.println(a>d); // false
		
		System.out.println(a<b); // false
		System.out.println(a<e); // true
		System.out.println(a<d); // false
		
		System.out.println(a>=b); // true
		System.out.println(a>=e); // false
		System.out.println(a>=d); // true
		
		System.out.println(a<=b); // false
		System.out.println(a<=e); // true
		System.out.println(a<=d); // true

	}

}
