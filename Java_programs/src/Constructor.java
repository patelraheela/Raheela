
public class Constructor {

	Constructor()
	{
		System.out.println("Hello World...");
	}
	Constructor(int a,int b)
	{
		
		int c=a+b;
		System.out.println("Addition= "+c);
	}
	public static void main(String[] args) {
		Constructor c= new Constructor(); 
		Constructor c1= new Constructor(10,30);
	}

}
