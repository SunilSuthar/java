public class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread :- i "+i);
		}
	}
	public static void main(String args[]) throws Exception
	{
		MyThread t = new MyThread();
		System.out.println("Main thread start---");
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main i-: "+i);
			Thread.sleep(1000);
		}
		System.out.println("Main Thread End.");
	}
}
