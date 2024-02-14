class Circ{
    double r;
    void insert(double radius)
    {
        r = radius;
    }

    void display()
    {
        System.out.println("Perimeter:" +2 * Math.PI * r);
    }

}

public class Circle
{
    public static void main(String[] args){
        Circ ob = new Circ();
        ob.insert(3);
        ob.display();
    }
}
