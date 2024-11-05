package Class.Comment_variable;

public class _04_Variable4 {
    public static void main(String[] args) {
        // byte -> 1 byte -> 8bits -> 2^8
        // -> 256 -> -128 ~ 127
        // 최댓값 : 127
        // 최솟값 : -128
        byte bar = 127; // overflow
        bar++; // bar = bar + 1
        System.out.println(bar);

        bar = -128; // Underflow
        bar--; // bar = bar - 1
        System.out.println(bar);

        long pos = 2147483647 + 2;
        System.out.println(pos);

        double kin = (450 + 3 ) / 2.0;


    }
}
