package ro.usv;

public abstract class Angajat extends Persoana
{
    public static final double salariuOrarMinim=15;

    public Angajat(String nume, String prenume)
    {
        super(nume, prenume);
    }

    public abstract double salariu();

    public abstract void setNrOreLucrate(int nrOreLucrate);
}
