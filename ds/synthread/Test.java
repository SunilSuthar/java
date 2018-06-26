class Display
{
	public void wish(String name) throws Exception
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(name);
			Thread.sleep(100);
		}
		synchronized(Display.class)//synchronized class level block
		{	
			for(int i=0;i<10;i++)
			{
				System.out.println("Good Morning "+name);
				Thread.sleep(100);
			}
		}
		

	}
}
class MyThread extends Thread
{
	Display display;
	String name;
	public MyThread(Display display, String name)
	{
		this.display=display;
		this.name=name;
	}
	public void run()
	{
		try{
			display.wish(name);
		}catch(Exception e){}
	}
}
public class Test
{
	public static void main(String args[])
	{
		Display d=new Display();
		MyThread t1=new MyThread(d,"bhuvanesh");
		MyThread t2=new MyThread(d,"Bhuvi");
		t1.start();
		t2.start();	
	}
}
	