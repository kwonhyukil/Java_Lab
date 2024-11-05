package Class.Comment_variable;

import java.util.Scanner;

public class _00_Comment {
    public static void main(String[] args) {

        // Scanner 객체 생성 하여 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 사용 자에게 출력할 구구단 입력을 요청
        System.out.print("출력할 구구 단을 입력 하세요: ");
        int tableNumber = scanner.nextInt(); // 사용 자가 입력한 값을 저장

        /*
         * 입력된 숫자에 대해 구구 단을 출력 하는 반복문
         * 반복 문은 1부터 9까지 순회 하면서
         * 사용 자가 입력한 숫자와 곱하여 결과를 출력
         */
        for (int multiplier = 1; multiplier <= 9; multiplier++) {
            // 입력된 숫자에 대해 1부터 9까지 곱한 결과를 출력
            System.out.println(tableNumber + " * " + multiplier + " = " + tableNumber * multiplier);
        }

        // Scanner 자원 해제
        scanner.close(); // 리소스 누수를 방지 하기 위해 Scanner 객체 닫기
    }
}
