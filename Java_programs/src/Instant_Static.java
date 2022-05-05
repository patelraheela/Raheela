
public class Instant_Static {
	int a=10;
	static String b="Hello";
	static {
		//System.out.println("a= "+a+" b= "+b);
		System.out.println(" b= "+b);
	}
	{
		System.out.println("a= "+a+" b= "+b);
	}

	public static void main(String[] args) {
		
		Instant_Static i=new Instant_Static();
	}

}
