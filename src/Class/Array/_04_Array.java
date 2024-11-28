package Class.Array;

public class _04_Array {
    public static void main(String[] args) {
        final int FRAME_NUM = 10000;
        final int ITEM_NUM = 20;
        float[][] noiseMatrix;

        noiseMatrix = new float[FRAME_NUM][ITEM_NUM];

        noiseMatrix = new float[FRAME_NUM][];

        noiseMatrix[0] = new float[ITEM_NUM];
        noiseMatrix[1] = new float[ITEM_NUM];
        noiseMatrix[9999] = new float[ITEM_NUM];
    }
}
