class xyz
{
    int roll_no;String name;

    void insert( int r, String n)
    {
        roll_no = r;
        name = n;
    }
    void display()
    {
        System.out.println(roll_no+" "+name);
    }

}
public class Student {
    public static void main(String[] args)
    {
        xyz ob = new xyz();
        xyz ob1 = new xyz();
        xyz ob3 = new xyz();
        ob.name = "ybu";
        ob1.name = "king";
        ob.roll_no = 80;
        ob1.roll_no = 55;
        ob.display();
        ob1.display();
        ob3.insert(44, "sss");
        ob3.display();
    }

}
