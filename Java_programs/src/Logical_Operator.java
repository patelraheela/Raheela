import java.util.Scanner;

public class Logical_Operator 
{

	public static void main(String[] args) 
	{
		int a,b;
		System.out.println("Enter two Numbers");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(!(a==b));
		System.out.println(a<b);
	}

}
