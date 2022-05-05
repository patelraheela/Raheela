import java.util.Scanner;

class Num
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
class Add extends Num
{
	void add()
	{
	c=a+b;
	System.out.println("Addition= "+c);
	}
}
public class Substract extends Num{
	void sub()
	{
	c=a-b;
	System.out.println("Substraction= "+c);
	}
	public static void main(String[] args) 
	{
		Add a=new Add();
		a.Input();
		a.add();
		Substract sb=new Substract();
		sb.Input();
		sb.sub();
		
	}

}
