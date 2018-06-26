import java.util.*;
class Producer extends Thread
{
	Stack<Integer> stack;
	public Producer (Stack<Integer> stack)
	{
		this.stack=stack;
	}
	public void run()
	{
		synchronized(stack)
		{
			for(int i=0;i<10;i++)
			{
				stack.push(i*100);
			}
		stack.notifyAll();
		}
	}

}
class Consumer extends Thread
{
	Stack<Integer> stack;
	public Consumer(Stack<Integer> stack)
	{
		this.stack = stack;
	}
	public void run()
	{
		synchronized(stack)
		{
			System.out.println("Consumer wait for notification");
			try{
				stack.wait();
			}catch(Exception e){}
			System.out.println("Consumer notified by producer");
			System.out.println("Consumer consume stack values");
			while(stack.peek()!=null)
			{
				System.out.println(stack.pop());
			}
		}		
	}	
}
public class Test1
{
	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack<>();
		Consumer con = new Consumer(stack);
		Producer pro = new Producer(stack);
		con.start();
		pro.start();				
	}
}
	