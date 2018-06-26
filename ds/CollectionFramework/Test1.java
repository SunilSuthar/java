import java.util.*;
 
 public class Test1
 {
	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(27);
		list.add(14);
		list.add(34);
		list.add(4);
		list.add(1);
		list.add(0,7);
		ListIterator iterator = list.listlterator();
		while(iterator.hasNest())
		{
			System.out.println(iterator.next());
		}
	}
}
 