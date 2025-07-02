package arrayspack.two;

public class SampleFive {

	public static void main(String[] args) {
		
		int[][] ar = { { 9, 5, 1, 7 }, { 8, 6, 2, 4 }, { 3, 9, 6, 8 } };

		for(int[] r : ar ) {
			
			for(int e : r) {
				
				System.out.print(e+" "); 
				
			}
			
			System.out.println();
			
		}

	}

}
