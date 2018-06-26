class StringReverse1
{
	public static void main(String args[])
	{
		
		String str1 = "My Name is Bhuvi";
		String[] str2 = str1.split(" ");
		StringBuffer str3 = new StringBuffer();
		System.out.println("My String Is :"+str1);
		System.out.println("length is :" + str2.length);
		for(int i=str2.length-1;i>=0;i--)
		{	
			str3.append(str2[i]);
			str3.append(" ");
		}
		//str3.reverse();
		System.out.println("Reverse is : "+str3);
	}
}