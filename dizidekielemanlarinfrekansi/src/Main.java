import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int count;
        System.out.println("Dizi: " + Arrays.toString(list)); // Diziyi yazdırdım.

        Arrays.sort(list); // Diziyi sıraladım.

        for(int i = 0; i < list.length; i++) {
            count = 0;
            for(int j = 0; j < list.length; j++) {
                if(list[i] == list[j]) { // Eğer eşitse count değerini arttırdım.
                    count++;
                }
            }
            if(i == 0 && list[i] == list[i+1]) {
                System.out.println(list[i] + " sayısı " + count + " kez tekrar etmiştir.");
            }
            if(i == 0 && list[i] != list[i+1]) {
                System.out.println(list[i] + " sayısı " + count + " kez tekrar etmiştir.");
            }
            if(i != 0 && list[i]!=list[i-1]) {
                System.out.println(list[i] + " sayısı " + count + " kez tekrar etmiştir.");
            }
        }
    }
}
