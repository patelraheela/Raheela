
abstract class Animal
{
	public void legs()
	{
		System.out.println("Has Four legs...");
	}
	abstract void eat();
	abstract void Sound();
}
class Dog extends Animal
{
	
	void eat()
	{
		System.out.println("Dog eats meat...");
	}
	void Sound()
	{
		System.out.println("Sounds like Woof woooof.......");
	}
}
class Cow extends Animal
{

	void eat()
	{
		System.out.println("Cow eats grass...");
	}
	void Sound()
	{
		System.out.println("Sounds like oooooooo.......");
	}
}
public class Main_Class {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.legs();
		d.eat();
		d.Sound();
		
		Cow c=new Cow();
		c.legs();
		c.eat();
		d.Sound();

	}

}
