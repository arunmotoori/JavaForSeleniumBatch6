package arrayspack.two;

public class SampleTwo {

	public static void main(String[] args) {

		int[][] ar = {{9,5,1,7},{8,6,2,4},{3,9,6,8}};
		
		for(int i=0;i<3;i++) {  
			
			for(int j=0;j<4;j++) {  
				
				System.out.println(ar[i][j]); // 9 5 1 7 8 6 2 4 3 9 6 8 
				
			}
			
		}

	}

}
