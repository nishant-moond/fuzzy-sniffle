class calculation
{
    int x,y;
    calculation(int a,int b)
    {
        x=a;
        y=b;
    }
    void addition()
    {
        System.out.println(x+y);
    }
    void substraction()
    {
        System.out.println(x-y);
    }
}
class mycalculation extends calculation
{
    int r,s;
    mycalculation(int a,int b,int c,int d)
    {
        super(a,b);
        r=c;
        s=d;
    }
    void multiplication()
    {
        System.out.println(r*s*x*y);
    }
};
class inheritprac
{
    public static void main(String arg[])
    {
        mycalculation mc=new mycalculation(2,3,4,5);
        mc.addition();
        mc.substraction();
        mc.multiplication();
    }
}