import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Girilecek sayı adedini giriniz: ");
        int num = input.nextInt();

        int min = 1, max = 1;
        for(int i = 1; i <= num; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            int number = input.nextInt();

            if (i == 1){
                max = number;
                min = number;
            }

            if (number > max){
                max = number;
            }

            if (number < min){
                min = number;
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}