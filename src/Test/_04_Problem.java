package Test;

import java.util.Random;

public class _04_Problem {

    public static void main(String[] args) {

        Random rand = new Random();
        int page = 3;
        int col = 3;
        int row = 3;
        int[][][] bingoMatrix = new int[page][col][row];
        int[][] bingo = new int[col][row];
        int startNum = 10;
        int endNum = 40;
        int randomNum;

        for (int i = 0; i < bingoMatrix.length; i++) {
            System.out.println("Matrix # " + (i+1));
            for (int j = 0; j < bingoMatrix[i].length; j++) {
                for (int k = 0; k < bingoMatrix[i][j].length; k++) {
                    randomNum = rand.nextInt(endNum - startNum) + startNum;
                    bingoMatrix[i][j][k] = randomNum;
                    System.out.print(randomNum + "\t");
                }
                System.out.println();
            }
        }
    }
}
