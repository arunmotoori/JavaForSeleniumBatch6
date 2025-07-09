package filehandlingpack;

import java.io.File;

public class SampleTwo {

	public static void main(String[] args) {
		
		File fo1 = new File(System.getProperty("user.dir")+"\\efg");
		
		if(!fo1.exists()) {
			fo1.mkdir();
		}else {
			System.out.println("Folder already exists");
		}
		
		System.out.println("End of this program.");

	}

}
