import java.util.Scanner;

public class Person {

		int age;
		String name;
		void input()
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Age of a person: ");
		age=s.nextInt();
		System.out.println("Enter name of a person: ");
		name=s.nextLine();
		}
		void walk()
		{
			System.out.println("I like to walk");
		}
		void Eat()
		{
			System.out.println("I like to Eat");
		}
		public static void main(String[] args) {
			Person p=new Person();
			p.input();
			System.out.println("Age: "+p.age);
			System.out.println("Name: "+p.name);
			p.walk();
			p.Eat();
	}

}
