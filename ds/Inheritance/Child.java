class Parent
{
	public int x = 10;
	public static int y = 15;
	public void Set()
	{
		System.out.println("Set Method call Parent");
	}
	public static void Get()
	{
		System.out.println("Get Method of parent");
	}
	public static void main(String args[])
	{
		System.out.println("Main method of parent.");
	}
}
public class Child extends Parent
{
	public int x = 40;
	public static int y = 60;
	public static void Get()
	{
		System.out.println("Get Child Call");
	}
	public void Set()
	{
		System.out.println("Set Child Call");
	}
	public void Show()
	{
		System.out.println("Show child call");
	}
	public static void main(String args[])
	{
		//Child ch = new Child();
		Parent ch = new Child();
		System.out.println(ch.x);
		System.out.println(ch.y);
		ch.Set();
		ch.Get();
		//ch.main(null);
		//ch.Show();
		
	}
}