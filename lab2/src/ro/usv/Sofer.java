package ro.usv;

public class Sofer extends Persoana implements IAngajat
{
    private int nrOreLucrate=0;
    private double coeficientSalarial_categorie=1.0,km_parcursi=5000;

    public Sofer(String nume,String prenume)
    {
        super(nume,prenume);
    }

    public void setNrOreLucrate(int nrOreLucrate)
    {
        if(nrOreLucrate>300)
            System.out.println("Nu poate avea mai mult de 300 de ore!!");
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