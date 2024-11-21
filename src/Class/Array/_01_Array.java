package Class.Array;

public class _01_Array {
    static float[] getSumAvg (int a , int b, int c){
        float[] result;
        result = new float[2];

        result[0] = a + b + c;
        result[1] = result[0] / 3;

        return  result;
    }
    public static void main(String[] args) {

        float[] values = getSumAvg(3,4,5);
        System.out.println("Sum = " + (int)values[0] + "\tavg = " + values[1]);
    }

}
