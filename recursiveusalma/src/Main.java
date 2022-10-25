import java.util.Scanner;

public class Main {
    static int power(int a, int b) {
        if(b == 0) {
            return 1;
        }
        return a * power(a, b-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen taban değerini giriniz: ");
        int a = input.nextInt();
        System.out.print("Lütfen üs değerini giriniz: ");
        int b = input.nextInt();
        System.out.println("Sonuç: " + power(a,b));
    }
}