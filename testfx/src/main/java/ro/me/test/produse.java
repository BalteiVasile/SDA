package ro.me.test;

public class produse
{
    String tip_produs,nume;
    double pret;

    public produse(String tip_produs,String nume,double pret)
    {
        this.tip_produs=tip_produs;
        this.nume=nume;
        this.pret=pret;
    }

    @Override
    public String toString()
    {
        return tip_produs+' '+nume+'-'+pret;
    }
}
