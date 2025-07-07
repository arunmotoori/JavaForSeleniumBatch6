package exceptionhandlingpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SampleFive {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:\\QAFox\\WorkspaceBatch6\\FirstJavaProject\\abc\\xyz.txt");
		
		FileInputStream fis = new FileInputStream(file);
		
		System.out.println("End of this program");
		
	}

}
