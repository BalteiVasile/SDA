package ro.usv;

public class EcuatieGrad1 {
    private double a,b,x;

    public EcuatieGrad1(double a, double b)
    {
        this.a=a;
        this.b=b;
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    @Override
    public String toString()
    {
        String text;
        if(b>=0)
            text=a+"x+"+b+"=0";
        else
            text=a+"x"+b+"=0";
        return text;
    }

    public double rezolva()
    {
        x=(-b)/a;
        return x;
    }
}
