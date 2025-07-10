package filehandlingpack;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class SampleEight {

	public static void main(String[] args) throws IOException {
		
		File file = new File(System.getProperty("user.dir")+"\\ten.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		PrintWriter pw = new PrintWriter(file);
		
		pw.println("My name is Arun Motoori.");
		pw.println("I love Java programming.");
		pw.println("Java is a popular programming language in the market");
		pw.print("I am explain how to write text into the file.");
		
		pw.flush();
		pw.close();
		
		System.out.println("End of this program.");

	}

}
