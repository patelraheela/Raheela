
public class Thread_Program extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread 1");
		}
	}
	public static void main(String[] args)
	{
		Thread_Program t=new Thread_Program();
		t.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread 2");
		}
	}

}
