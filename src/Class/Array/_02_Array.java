package Class.Array;

import java.util.Arrays;

public class _02_Array {
    public static void main(String[] args) {
        int[][] bar = new int[3][3];

        int value = 10;
        // Loop: row 0 -> 2
        for(int row = 0; row < bar.length; row++) {
            // Loop : col 0 -> 2
            for (int col = 0; col < bar[row].length; col++) {
                bar[row][col] = value;
                value += 10;
                System.out.print(bar[row][col] + " ");
            }
            System.out.println();
        }


    }
}

