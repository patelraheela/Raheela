
public class Sleep_Thread extends Thread
{
	public void run()
	{
		try
		{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread 1");
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException i)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		Sleep_Thread t=new Sleep_Thread();
		t.start();
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread 2");
			Thread.sleep(1000);
		}
	}

}
