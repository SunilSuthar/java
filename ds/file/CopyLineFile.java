import java.io.*;
class CopyLineFile
{
    public static void main(String[] args) throws IOException
    {
        int alength=0,blength=0;
	int count=0;
	File a = new File("a.txt");
        File b = new File("b.txt");
        FileReader aa = new FileReader(a);
        FileReader bb = new FileReader(b);
        FileWriter cc = new FileWriter("c.txt");
        BufferedReader aaa = new BufferedReader(aa);
        BufferedReader bbb = new BufferedReader(bb);
        BufferedWriter ccc = new BufferedWriter(cc);
        
	while(aaa.readLine()!=null)
           {
               alength++;
           }
	while(bbb.readLine()!=null)
           {
               blength++;
           }
        if(alength>blength)
	{	count=blength;
	}
	else
	{	count = alength;
	}	
        
	ccc.append(aaa.readLine());
	ccc.newLine();
	ccc.append(bbb.readLine());
	ccc.flush();	
	ccc.close();
}
}