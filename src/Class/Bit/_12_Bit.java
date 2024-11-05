package Class.Bit;

public class _12_Bit {
    public static void main(String[] args) {

        int foo = 100;
        int bar = -1;

        int temp1 = foo - bar ;
        int temp2 = foo + (-bar) ;

        System.out.println( Integer.toBinaryString(foo));
        System.out.println( Integer.toBinaryString(bar));
    }
}
