package filehandlingpack;

import java.io.File;
import java.io.IOException;

public class SampleOne {

	public static void main(String[] args) throws IOException {
		
//		System.out.println("Arun Motoori");
//		String str = "Java Programming";
//		Integer a = 9;
		//String b = "Arun\\Motoori";
		
		//File f1 = new File("C:\\Users\\arunm\\Downloads\\Files\\YKD.txt");
		
		//File f1 = new File("C:\\QAFox\\WorkspaceBatch6\\FirstJavaProject\\mno\\sam.txt");
		//File f1 = new File("C:/QAFox/WorkspaceBatch6/FirstJavaProject/mno/sam.txt");
		//File f1 = new File("mno/sam.txt");
		//File f1 = new File("./mno/sam.txt");
		File f1 = new File(System.getProperty("user.dir")+"\\mno\\jql.txt");
		
		//System.out.println(f1.exists());  // false
		
		if(!f1.exists()) {
			f1.createNewFile();
		}else {
			System.out.println("File already exists.");
		}
		
		System.out.println("End of this program");
	}

}
