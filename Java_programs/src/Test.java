class A
{
	int a=10;
	void show()
	{
		System.out.println("Hello World....");
	}
}
class B extends A
{
	int a=30;
	void show()
	{
		super.show();
	System.out.println("Super class a: "+super.a);
	}
}
public class Test {

	public static void main(String[] args) {
	B b= new B();
	b.show();
	//System.out.println("Super class a"+super.a);
	System.out.println("Sub class a: "+ b.a);
	}

}
