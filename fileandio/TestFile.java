package fileandio;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		
		File f = new File("C:\\Program Files\\testf.txt");
		System.out.println("File exists: " + f.exists());
		System.out.println("File path: " + f.getAbsolutePath());
		System.out.println("File length: " + f.length());
		System.out.println("Is file readable: " + f.canRead());
		System.out.println("Is file writeable: " + f.canWrite());
		System.out.println("Is file executable: " + f.canExecute());
		

	}

}
