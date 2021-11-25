package ro.usv;
import java.lang.Math;

public class Punct {
    private double x,y;

    public Punct()
    {
        x=y=0;
    }

    public Punct(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setXY(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString()
    {
        return "("+x+","+y+")";
    }

    public double distanta(double x, double y)
    {
        double distanta=Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));

        return distanta;
    }
}