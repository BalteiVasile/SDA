package ro.usv;

public class NavaCroaziera extends Nava{
    private String nume, pavilion;
    private int nrPasageri;

    public NavaCroaziera(String nume, String pavilion, int nrPasageri)
    {
        this.nume=nume;
        this.pavilion=pavilion;
        this.nrPasageri=nrPasageri;
    }

    @Override
    public void utilizare()
    {
        System.out.println("Croaziere de lux");
    }

    @Override
    public String toString()
    {
        return "NavaCroaziera-"+this.nume+"=Suceava, pavilion="+this.pavilion+", nrPasageri="+this.nrPasageri;
    }
}
