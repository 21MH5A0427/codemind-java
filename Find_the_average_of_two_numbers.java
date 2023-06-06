import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        int a,b;
        float average;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        average=(a+b)/2.0f;
        System.out.format("%.4f",average);
        sc.close();
    }
}