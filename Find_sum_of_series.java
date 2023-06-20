import java.util.*;
public class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        float d=1;
        float c=0;
        n=sc.nextInt();
        for(float i=1;i<n+1;i++)
        {
           c+=d/i;
        }
        System.out.printf("%.2f",c);
        sc.close();
    }
}