class WordLength
{
	public static void main(String args[])
	{
		String str=" Hello  p p p p  Good    Morning  sdf sdf sdf sdf";
		char space=32;
		int count=0,i,j;
		int length=str.length();
		for(i=0;i<length;i++)
		{	
			if(str.charAt(i)==space)
			{
				continue;
			}
			else
			{
				for(j=i+1;j<length;j++)
				{
					if(str.charAt(j)==space)
					{
						count=count+1;
						break;
					}
				}
				i=j;
			}	
		}
		if(str.charAt(length-1)!=space)
			count++;
		System.out.println("Number of words are :"+count);
	}
}