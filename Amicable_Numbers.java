import java.util.*;
public class sample
{
    public static void cable(int a,int b)
    {
        int c=0,s=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                c=c+i;
            }
        }
        for(int j=1;j<b;j++)
        {
            if(b%j==0)
            {
                s=s+j;
            }
        }
        if(c==b && s==a)
           System.out.println("Amicable");
        else
           System.out.println("Not Amicable");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        cable(m,n);
        sc.close();
    }
}