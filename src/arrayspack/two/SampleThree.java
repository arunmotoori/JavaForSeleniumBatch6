package arrayspack.two;

public class SampleThree {

	public static void main(String[] args) {

		int[][] ar = { { 9, 5, 1, 7 }, { 8, 6, 2, 4 }, { 3, 9, 6, 8 } };

		for (int r = 0; r < 3; r++) {

			for (int c = 0; c < 4; c++) {

				System.out.print(ar[r][c]+" ");  

			}
			
			System.out.println();

		}

	}

}
