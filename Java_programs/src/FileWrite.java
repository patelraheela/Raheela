import java.io.*;

public class FileWrite
{
	public static void main(String args[])
	{
		
		try {
				FileWriter f=new FileWriter("C:\\Users\\JAMSHRI\\Desktop\\Raheela\\File.txt");
				try 
				{
					f.write("My self Raheela!");
					
				}
				finally
				{
					f.close();
				}
			}
		catch(IOException i)
		{
			System.out.println(i);
		}
		System.out.println("Witten successfully");
	}
	
}
