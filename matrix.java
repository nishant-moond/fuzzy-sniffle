import java.util.Scanner;
class matrix{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int table[][]=new int[n][n];
        int i,j;
        for(j=0;j<n;j++)
        {
        for(i=0;i<n;i++)
        {
            table[j][i]=0;
        }
        }
        for(j=0;j<n;j++)
        {
        for(i=0;i<n;i++)
        {
            if(i==j)
            {
                table[j][i]=1;
            }
        }
        }
        System.out.println("identity matrix of order "+n+" is:-");
        for(j=0;j<n;j++)
        {
        for(i=0;i<n;i++)
        {
            System.out.print(" "+table[j][i]);
        }
        System.out.println("");
        }
    }
}