package special_Class._11_11;


public class _02_Problem {
    public static void main(String[] args) {
//        3 * 3;
//        0 0 0
//        0 0 0
//        0 0 0
//        for ( record ) { // 1 -> 행
//            }
//            for ( field ) { // 2 - > 열
//            }
        // Step 1
        // 사용자로 부터 M, N 정수를 입력 받아, M * N Matrix를 출력하세요
        // 예 ) M : 3, N : 2
        //  * *
        //  * *
        //  * *
        //  예외 처리 : M과 N이 0또는 음의 정수일 경우, 재입력 처리.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // Step 2
        // 문제는 동일, 출력값 변경
        // 예 ) M : 3, N : 3
        //    * *
        //  *   *
        //  * *
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(" " + "*");
            }
            System.out.println();

        }
    }
}
