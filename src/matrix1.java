


import java.util.Random;


public class matrix1 {

    public static void main(String[] args) {


        Random rand = new Random();
        int i, n;
        int[][] mas = new int[5][5];
        for (n = 0; n < 5; n++) {
            for (i = 0; i < 5; i++) {
                mas[i][n] = rand.nextInt(20);
                int lengthNumber = (String.valueOf(mas[i][n])).length();
                if (lengthNumber == 1) {
                    System.out.print(mas[i][n] + "  ");
                } else if (lengthNumber == 2) {
                    System.out.print(mas[i][n] + " ");
                }
                if (i == 4) {
                    System.out.println();
                }
            }
        }
    }
}
