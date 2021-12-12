package ro.usv;

public abstract class Nava
{
    private String nume, pavilion;

    public Nava()
    {

    }

    public Nava(String nume, String pavilion)
    {
        this.nume=nume;
        this.pavilion=pavilion;
    }

    public String getNume()
    {
        return this.nume;
    }

    public String getPavilion()
    {
        return this.pavilion;
    }

    @Override
    public String toString()
    {
        return nume+" "+pavilion;
    }

    public abstract void utilizare();
}