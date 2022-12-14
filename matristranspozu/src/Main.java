import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matris = { {1,2,3}, {4,5,6} };

        int[][] transpoz = new int[matris[0].length][matris.length];

        for(int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++){
                transpoz[j][i] = matris[i][j];
            }
        }



        System.out.println("Matris : ");
        for(int i[] : matris){
            for(int j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTranspoze : ");
        for(int i[] : transpoz){
            for(int j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }

    }
}