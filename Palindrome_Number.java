import java.util.*;
public class sample
{
    public static void palindrome(int n)
    {
        int temp,r=0,d=0;
        temp=n;
        while(n>0)
        {
          r=n%10;
          d=(d*10)+r;
          n=n/10;
        }
    if(temp==d)
       System.out.println("True");
    else
       System.out.println("False");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
           int a;
           a=sc.nextInt();
           palindrome(a);
        }
        sc.close();
    }
}