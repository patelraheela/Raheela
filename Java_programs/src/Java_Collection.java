import java.util.ArrayList;

public class Java_Collection 
{

	public static void main(String[] args)
	{
		ArrayList<String> Name=new ArrayList<String>();
		Name.add("Raheela");
		Name.add("Kaif");
		Name.add("Shehnaaz");
		Name.add("Afsar");
		System.out.println(Name);
		Name.add(0, "Patel");
		System.out.println(Name);
		Name.set(1, "Afsar");
		Name.set(2, "Shenaaz");
		System.out.println(Name);
		Name.remove(3);
		System.out.println(Name.get(3));
		Name.clear();
		System.out.println(Name);
		
	}

}
