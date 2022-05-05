import java.util.Scanner;

public class If_else {
public static void main(String args[] )
{
	System.out.println("Enter a year: ");
	Scanner s=new Scanner(System.in);
	int yr=s.nextInt();
	if(yr%4==0)
		{
		System.out.println("Leap year..");
	
		}
	else
		{
		System.out.println("Not a Leap year..");
		}
	}

}
