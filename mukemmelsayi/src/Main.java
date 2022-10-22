import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = input.nextInt();

        int total = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                total += i;
            }
        }

        if(number == total){
            System.out.println(number + " mükemmel sayıdır.");
        }else {
            System.out.println(number + " mükemmel sayı değildir.");
        }

    }
}