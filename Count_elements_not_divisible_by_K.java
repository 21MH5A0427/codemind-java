import java.util.*;
public class sample
{
    public static void div(int arr[],int n,int k)
    {
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k!=0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],k;
        n=sc.nextInt();
        k=sc.nextInt();
        x=new int[n];
        for(int i=0;i<n;i++)
            x[i]=sc.nextInt();
        div(x,n,k);
        sc.close();
    }
}