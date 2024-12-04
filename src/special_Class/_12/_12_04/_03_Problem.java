package special_Class._12._12_04;

import java.util.Scanner;

public class _03_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int delindex = -1;
        float[][] score = {{1, 30, 40, 50, 60, 70}, {2, 20, 30, 40, 50, 60}, {3, 60, 70, 80, 90, 100}};
        int userInput = -1;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t");
            }
            System.out.println();
        }
        userInput = scan.nextInt();
        for (int i = 0; i < score.length; i++) {
            if ((int)score[i][0] == userInput) {
                delindex = i;
            }
        }
        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = score[i + 1][j];
            }
        }
        for (int i = 0; i < score.length; i++) {
            score[score.length - 1][i] = 0.0f;
        }
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
