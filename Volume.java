class volu
{
    int l,b,w;
    void assign(int length, int breadth, int width)
    {
        l=length;
        b=breadth;
        w=width;
    }
    int vol()
    {
        return l*b*w;
    }
}

public class Volume {
    public static void main(String[] args)
    {
       volu obj = new volu();
       obj.assign(10,20,20);
       int result = obj.vol();
       System.out.println(result);

    }

}
