import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        int f;
        float c;
        Scanner sc=new Scanner(System.in);
        f=sc.nextInt();
        c=((f-32)*5)/9.0f;
        System.out.format("%.2f",c);
        sc.close();
    }
}