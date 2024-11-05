package Class.Operator;

public class _10_Logical {
    public static void main(String[] args) {

        int bar = 1;

        if (2 > 3 && (bar += 1) > 4){ // and 연산자는 앞에 false 이면 뒤에 실행이 안되고 넘어감 ** or 연산자도 똑같음
        // if (2 < 3 && (bar += 1) > 4 // 이 경우 에는 뒤에 조건이 실행 되어 bar 의 값이 2가 된다  ** or 연산자도 똑같음
        //
            System.out.println("hello");
        }

        System.out.println(bar);
    }
}
