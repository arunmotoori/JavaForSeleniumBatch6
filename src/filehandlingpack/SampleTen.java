package filehandlingpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SampleTen {

	public static void main(String[] args) throws IOException {
		
		File file = new File(System.getProperty("user.dir")+"\\july.txt");
		
		FileInputStream fis = new FileInputStream(file);
		
		int n = fis.read();
		
		while(n!=-1) {
			System.out.print((char)n);		
			n = fis.read();
		}
		
	}

}
