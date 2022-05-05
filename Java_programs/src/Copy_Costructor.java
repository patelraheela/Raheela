
public class Copy_Costructor {
		int a;
		String b;
		Copy_Costructor()
		{
			a=10;
			b="Raheela";
			System.out.println("a= "+a+" b= "+b);
		}
		Copy_Costructor(Copy_Costructor c)
		{
			a=c.a;
			b=c.b;
			System.out.println("a= "+a+" b= "+b);
		}
		public static void main(String[] args) {
			Copy_Costructor r=new Copy_Costructor();
			Copy_Costructor r2=new Copy_Costructor(r);
	}
		

}
