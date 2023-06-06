import java.util.*;
public class Area
{
    public static void main(String args[])
    {
        int r;
        float area;
        final float pi=3.14f;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=pi*r*r;
        System.out.format("%.2f",area);
        sc.close();
    }
}