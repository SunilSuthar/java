public class Main implements Runnable
{
	
	public static void main(String args[]) throws InterruptedException
	{
		MyThread t1 = new MyThread();
		Thread	t = new Thread(t1);
		System.out.println("Main thread start---");
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main i-: "+i);
			Thread.sleep(1000);
		}
		System.out.println("Main Thread End.");
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread i-: "+i);
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}	
}

