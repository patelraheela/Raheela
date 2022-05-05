import java.util.ArrayDeque;

public class Collection_ArrayDeque
{

	public static void main(String[] args)
	{
		ArrayDeque<String> A=new ArrayDeque<String>();//FIFO
		A.add("First");
		A.add("Second");
		A.add("Third");
		System.out.println(A);
		A.remove();
		System.out.println(A);

	}

}
