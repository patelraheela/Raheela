
public class Div {

	public static void main(String[] args) {
		System.out.println("Main method started....");
		int  a=54,b=0;
		try
		{
		int c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Can't Divide by zero!");
		}
		System.out.println("Main method Ended....!");
	}

}
