package special_Class._11_12;

import java.util.Scanner;

public class _01_Problem {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력 -> while 사용

        int M = 0;
        int N = 0;

        while (true) {
            // M 과 N 입력
            System.out.print("M 값을 입력하세요: ");
            M = scan.nextInt();
            System.out.print("N 값을 입력하세요: ");
            N = scan.nextInt();
            // M 과 N이 양의 정수일 경우 break
            if (M > 0 && N > 0){
                break;
            }
            System.out.print("잘못된 입력값입니다. 양의 정수를 입력하세요.");
        }

        for (int i = 0 ; i < M ; i++) {
            for (int j = 0 ; j < N ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // 사용자로 부터 M, N 정수를 입력 받아, M * N Matrix를 출력하세요.
        // 예 M : 3, N : 2
        // * *
        // * *
        // * *
        // 예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력
    }

}
