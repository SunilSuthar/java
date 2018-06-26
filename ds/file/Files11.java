package files1;
import java.io.*;
public class Files11 {
    public static void main(String[] args) throws IOException {
        File f=new File("abc.txt");
        FileWriter fw =new FileWriter(f);
        FileReader fr =new FileReader(f);
        char []ch=new char[100];
        //System.out.print(f.createNewFile());
        if(f.exists())
        {
            fw.write("hello everyone good mornings");
            
        }
        System.out.println(fr.read());
        
        
        
        
    }
    
}
