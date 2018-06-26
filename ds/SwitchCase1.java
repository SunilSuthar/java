class SwitchCase1
{
	public static void main(String args[])
	{
		byte n=7;
		final int y=7;
		switch(n+1)
		{
			case 9:System.out.println("It  is seven");break;
			case y:System.out.println("This is Y");break;
		}
	}
}