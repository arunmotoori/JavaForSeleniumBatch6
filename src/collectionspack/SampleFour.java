package collectionspack;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SampleFour {

	public static void main(String[] args) {
		
		//HashMap<String,Object> map = new HashMap<>();
		Map<String,Object> map = new HashMap<>();
		
		map.put("firstName","Arun");
		map.put("lastName","Motoori");
		map.put("experience",19);
		map.put("working",false);
		map.put("location","Hyderabad");
		map.put("location","Secunderabad");
		map.put("place","Secunderabad");
		
	    for(Entry<String, Object> e : map.entrySet()) {
	    	System.out.println(e.getKey()+" - "+e.getValue());
	    }
		

//		for(String key : map.keySet()) {
//			System.out.println(key+" - "+map.get(key));
//		}
		
		
//		System.out.println(map.get("experience"));  // 19
//		System.out.println(map.get("firstName")); // Arun
//		System.out.println(map.get("working")); // false
//		System.out.println(map.get("lastName")); // Motoori
//		System.out.println(map.get("location")); // Secunderabad
//		System.out.println(map.get("place")); // Secunderabad
		
	}

}
