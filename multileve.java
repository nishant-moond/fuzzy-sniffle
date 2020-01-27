class animal
{
    animal()
    {
        System.out.println("eating");
    }
}
class dog extends animal 
{
    dog()
    {
        System.out.println("barking");
    }
}
class bdog extends dog
{
    bdog()
    {
        System.out.println("weeping");
    }
}
class multileve
{
    public static void main(String arg[])
    {
        bdog bd=new bdog();
    }
}