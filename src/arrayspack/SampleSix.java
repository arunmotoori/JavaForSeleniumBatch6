package arrayspack;

public class SampleSix {

	public static void main(String[] args) {

		int[] ar = { 9, 5, 7, 6, 2, 4 };

		for (int e : ar) {
			System.out.println(e); // 9 5 7 6 2 4
		}

		System.out.println("-------------");

		for (int i = 1; i < 5; i++) {
			System.out.println(ar[i]);
		}

	}

}
