package filehandlingpack;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SampleFive {

	public static void main(String[] args) throws IOException {
		
		File file = new File(System.getProperty("user.dir")+"\\wednesday.txt");
		
		FileReader fr = new FileReader(file);
		
		int n = fr.read();
		
		while(n!=-1) {
			System.out.print((char)n); 
			n = fr.read();
		}
	
		fr.close();
	}

}
