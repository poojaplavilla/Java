package bytestreamread;

import java.io.FileInputStream;
import java.io.IOException;

public class TestByteRead 
{

	public static void main(String args[]) throws IOException 
	{

		FileInputStream fis = new FileInputStream("C:\\Program Files\\testf.txt");
		int x = 0;
		while ((x = fis.read()) != -1) 
		{
			System.out.print((char)x);
		}
	}
}
