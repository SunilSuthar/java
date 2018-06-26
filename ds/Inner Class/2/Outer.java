public class Outer
{
	public class Inner
	{
		public void show()
		{
			System.out.println("Hello Inner");
		}
	}
	public static void main(String args[])
	{
		Outer t = new Outer();
		//Outer.Inner inner = t.new Inner();
		t.display();	
	}
	public void display()
	{
		Inner inner = new Inner();
		inner.show();
	}	
}