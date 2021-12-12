package ro.usv;

public class Flota
{
    Nava[] nave;
    int nr_nave;

    public Flota()
    {
        this.nave=new Nava[10];
        this.nr_nave=0;
    }

    @Override
    public String toString()
    {
        return nave.toString();
    }
}
