import java.util.Scanner;

class InvalidchoiceException extends Exception
{
	InvalidchoiceException(String msg)
	{
		System.out.println(msg);
	}
}
public class Calculator 
{

	public static void main(String[] args)throws InvalidchoiceException
	{
		
		int a,b,c;
		char ch = 0;
		System.out.println("Enter two numbers: ");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter your choice + for add - for substract * for multiply / for divide:  ");
		try
		{
		ch=s.next().charAt(0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		switch(ch)
		{
		case '+':
			c=a+b;
		System.out.println("Additopn= "+c);
		break;
		case '-':
			c=a-b;
		System.out.println("Substraction= "+c);
		break;
		case '*':
			c=a*b;
		System.out.println("Multiplication= "+c);
		break;
		case '/':
			c=a/b;
		System.out.println("Division= "+c);
		break;
		
		default:
			throw new InvalidchoiceException("Sorry the operation not available...");
		}
	
		}
	
	

}
