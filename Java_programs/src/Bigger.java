import java.util.Scanner;

public class Bigger {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter three numbers: ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater...");	
		
			}
			else
			{
				System.out.println("c is greater...");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greater...");
			}
			else
			{
				System.out.println("c is greater...");
			}
		}
			
	}

}
