class room
{
    int len=5;
    int wid=10;
    int area()
    {
        return (len*wid);
    }
}
class bedroom extends room
{
    int height=15;
    int volume()
    {
        return (len*wid*height);
    }
};
class single_inheritance
{
    public static void main(String arg[])
    {
        bedroom bd=new bedroom();
        int a=bd.area();
        int b=bd.volume();
        System.out.println(a);
        System.out.println(b);
    }
}