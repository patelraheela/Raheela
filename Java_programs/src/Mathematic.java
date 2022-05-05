//Multilevel Inheritance
import java.util.Scanner;

class Numbers
{
	int a,b,c;
	void Input()
	{
	System.out.println("Enter two numbers: ");
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();
	}
}
class Addition extends Numbers
{
	void add() 
	{
		c=a+b;
		System.out.println("Addition= "+c);
	}
}
class Substraction extends Addition
{
	void Sub() 
	{
		c=a-b;
		System.out.println("Substraction= "+c);
	}
}

public class Mathematic {

	public static void main(String[] args) 
	{
	Substraction sb= new Substraction();
	sb.Input();
	sb.add();
	sb.Sub();
	}

}
