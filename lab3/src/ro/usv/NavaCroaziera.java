package ro.usv;

public class NavaCroaziera extends Nava
{
    private int nrPasageri;

    public NavaCroaziera(String nume, String pavilion, int nrPasageri)
    {
        super(nume,pavilion);
        this.nrPasageri=nrPasageri;
    }

    public void utilizare()
    {
        System.out.println("Croaziere de lux");
    }

    @Override
    public String toString()
    {
        return "NavaCroaziera-"+super.getNume()+"=Suceava, pavilion="+super.getPavilion()+", nrPasageri="+this.nrPasageri;
    }
}
