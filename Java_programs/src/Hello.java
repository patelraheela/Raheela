
public class Hello
{
	Hello()
	{
		this(100); //calls parameterized constructor
		
		System.out.println("Default....");
		
	}
	Hello(int a)
	{
		//this(); //calls default constructor
		System.out.println(a);
	}

		public static void main(String[] args)
		{
			Hello h= new Hello();
			//Hello h= new Hello(100);
			//System.out.println(h);
		}

	

}
