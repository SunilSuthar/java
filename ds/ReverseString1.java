import java.util.Scanner;
class ReverseString1
{
  public static void main(String[] args)
  {
    int num;
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String[] str2 = str.split(" ");
    StringBuffer str3 = new StringBuffer();
    for(int i=str2.length-1;i>=0;i--)
    {
      str3.append(str2[i]);
      str3.append(" ");
    }
    System.out.println(str3);
  }
}