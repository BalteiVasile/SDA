package ro.usv;

public class CalculSalarii
{

    public static void main(String args[])
    {
        Inginer i=new Inginer("Barbulescu","Barbu");
        i.setNrOreLucrate(100);
        Inginer i2=new Inginer("Trestie", "Tudor");
        i2.setNrOreLucrate(200);
        Sofer s=new Sofer("Repede", "Raul");
        s.setNrOreLucrate(250);
        s.setKm_parcursi(1000);

        System.out.println(i.toString());
        System.out.println(i2.toString());
        System.out.println(s.toString());

        System.out.println("\nTotal salarii="+(i.salariu()+i2.salariu()+s.salariu()));
    }
}
