import java.util.Scanner;
class array{
    public static void main(String arg[])
    {
        int num[]={55,40,2,8,63,33};
        int n=num.length;
        int i,j;
        System.out.println("given list:-");
        for(i=0;i<n;i++)
        {
            System.out.print(" "+num[i]);
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(num[i]>num[j])
                {
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("\nSORTED LIST:-");
        for(i=0;i<n;i++)
        {
            System.out.print(" "+num[i]);
        }
    }
}