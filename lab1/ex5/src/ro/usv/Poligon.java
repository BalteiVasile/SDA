package ro.usv;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class to read text files

public class Poligon {
    private int n;
    Punct[] p;
    public Poligon()
    {
        double x,y;
        try
        {
            File f = new File("data_in.txt");
            Scanner s = new Scanner(f);
            if (s.hasNextInt())
            {
                String aux=s.nextLine();
                this.n=Integer.parseInt(aux);
            }
            p=new Punct[this.n];

            for (int i=0;i<n;i++)
            {
                String[] d=s.nextLine().split(" ");

                x=Double.parseDouble(d[0]);
                y=Double.parseDouble(d[1]);

                p[i]=new Punct();
                p[i].setXY(x,y);
            }
            s.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("eroare la gasirea/citirea fisierului !");
            e.printStackTrace();
        }
    }

    public void afisare_v()
    {
        System.out.println("Varfurile poligonului sunt:");
        for(int i=0;i<n;i++)
        {
            System.out.println(p[i].toString());
        }
    }

    public void Perimetru()
    {
        double P=0;

        System.out.print("\nPerimetrul poligonului este de :");

        for (int i=0;i<n-1;i++)
        {
            P+=p[i].distanta(p[i+1].getX(),p[i+1].getY());
        }
        P+=p[0].distanta(p[n-1].getX(),p[n-1].getY());
        System.out.println(P+" m.");
    }
}
