package ro.usv;

import java.util.ArrayList;
import java.util.List;

public class CalculSalarii
{

    public static void main(String args[])
    {
        double t=0;

        Inginer i=new Inginer("Barbulescu","Barbu");
        i.setNrOreLucrate(100);
        Inginer i2=new Inginer("Trestie", "Tudor");
        i2.setNrOreLucrate(200);
        Sofer s=new Sofer("Repede", "Raul");
        s.setNrOreLucrate(250);
        s.setKm_parcursi(1000);

        List<Persoana> persoane= new ArrayList<Persoana>();
        persoane.add(i);
        persoane.add(i2);
        persoane.add(s);

        for(int j=0;j<persoane.size();j++)
        {
            System.out.println(persoane.get(j).toString());

            t+=persoane.get(j).salariu();
        }

        System.out.println("\nTotal salarii="+(t)+" lei");
    }
}
