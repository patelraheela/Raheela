import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		int count;
		System.out.println("Enter Count: ");
		Scanner s=new Scanner(System.in);
		count=s.nextInt();
		for(int i=0;i<=count;i++)
		{
			for(int j=i;j<=count;j++)
			{
				System.out.print(" "+"*");
			}
			System.out.println();
		}
		System.out.println("\n");
		for(int i=0;i<=count;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+"*");
			}
			System.out.println();
		}
	}

}
