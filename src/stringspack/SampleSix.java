package stringspack;

public class SampleSix {

	public static void main(String[] args) {
		
		String str = "I love Java programming.";
		
		//System.out.println(str.indexOf("Java"));
		
		if(str.indexOf("Python")!=-1) {
			System.out.println("Text is found");
		}else {
			System.out.println("Text is not found");
		}

	}

}
