package ro.usv;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Introduceti valoarea a si apoi valoarea b din ecuatie:");
        double a,b;

        if(s.hasNextDouble())
        {
            a=s.nextDouble();
            if(s.hasNextDouble())
            {
                b=s.nextDouble();
                EcuatieGrad1 e=new EcuatieGrad1(a,b);
                System.out.print("\n\n");
                System.out.println(e.toString());
                System.out.println("x="+e.rezolva());
            }
            else
                System.out.println("Ati introdus valori gresite!");
        }
        else
            System.out.println("Ati introdus valori gresite!");

        s.close();
        //
    }
}
