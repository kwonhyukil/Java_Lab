package Class.Array;

public class _05_Array {
    public static void main(String[] args) {
        int [] bar = new int[]{10, 20, 30, 40, 50};
        int [] foo = bar;

        foo[0] = 900;

        System.out.println(bar[0]);
    }
}
