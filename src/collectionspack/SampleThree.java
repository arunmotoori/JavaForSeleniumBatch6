package collectionspack;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SampleThree {

	public static void main(String[] args) {
		
		//HashSet<Integer> set = new HashSet<>();
		Set<Integer> set = new HashSet<>();
		//Collection<Integer> set = new HashSet<>();
		
		set.add(9);
		set.add(15);
		set.add(1);
		set.add(4);
		set.add(18);
		set.add(99);
		set.add(3);
		set.add(9);
		set.add(9);
		
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
		
//		for(Integer e : set) {
//			System.out.println(e);
//		}
		

	}

}
