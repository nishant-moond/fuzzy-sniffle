class employee{
    String name;
    int age;
    String designation;
    double salary;
    employee(String name)
    {
        this.name=name;
    }
    void empage(int age)
    {
        this.age=age;
    }
    void empDesignation(String str)
    {
        designation=str;
    }
    void empsalary(double salary)
    {
        this.salary=salary;
    }
    void print()
    {
        System.out.println("name"+name);
        System.out.println("age"+age);
        System.out.println("designation"+designation);
        System.out.println("salary"+salary);
    }
}

class mq{
    public static void main(String[] arg)
    {
        employee e1=new employee("james");
        employee e2=new employee("smith");
        e1.empage(26);
        e1.empDesignation("JE");
        e1.empsalary(80000);
        e1.print();
        e2.empage(22);
        e2.empDesignation("Manager");
        e2.empsalary(150000);
        e2.print();
    }
}