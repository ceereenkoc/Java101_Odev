import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double toplam, armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.0;
        int a, e, d, m, p;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo?  : ");
        a = input.nextInt();
        System.out.print("Elma kaç kilo? : ");
        e = input.nextInt();
        System.out.print("Domates kaç kilo?  : ");
        d = input.nextInt();
        System.out.print("Muz kaç kilo? : ");
        m = input.nextInt();
        System.out.print("Patlıcan kaç kilo?  : ");
        p = input.nextInt();

        toplam = (armut*a) + (elma*e) + (domates*d) + (muz*m) + (patlıcan*p);
        System.out.print("Toplam tutar: " + toplam + " TL");


    }
}