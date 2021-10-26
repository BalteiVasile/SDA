package ro.usv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        double x,y;
        //˙m˙´m980<>´0<˝´8<˝´<oooklm,
        Scanner s= new Scanner(System.in);
        System.out.println("Introduceti coordonatele punctului p:");
        if(s.hasNextDouble())
        {
            x=s.nextDouble();
            y=s.nextDouble();

            System.out.println("Introduceti coordonatele punctului q:");
            if(s.hasNextDouble())
            {
                Punct p=new Punct(x,y);
                x=s.nextDouble();
                y=s.nextDouble();
                Punct q=new Punct(x,y);

                System.out.println("p"+p.toString());
                System.out.println("q"+q.toString());
                //distanta
                System.out.println("Distanta dintre punctul p si q este: "+p.distanta(q.getX(),q.getY()));
            }
            else
                System.out.println("Nu ati introdus o valoare valida");
        }
        else
        {
            System.out.println("Nu ati introdus o valoare valida");
        }

    }
}