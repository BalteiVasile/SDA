package ro.usv;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args)
    {
        long fact =1;
        int n,aux_n;
        //initializarea functiei scanner
        Scanner s = new Scanner(System.in);

        System.out.print("n=");

        if(s.hasNextInt())
        {
            aux_n=s.nextInt();
            for(n=aux_n;n>1;n--)
                fact *=n;

            System.out.printf("%d!=%d\n",aux_n,fact);
        }
        else
            System.out.println("Valoarea introdusa nu este valid !!");
        s.close();
    }
}
