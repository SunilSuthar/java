import java.io.*;
public class CopyFile {
    public static void main(String[] args) throws IOException
    {
        FileReader a = new FileReader("a.txt");
        FileReader b = new FileReader("b.txt");
        FileWriter c = new FileWriter("c.txt");
        char[] adata = new char[100];
        char[] bdata = new char[100];
        a.read(adata);
        b.read(bdata);
          
        try{
            c.write(adata); 
	    c.write(bdata);   
        }
        catch(Exception i){System.out.println("Something Is Wrong.");}
        finally{
            c.flush();
            c.close();
        }
    }
}
