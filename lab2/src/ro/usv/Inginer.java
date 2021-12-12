package ro.usv;

public class Inginer extends Persoana implements IAngajat
{
    double nrOreLucrate=0,salariu=0;

    public Inginer(String nume,String prenume)
    {
        super(nume,prenume);
    }

    public void setNrOreLucrate(int nrOreLucrate)
    {
        this.nrOreLucrate=nrOreLucrate;
        this.salariu=salariuOrarMinim*nrOreLucrate;
    }
    public double salariu()
    {
        return salariu;
    }

    @Override
    public String toString()
    {
        return "Inginer "+super.toString()+" a lucrat "+nrOreLucrate+" ore - salariu= "+salariu;
    }
}
