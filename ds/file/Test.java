import java.io.*;

public class Test
{	
	public static void main(String args[]) throws Exception
	{
		File f=new File("D:/java");	
		if(f.exists() && f.isDirectory())
		{
			File [] f1=f.listFiles();	
			fileHierachy(f1);
		}
		else
		{
			System.out.println("Something wromg");
		}
	}
	static void fileHierachy(File [] arr )
	{	
		for(File f:arr)	
		{
			if(f.isFile())
			{	
			System.out.println("Files    "+f.getName());
			}
			else if(f.isDirectory())
			{
				System.out.println("Directory    "+f.getName());
				fileHierachy(f.listFiles());
			}		
		}
	}
}