import java.util.*;
public class sample
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,result;
        n=sc.nextInt();
        result=(n*(n+1))/(2);
        System.out.println(result);
        sc.close();
    }
}