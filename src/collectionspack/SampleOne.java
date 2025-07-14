package collectionspack;

import java.util.ArrayList;

public class SampleOne {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(9); // 0
		list.add(5); // 1
		list.add(7); // 2
		list.add(1); // 3
		list.add(9); // 4
		list.add(9); // 5
		
//		System.out.println(list.get(0)); // 9
//		System.out.println(list.get(1)); // 5
//		System.out.println(list.get(2)); // 7
//		System.out.println(list.get(3)); // 1
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i)); // 9 5 7 1 
//		}
		
		for(Integer e : list) {
			System.out.println(e); // 9 5 7 1 
		}
		
		System.out.println("---------------");
		
		list.add(8); // 6
		
		for(Integer e : list) {
			System.out.println(e); // 9 5 7 1 8
		}
		

	}

}
