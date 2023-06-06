import java.util.*;
public class sample
{
    public static void main(String args[])
    {
        int c;
        float f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=32+(c*(9.0f/5));
        System.out.format("%.2f",f);
        sc.close();
    }
}