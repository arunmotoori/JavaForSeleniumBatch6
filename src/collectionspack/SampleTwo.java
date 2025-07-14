package collectionspack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SampleTwo {

	public static void main(String[] args) {
		
		//ArrayList<Object> list = new ArrayList<>();
		List<Object> list = new ArrayList<>();
		//Collection<Object> list = new ArrayList<>();
		
		list.add(9);
		list.add(5.5);
		list.add(false);
		list.add("Arun Motoori");
		list.add('s');
		list.add(9L);
		list.add(8.9F);
		
		for(Object e : list) {
			System.out.println(e);
		}
	
	}

}
