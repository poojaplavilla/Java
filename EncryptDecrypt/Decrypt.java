package encrptdecrypt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Decrypt {
	public void decrypt() throws IOException {

		FileInputStream fin = new FileInputStream("C:/Users/Pooja/File_Encry.txt");
		FileOutputStream fos = new FileOutputStream("C:/Users/Pooja/File_Decry.txt");

		int ch = 0;

		while ((ch = fin.read()) != -1) {
			ch--;
			fos.write(ch);
		}

		fos.close();
	}

}
