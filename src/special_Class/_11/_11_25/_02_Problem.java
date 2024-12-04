package special_Class._11._11_25;

public class _02_Problem {
    static void prtMatrix(int[][] argMatrix) {
        for (int i = 0; i < argMatrix.length; i++) {
            for (int j = 0; j < argMatrix[i].length; j++) {
                System.out.print(argMatrix[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {

        int[][] bar = {{10, 20}, {20, 40}, {50, 60}};
        prtMatrix(bar);
    }
}
