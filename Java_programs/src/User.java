
interface Vehicle
{
	String Name="Honda";
	int Speed=100;
	void start();
	void stop();
	default void color()
	{
		System.out.println("Bike color is red...");
	}
	static void speed()
	{
		System.out.println("100km/hr...");
	}
}
class User implements Vehicle
{
	public void start()
	{
		System.out.println("Start!");
	}
	public void stop()
	{
		System.out.println("Stop!");
	}
	public static void main(String[] args) 
	{
		User u=new User();
		System.out.println(Name);
		u.color();
		u.start();
		u.stop();
		Vehicle.speed();
		System.out.println(Speed);
	}

}
