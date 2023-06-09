import java.util.*;
public class sample
{
    public static int strong(int a)
    {
        int r=0,c=0;
        int b=(int)(Math.pow(a,2));
        while(b>0)
        {
            r=b%10;
            c=c+r;
            b=b/10;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a=strong(n);
        if(a==n)
          System.out.println("Neon Number");
        else
          System.out.println("Not Neon Number");
        sc.close();
    }
}