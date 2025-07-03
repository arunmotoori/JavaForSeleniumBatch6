package stringspack;

public class SampleTwo {

	public static void main(String[] args) {
		
		String one = "Arun";
		String two = "Varun";
		String three = "Arun";
		
		System.out.println(one.equals(two)); // false
		System.out.println(one.equals(three)); // true
		System.out.println("arun".equals("Arun")); // false
		System.out.println("Arun".equals("Arun")); // true

	}

}
