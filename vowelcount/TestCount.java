package vowelcount;
import java.io.FileInputStream;
import java.io.IOException;

public class TestCount 
{

	public static void main(String[] args) throws IOException
	{
		
				FileInputStream fis = new FileInputStream("C:\\Program Files\\testf.txt");
				int x = 0;
				int vowels = 0;
				int consonants = 0;
				//float per=0;

				while ((x = fis.read()) != -1) 
				{
					//x++;
				//	System.out.println("Total number of words: " + x);
					
					System.out.print((char)x);
					
					char ch = (char) x;
					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
					{
						vowels++;
					}
					else
					{
						consonants++;
					}
					
					//per = (vowels/x) * 100 ;
					
				}
				//x++;
				//System.out.println("Total number of words: " + x);
				System.out.println("\nNo. of vowels: " + vowels);
				System.out.println("No. of consonants: " + consonants);
				//System.out.println("Percentage of Vowels:" + per);
			}
		}

	
