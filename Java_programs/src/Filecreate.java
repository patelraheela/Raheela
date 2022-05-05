import java.io.*;
public class Filecreate {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\JAMSHRI\\Desktop\\Raheela\\File.txt");
		if(f.createNewFile())
		{
			System.out.println("File Created Successfully....");
		}
		else
		{
			System.out.println("File allready exist....");
		}
	}

}
