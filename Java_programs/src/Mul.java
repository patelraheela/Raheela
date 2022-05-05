
public class Mul
{
	int Multi()
	{
		int a=50,b=8;
		int c=a*b;
		return c;
	}
	void Multi(int x,int y) 
	{
		int c=x*y;
		System.out.println("Multiplication= "+c);
	}
	void Multi(int x,double y)
	{
		double c=x*y;
		System.out.println("Multiplication= "+c);
	}
	public static void main(String[] args) {
		Mul m=new Mul();
		int mul=m.Multi();
		System.out.println(mul);
		m.Multi(8,9);
		m.Multi(8,2.5);
	}

}
