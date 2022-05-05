import java.util.LinkedList;

public class Collection_LinkedList 
{

	public static void main(String[] args)
	{
		LinkedList<String> Name=new LinkedList<String>();
		Name.add("Afsar");
		Name.add("Shahenaaz");
		Name.add("Kaif");
		Name.add("Patel");
		Name.add("Raheela");
		System.out.println(Name);
		Name.add(3, "Irfan");
		System.out.println(Name);
		Name.addFirst("Patel");
		System.out.println(Name);
		Name.addLast("Shaikh");
		System.out.println(Name);
		System.out.println(Name.indexOf("Raheela"));
		System.out.println(Name.remove(3));
		System.out.println(Name.removeFirst());
		System.out.println(Name.removeLast()+"\n\n");
		for(String s:Name)
		{
			System.out.println(s);
		}
		
	}

}
