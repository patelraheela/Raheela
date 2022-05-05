class Ab
{
	int a;
	String b;
	private Ab()
	{
		a=100;
		b="Raheela";
		System.out.println("a= "+a+" b= "+b);
	}
	public void show()
	{
		System.out.println("Hello....");
	}
}

public class Private_constructor {

	public static void main(String[] args) 
	{
		//Ab r=new Ab();
		Private_constructor p=new Private_constructor();
		//p.show();
		

	}

}
