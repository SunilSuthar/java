class CharCount
{
	public static void main(String args[])
	{
		int i,j,count=0,flag=0;
		String str=" hello good morning sdf sfd  sdff  sdf";
		for(i=0;i<str.length();i++)
		{
			for(j=i;j<str.length();j++)
			{
				if(str.charAt(j)!=' ')
				{
					flag=1;
				}
				else
				{
					break;
				}
			}
			if(flag==1)
			{
				count++;
				flag=0;
				i=j;
			}
		}
		System.out.println("No of count are : "+count);
	}
}