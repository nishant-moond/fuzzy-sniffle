import java.util.Scanner;
class sclass{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        char gender=sc.next().charAt(0);
        int age=sc.nextInt();
        long no=sc.nextLong();
        double cgpa=sc.nextDouble();
        float fees=sc.nextFloat();
        System.out.println("name="+name);
        System.out.println("gender="+gender);
        System.out.println("age="+age);
        System.out.println("no="+no);
        System.out.println("cgpa="+cgpa);
        System.out.println("fees="+fees);
    }

}