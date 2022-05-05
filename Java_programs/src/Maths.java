
//Multilevel inheritance
interface Number
{
	int a=10;
	int b=50;
}
interface Sum
{
	void add();
}
public class Maths implements Number,Sum
{
	public void add()
	{
		int c=a+b;
		System.out.println("Addition= "+c);
	}
	public static void main(String[] args)
	{
		Maths m=new Maths();
		m.add();
		
	}

}
