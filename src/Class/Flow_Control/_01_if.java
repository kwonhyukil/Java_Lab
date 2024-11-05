package Class.Flow_Control;

public class _01_if {
    public static void main(String[] args) {
//        int bar = 2;

        // bar 2 이면 참을 출력
//      if bar == 2;
//          print(bar)
        int bar = 3;

        if (bar == 2) { // 컴파일러가 if 다음 () 가 나와야 인식을 할 수 있다. -> if()
            System.out.println("Bar is 2");
        }

        if (bar % 2 == 0) {
            System.out.println("Bar is even");
        } else {
            System.out.println("Bar is odd");
        }
    }
}
