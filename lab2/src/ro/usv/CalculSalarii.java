package ro.usv;
public class CalculSalarii {
    public static void main(String arg[]){
        Inginer ing1=new Inginer("Barbulescu", "Barbu",101);
        Inginer ing2=new Inginer("Trestie", "Tudor", 23);
        Sofer sofr= new Sofer("Repede","Raul", 302);
        Angajat[] salariati = new Angajat[]{ing1,ing2,sofr};
        int[] ore = new int[]{100,200,250};
        for(int i=0; i<salariati.length; i++)
            salariati[i].setNrOreLucrate( ore[i] );
        sofr.setKm_parcursi(1000); // demo ca in salariati[2] este ref.
        // la acest obiect si nu un obiect
        double salariuTotal=0, sal;
        for(Angajat p: salariati){
            salariuTotal += (sal = p.salariu());
            System.out.println(p + " - salariu=" + sal);
        }
        System.out.println("Total salarii=" + salariuTotal);
    }
}
