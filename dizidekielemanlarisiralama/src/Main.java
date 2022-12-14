import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu (n): ");
        int n = input.nextInt();

        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for(int i = 0; i < n; i++) {
            System.out.print((i+1) +". eleman: ");
            int x = input.nextInt();
            list[i] = x;
        }

        Arrays.sort(list);
        for(int j: list) {
            System.out.print(j + " ");
        }
    }
}