
class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg)
	{
		System.out.println(msg);
	}
}
public class Exception_Test {

	public static void main(String[] args)
	{
		try
		{
			vote(17);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	public static void vote(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Not Eligible for vote....");
		}
		else
		{
			System.out.println("Eligible for vot.....");
		}
	}

}
