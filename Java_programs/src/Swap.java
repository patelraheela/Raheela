import java.util.Scanner;

public class Swap {
public static void main(String []args)
{
	int a,b;
	System.out.println("Enter Two numbers to swap: ");
	Scanner s= new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	
	method(a,b);
	
}
	public static void method(int a,int b)
	{
		System.out.println("Values before Swaping>>> "+"a="+a+" "+"b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Values after swap>>> "+"a="+a+" "+"b="+b);
	}
}
