import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		int r=sum();
		System.out.println("Sum= "+r);
		}
	public static int sum()
	{
		int a,b;
		System.out.println("Enter two numbers: ");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		return a+b;
	}

}
