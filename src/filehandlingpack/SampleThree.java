package filehandlingpack;

import java.io.File;
import java.io.IOException;

public class SampleThree {

	public static void main(String[] args) throws IOException {
		
		File folder = new File(System.getProperty("user.dir")+"\\efg");
		
		File file = new File(System.getProperty("user.dir")+"\\efg\\arun.txt");
		File file2 = new File(folder,"motoori.txt");
			
	    if(!file2.exists()) {
	    	file2.createNewFile();
	    }
	    
	    System.out.println(file2.isFile()); // true
	    System.out.println(folder.isFile()); //false
	    System.out.println(file2.isDirectory()); // false
	    System.out.println(folder.isDirectory()); // true
	    
	    if(file.exists()) {
	    	file.delete();
	    }
	    
	    if(file2.exists()) {
	    	file2.delete();
	    }
	    
	    if(folder.exists()) {
	    	folder.delete();
	    }
	    
	    System.out.println("End of this program.");

	}

}
