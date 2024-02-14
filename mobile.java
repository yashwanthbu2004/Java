class mob
{
    double l,i,n;
    mob()
    {
        l = 0.1;
        i = 1.0;
        n = 500.0;
    }
    mob(double local,double isd,double net)
    {
        l = local;
        i = isd;
        n = net;
    }


    void bill(int nl, int ni)
    {
        System.out.println((l*nl)+(i*ni)+n);
    }
}

public class mobile
{
    public static void main(String[] args)
    {
        mob ob = new mob();
        mob ob1 = new mob(0.1,1.0,500.0);
        ob.bill(10,20);
        ob1.bill(5,20);

    }
}
