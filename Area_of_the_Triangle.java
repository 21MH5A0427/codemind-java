import java.util.*;
public class area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float s=(a+b+c)/(float)2;
        float d=s*((s-a))*(s-b)*(s-c);
        float e=(float)(Math.sqrt(d));
        System.out.format("%.2f",e);
    }
}