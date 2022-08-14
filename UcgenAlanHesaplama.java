package deneme;

import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {

        double a,b,c,u; // a,b,c= Ucgenin kenarlari //
        Scanner input= new Scanner(System.in);

        System.out.print("a kenarini giriniz:");
        a=input.nextDouble();
        System.out.print("b kenarini giriniz:");
        b=input.nextDouble();
        System.out.print("c kenarini giriniz:");
        c=input.nextDouble();

        //Eger dik ucgen ise, dik kenarlar:a,b
        double hipotenuz= (a*a)+(b*b);
        System.out.println("Ucgenin Hipotenuzu: " + Math.sqrt(hipotenuz));

        u=(a+b+c)/2;

        double cevre= 2*u;
        double alan_karesi= u*(u-a)*(u-b)*(u-c);

        System.out.println("Ucgenin Cevresi: " + cevre);
        System.out.println("Ucgenin Alani: " + Math.sqrt(alan_karesi));

    }
}
