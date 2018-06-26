import java.util.*;
public class demo
{
	public static void main(String args[])
	{
		int array1[]={1,2,3};
		int array2[]={1,2,3};
		
		int s1[][]={array1};
		int s2[][]={array2};

		System.out.println("Object name of array1 :- "+array1);
		if(Arrays.deepEquals(s1,s2))
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}
}