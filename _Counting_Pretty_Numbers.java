import java.util.*;
public class sample
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for(int j=0;j<t;j++)
        {
            int n,m,c=0;
            n=sc.nextInt();
            m=sc.nextInt();
            for(int i=n;i<m+1;i++)
            {
                if(i%10==2 || i%10==3 || i%10==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
        sc.close();
    }
}