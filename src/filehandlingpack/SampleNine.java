package filehandlingpack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SampleNine {

	public static void main(String[] args) throws IOException {
		
		File file = new File(System.getProperty("user.dir")+"\\july.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}
		
		FileOutputStream fos = new FileOutputStream(file);
		
		String text = "My name is Arun Motoori.\n"
				+ "I love Java programming\n.Java is a popular programming language.\n"
				+ "We are in file handling mechanism topic.";
		
		fos.write(text.getBytes());
		
		fos.flush();
		fos.close();
		
		System.out.println("End of this program.");

	}

}
