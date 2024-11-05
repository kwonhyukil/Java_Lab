package Class.Comment_variable;

public class _02_Variable2 {
    public static void main(String[] args) {

        // 초기값 : 변수나 상수가 선언 될 때 입력 되는 값.
        int foo = 3; // 1) int foo -> foo = 3


        // int 타입 bar 상수를 선언
        // 상수도 ......결론적...메모리에 저장 되는 값이다.
        // int bar = 2 변수 선언
        final int bar = 2; //상수
        // 변경이 되면 안되는 값들을 저장 해야 할 때 상수로 선언 해야 한다.


        // 변수의 동작 모드는 두가지 : Get , Set
        // bar = 10; // Set mode

        System.out.println(bar); // Get mode

        // final과 같이 꾸며 주는 키 워드를 Modifier 라고 한다

        // bar는 일반 상수 일까요? 리터럴 상수 일까요?
        // bar는 일반 상수

        // final int bar = 3; // 상수

        // 리터럴 상수(Literal constant) : 3
    }


}
