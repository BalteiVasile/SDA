package ro.usv;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class to read text files

public class Poligon {
    private int n;
    private double x,y,p;
    public Poligon()
    {
        try
        {
            File f = new File("data_in.txt");
            Scanner s = new Scanner(f);
            if (s.hasNextInt())
            {
                String aux=s.nextLine();
                this.n=Integer.parseInt(aux);
            }
            Punct[] p= new Punct[this.n];

            System.out.println("Varfurile poligonului sunt:");
            for (int i=0;i<n;i++)
            {

                String[] d=s.nextLine().split(" ");

                x=Double.parseDouble(d[0]);
                y=Double.parseDouble(d[1]);

                p[i]=new Punct();
                p[i].setXY(this.x,this.y);

                //partea de afisare
                String afisare=p[i].toString();
                System.out.println(afisare);

                //region afisare lungime vector si continutul lor
                //System.out.println(d.length);
                //System.out.println(Arrays.toString(d));

                //System.out.println(d[0]);
                //endregion
            }
            s.close();

            System.out.print("\nPerimetrul poligonului este de :");
            this.p=0;
            for (int i=0;i<n-1;i++)
            {
                this.p+=p[i].distanta(p[i+1].getX(),p[i+1].getY());
            }
            System.out.println(this.p+" m.");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("eroare la gasirea/citirea fisierului !");
            e.printStackTrace();
        }
    }
}
