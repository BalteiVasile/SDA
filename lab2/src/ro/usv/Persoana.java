package ro.usv;

public abstract class Persoana
{
    private String nume,prenume;

    public Persoana(String nume,String prenume)
    {
        this.nume=nume;
        this.prenume=prenume;
    }

    public String getNume()
    {
        return this.nume;
    }

    public String getPrenume()
    {
        return this.prenume;
    }

    public abstract double salariu();

    @Override
    public String toString()
    {
        return this.nume+' '+this.prenume;
    }
}
