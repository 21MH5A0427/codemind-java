import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        int x,y,z,a;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        int b=(int)(Math.pow(x,y));
        a=b%z;
        System.out.println(a);
        sc.close();
    }
}