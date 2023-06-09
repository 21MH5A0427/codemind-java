import java.util.*;
public class sample
{
    public static int strong(int a)
    {
        int r=0,c=0,s=1;
        while(a>0)
        {
            r=a%10;
            for(int i=r;i>=1;i--)
            {
                s=s*i;
            }
            c=c+s;
            a=a/10;
            s=1;
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
          System.out.println("The number "+ n +" is a strong number");
        else
          System.out.println("The number "+n+" is not a strong number");
        sc.close();
    }
}