package Test;

import java.util.Random;

public class _03_Problem {

    public static void main(String[] args) {

        Random random = new Random();

        int page = 3;
        int col = 3;
        int row = 3;
        int[][][] bingoMatrix = new int[page][col][row];
        int startNum = 10;
        int endNum = 40;
        int randomNum;
        int[] randomNumSave = new int[col * row];

        for (int i = 0; i < bingoMatrix.length; i++) {
            System.out.println("Matrix # " + (i+1));
            for (int j = 0; j < bingoMatrix[i].length; j++) {
                for (int k = 0; k < bingoMatrix[i][j].length; k++) {
                    randomNum = random.nextInt(endNum - startNum) + startNum;
                    randomNumSave[k] = randomNum;
                    System.out.print(randomNumSave[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
