import java.util.*;
public class sample
{
    public static void sum(int arr[],int s)
    {
        int c=0;
        for(int i=0;i<s;i++)
        {
            if (arr[i]%2==0)
            {
                c+=arr[i];
            }
        }
        System.out.println(c);
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
           x[i]=sc.nextInt();
        sum(x,n);
        sc.close();
        
    }
}