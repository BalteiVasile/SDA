package ro.usv;

public class Inginer extends Angajat
{
    private int nrOreLucrate=0;
    private double coeficientSalarial_categorie=1.5;

    public Inginer(String nume,String prenume)
    {
        super(nume,prenume);
    }

    public void setNrOreLucrate(int nrOreLucrate)
    {
        if(nrOreLucrate>250)
            System.out.println("Nu poate avea mai mult de 250 de ore!!");
        else
            this.nrOreLucrate=nrOreLucrate;
    }

    public double salariu()
    {
        if(nrOreLucrate!=0)
            return (salariuOrarMinim*coeficientSalarial_categorie)*nrOreLucrate;
        else
        {
            System.out.println("Numarul de ore nu este setat!!");
            return 0;
        }
    }

    @Override
    public String toString()
    {
        return "Inginer "+super.toString()+" a lucrat "+nrOreLucrate+" ore - salariu="+salariu();
    }
}