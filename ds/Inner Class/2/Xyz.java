public class Xyz
{
	public static void main(String args[])
	{
		Outer.Inner t = new Outer().new Inner();
		t.show();
	}
}