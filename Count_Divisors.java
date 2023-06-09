import java.util.*;
public class sample
{
    public static void count(int a,int s,int k)
    {
        int c=0;
        for(int i=a;i<s+1;i++)
        {
            if(i%k==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,l;
        n=sc.nextInt();
        k=sc.nextInt();
        l=sc.nextInt();
        count(n,k,l);
        sc.close();
    }
}