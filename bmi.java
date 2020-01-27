import java.util.Scanner;
class bmi{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double height=sc.nextFloat();
        double weight=sc.nextFloat();
        double hm,wkg;
        hm=height*0.0254;
        wkg=weight*0.45;
        double sqhm=Math.pow(hm,2);
        double b=wkg/sqhm;
        System.out.println("bmi is"+b);
    }
}