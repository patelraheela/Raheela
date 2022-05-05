import java.util.Stack;

public class Collection_Stack 
{

	public static void main(String[] args) 
	{
		Stack<String> Name=new Stack<String>();//LIFO
		Name.add("First");
		Name.push("Second");
		Name.push("Third");
		System.out.println(Name);
		Name.remove(2);
		System.out.println(Name);
		Name.pop();
		System.out.println(Name);
		
	}

}
