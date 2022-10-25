import java.util.Scanner;

public class Main {
    static boolean isPrime(int a, int b) {
        if(a == b) {
            return true;
        }
        if(a % b == 0) {
            return false;
        }

        return isPrime(a, b+1);
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        number = input.nextInt();
        int x;
        System.out.print(isPrime(number,2) ? number + " sayısı ASALDIR !" : number + " sayısı ASAL değildir !" );
    }
}