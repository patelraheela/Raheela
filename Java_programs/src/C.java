class Super
{
	Super(int a)
	{
	System.out.println("Super class..."+a);	
	}
	}
class Sub extends Super 
{
	
	Sub()
	{
		super(100);
	System.out.println("Sub class...");	
	}
	}

public class C {

	public static void main(String[] args) {
		Sub s=new Sub();

	}

}
