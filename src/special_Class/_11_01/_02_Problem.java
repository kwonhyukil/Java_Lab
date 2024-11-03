package special_Class._11_01;

import java.util.Scanner;

public class _02_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 키보드로부터 정수 N을 입력받아
        int inputValue = 3;

        // 만약 N 값이 0이하 또는 10 초과일 경우 재입력
        // 무한 반복 : 조건을 만족하는 입력 값이 언제 들어올지 몰라....
        while(true) {
            // 키보드로부터 정수를 입력
            inputValue = scan.nextInt();

            // 만약 입력 값이 0 이상 10 이하일 경우 반복문 탈출
            // if inputValue >= 0 && inputValue <= 10
            if (inputValue >= 0 && inputValue <= 10){
                break;
            }
            System.out.println("재입력 하세유");
            // 흐름 제어문의 선택과 반복은 항상 조건식을 가진다...
        }

        // N 개의 int형 원소를 가지는 1차원 배열을 생성하라.
        int bar[] = new int[inputValue];

        for (int i = 0 ; i < bar.length ; i++) {

            int inputValue2 = scan.nextInt();

            // 무한 반복
            while (true) {
                // 키보드로부터 정수값 입력
                inputValue2 = scan.nextInt();
                // 입력받은 정수값이 양의 정수이면 탈출 break
                if (inputValue2 > 0){
                    break;
                }
            }
            // 입력 받은 정수값을 현 인덱스의 원소에 저장
            bar[i] = inputValue2;
        }
        for (int i = bar.length; i >= 0; i++) {
            System.out.println(bar[i]);
        }
    }
}
