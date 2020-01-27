class xyz
{
    int add(int a,int b)
    {
        return(a+b);
    }
    float add(float a,float b)
    {
        return(a+b);
    }
    double add(double a,double b)
    {
        return(a+b);
    }
}

class methodoverloading{
    public static void main()
    {
        xyz x1=new xyz();
        System.out.println("int"+x1.add(4,2));
        System.out.println("float:"+x1.add(4.0f,2.0f));
        System.out.println("double:"+x1.add(42.3,23,99));
        System.out.println("int and float:"+x1.add(4,4.3f));
    }
}