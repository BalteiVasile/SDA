package ro.usv;

public class Sofer extends Angajat
{
    private int nrOreLucrate=0,km_parcursi=0;
    private double coeficientSalarial_categorie=1.0;

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

    public void setKm_parcursi(int km_parcursi)
    {
        if (km_parcursi>5000)
            System.out.println("Numarul de km maxim este depasit!");
        else
            this.km_parcursi=km_parcursi;
    }

    public double salariu()
    {
        if(nrOreLucrate!=0 && km_parcursi!=0)
            return (salariuOrarMinim*coeficientSalarial_categorie)*nrOreLucrate+km_parcursi*0.1;
        else
        {
            System.out.println("Numarul de ore sau km_parcursi nu este setat!");
            return 0;
        }
    }

    @Override
    public String toString()
    {
        return "Sofer "+super.toString()+" a lucrat "+nrOreLucrate+" ore, a parcurs "+km_parcursi+" km - salariu="+salariu();
    }
}