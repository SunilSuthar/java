import java.util.*;
 
 public class Test
 {
	public static void main(String args[])
	{
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		ArrayList list = new ArrayList();
		list.add(list1);
		list.add(10);
		list.add(27);
		list.add(14);
		list.set(3,22);
		list.add(34);
		list.add(4);
		list.add(1);
		list.add(0,7);
		System.out.println("List Data:-"+list);
		list.set(3,75);
		System.out.println("List Data again"+list.size() + list1.size());
	}
}
 