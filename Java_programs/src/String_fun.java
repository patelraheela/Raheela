import java.util.Scanner;

public class String_fun {
public static void main(String [] args)
{
	String s1,s2;
	System.out.println("Enter two strings: ");
	Scanner s=new Scanner(System.in);
	s1=s.nextLine();
	s2=s.nextLine();
	System.out.println("First String: "+s1);
	System.out.println("Second String: "+s2);
	System.out.println(s1.toLowerCase());
	System.out.println(s2.toUpperCase());
	System.out.println(s1.equals(s2));
	int l=s1.length();
	System.out.println("First String length: "+l);
	System.out.println(s1.concat(s2));
	if(s1.equals(s2))
	{
		System.out.println("Strings are equal....");
	}
	else
	{
		System.out.println("Strings are not equal....");
	}
	if(s1==s2)
	{
		System.out.println("Strings are equal....");
	}
	else
	{
		System.out.println("Strings are not equal....");
	}
}
}
