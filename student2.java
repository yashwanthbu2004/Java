class xy
{
    int roll_no;String name;String conduct;
    xy()
    {
        System.out.println("default");
    }
    xy(int r,String n)
    {
        roll_no=r;
        name=n;
    }

    xy(int r,String n,String d)
    {
        roll_no=r;
        name=n;
        conduct=d;
    }
    void display()
    {
        System.out.println(roll_no + " " + name);
    }

    void display2()
    {
        System.out.println(roll_no + " " + name + " " + conduct);

    }
}


public class student2 {
    public static void main(String[] args)
    {
        xy ob = new xy();
        xy ob1=new xy(193,"ybu");
        xy ob2 = new xy(169,"KING","THE LION");
        ob.display();
        ob1.display();
        ob2.display2();
    }
}
