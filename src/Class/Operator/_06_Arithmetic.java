package Class.Operator;

public class _06_Arithmetic {
    public static void main(String[] args) {

        int bar = 2;
        bar++; // bar = bar + 1, 후위 (post) 연산
        System.out.println(bar); // 3
        bar--; // bar = bar - 1;, 후위(post) 연산
        System.out.println(bar); // 2


        ++bar ; // bar = bar + 1, 전위(pre) 연산
        System.out.println(bar); // 3
        --bar; // bar = bar - 1, 전위(pre) 연산
        System.out.println(bar); // 2

        // ++ --
        // 1 증가 , 1 감소
        // 전위, 후위 연산
        int zar = 1;

        // foo = (bar = bar + 1)
        int foo = ++zar; // 2 ,  증가 시키고 zar 값을 쓴다
        System.out.println(foo);

        int kin = zar++; // kin = bar -> bar = bar + 1
        // bar++
        // bar += 1
        // bar = (byte)(bar + 1)
        System.out.println(kin);

        int har = 5;
        int gin = 5;
        int eoo = har++; // -> foo = har -> har = har + 1
        int pos = ++gin; // -> pos = (kin = kin + 1)

        System.out.println(har);
        System.out.println(kin);
    }
}
