import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yıl giriniz: ");
        yil = input.nextInt();

        if ((yil % 4 == 0) || (yil % 400 == 0)) {
            System.out.print(yil + " bir artık yıldır!");
        } else {
            System.out.print(yil + " bir artık yıl değildir!");
        }
    }
}