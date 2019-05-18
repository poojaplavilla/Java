package vowelcount;
import java.io.FileInputStream;
import java.io.IOException;

public class TestCount 
{

	public static void main(String[] args) throws IOException
	{		
				FileInputStream fis = new FileInputStream("C:\\Program Files\\testf.txt");
				float x = 0;
				float vowels = 0;
				float consonants = 0;
				float space = 0;
				float line = 0;
				float pervow,percon,perspa;

				while ((x = fis.read()) != -1) 
				{			
					System.out.print((char)x);

					char ch = (char) x;
					if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
					{
						vowels++;
					}
					else if(ch == ' ') 
					{
						space++;
					}
					else if(ch == '\n')
					{
						line++;
					}
					else
					{
						consonants++;
					}					
				}
				
				x= vowels + consonants;
				
				System.out.println("\nTotal number of words: " + x);
				System.out.println("\nNo. of vowels: " + vowels);
				System.out.println("No. of consonants: " + consonants);
				System.out.println("No. of space: " + space);
				System.out.println("No. of line: " +  line);

				pervow =(vowels/x) * 100;
				System.out.println("Percentage of Vowels:" + pervow);
				
				percon = (consonants/x) * 100;
				System.out.println("Percentage of Consonants: " + percon);
				
				perspa =(space/x) * 100;
				System.out.println("Percentage of Space:" + perspa);
			}
		}

	
