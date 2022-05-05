import java.util.Scanner;

class main {
	int count;
	
	main()
	{
		System.out.println("Enter Count: ");
		Scanner s= new Scanner(System.in);
		count=s.nextInt();
		for(int i=0;i<=count;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}

public class Even
{
public static void main(String [] args)
{
	main m=new main();
}
}