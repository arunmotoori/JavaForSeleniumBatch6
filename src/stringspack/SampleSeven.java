package stringspack;

public class SampleSeven {

	public static void main(String[] args) {
		
		String str = "My name is Arun Motoori";
		
		String[] words = str.split("\\s");
		
		for(String word : words) {
			System.out.println(word);
		}

	}

}
