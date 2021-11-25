package ro.usv;

public abstract class Nava {
    private String nume, pavilion;

    public Nava()
    {

    }

    public Nava(String nume, String pavilion)
    {
        this.nume=nume;
        this.pavilion=pavilion;
    }

    @Override
    public String toString()
    {
        return nume+" "+pavilion;
    }

    public void utilizare() //abstract??
    {
    }
}