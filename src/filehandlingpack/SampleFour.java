package filehandlingpack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SampleFour {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File(System.getProperty("user.dir")+"\\wednesday.txt");
		
		if(!file1.exists()) {
			file1.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file1);
		
		fw.write("My name is Arun Motoori.\nI love Java programming.\n"
				+ "Java is one of the popular programming languages in the market.\n"
				+ "Current we are in File handling mechanism topic in Java.");
		
		fw.flush();
		
		fw.close();
		
		System.out.println("End of this program.");

	}

}
