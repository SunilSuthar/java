class NthLarge
{
	public static void main(String args[])
	{
		int arr[]={-7,-6,-8,-9};
		int temp=0,i,j,count=0,nth=3;
		for(i=0;i<arr.length;i++)
		{
			temp=arr[i];
			for(j=0;j<arr.length;j++)
			{
				if(temp<arr[j])
					temp=arr[j];
			}
		}
		System.out.println("Large no is. : "+temp);
		for(i=temp;i>0;i--)
		{
			if(count==nth)
				break;
			for(j=0;j<arr.length;j++)
			{
				if(i==arr[j])
				{
					count++;
					temp=arr[j];
					
				}
			}
		}
		System.out.println("Nth Large no is. : "+temp);
		System.out.println("Count. : "+count);
		
	}
}