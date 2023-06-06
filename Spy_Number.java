import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        int x,c=0,s=1,r=0,a;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        while(x>0)
        {
           r=x%10;
           s=s*r;
           c=c+r;
           x=x/10;
        }
        if(s==c)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
        sc.close();
    }
}