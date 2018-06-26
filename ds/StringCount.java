class StringCount
{
	public static void main(String args[])
	{
		String str = "Hello";
		StringBuffer str2 = new StringBuffer();
		int i,j,k,count=0;
		//boolean flag=true;
		char ch,ch1;
		for(i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			if(str2.contain(str.charAt(i)))
			{
				continue;
			}
			else
			{
				for(j=0;j<str.length();j++)
				{
					ch1 = str.charAt(j);
					if(ch==ch1)
					{
						count++;
					}
				}
				System.out.println(ch1+" : "+count);
				count=0;
				str2.append(ch);
			}
		}
	}
}