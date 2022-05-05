import java.util.Scanner;

public class Logical_Operator2 {
	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("Enter three Numbers");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		System.out.println(a>b && a>c);
		System.out.println(b>a || c>b);
		System.out.println(!(a==b)&&(c!=b));
	}
}
