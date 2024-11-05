package Class.Flow_Control;

public class _04_for {
    public static void main(String[] args) {

//        int bar = 0;
//        //   초기값                          조건식    for 문이 참일 때
//        for (System.out.println("초기값") ; bar < 2 ; System.out.println("증감 값")) {
//            //실행 문장
//            System.out.println("Hello World");
//            bar++;
        for (int bar = 0, pos = 2 ; bar < 5 || pos < -3; bar ++ , pos --){
            System.out.println(pos);
        }
        for (int bar = 0 ; bar < 10 ; bar++) {
            System.out.print    ("*");
        }
        for (char cha = 'Z' ; cha >= 'A' ; cha -=2) {
            System.out.println(cha);
        }
        // 1차원 배열 (Array) 선언 -> 원소의 개수 5개
        int bar[] = new int[5];

        // bar 배열의 각 원소의 값을 초기화
        for (int iCount = 0, value = 1; iCount < bar.length; iCount++, value *= 10) {
            bar[iCount] = value;
        }
        // bar 배열의 각 원소의 값을 출력
        for (int iCount = 0; iCount < bar.length; iCount++) {
            System.out.println(bar[iCount]);
        }
    }
}
