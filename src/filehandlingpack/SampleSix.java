package filehandlingpack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SampleSix {

	public static void main(String[] args) throws IOException {
		
		File file = new File(System.getProperty("user.dir")+"\\thursday.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("My name is Arun Motoori.");
		bw.newLine();
		bw.write("I love Java programming.");
		bw.newLine();
		bw.write("Java is one of the popular programming languages in the market");
		bw.newLine();
		bw.write("I am explaining how to read and write the data from files.");
		
		bw.flush();
		bw.close();
		
		System.out.println("End of this program.");

	}

}
