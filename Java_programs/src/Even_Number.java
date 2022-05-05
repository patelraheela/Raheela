import java.util.Scanner;

public class Even_Number {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number: ");
		Scanner s =new  Scanner(System.in);
		try{
			
			num=s.nextInt();
			}
		finally {
					s.close();
				}
		while(num<0)
		{
			if(num%2==0)
			{
				System.out.println("Number is even...");
			}
			else
			{
				System.out.println("Number is Not a even Number...");
			}
		}

	}

}
