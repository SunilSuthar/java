import java.io.File;
class FileHandling {
    public static void main(String[] args) {
        File files = new File("f://");
        printFile(files);
    }
    public static void printFile(File files)
    {
        long lnt;
        File f[] = files.listFiles();
        System.out.println("\n\n---"+files+"---");
        lnt = f.length;
        for(int i=1;i<lnt-1;i++)
        {
            if(f[i].isFile()==true)
            {
                System.out.println("\t\t"+f[i].getName());
            }
            else
            {
                printFile(f[i]);
            }
        }

    }
}
