
class RThread implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println("Child Thread");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException i)
		{
		
		}
	}
}
public class Runnable_thread
{
	public static void main(String args[])throws InterruptedException
	{
	RThread r=new RThread();
	Thread t=new Thread(r);
	t.start();
	
	for(int i=0;i<=5;i++)
	{
		System.out.println("Main Thread");
		Thread.sleep(1000);
	}

	}
}
