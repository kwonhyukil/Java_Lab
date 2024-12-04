package special_Class._11._11_01;


import java.util.Scanner;

public class _01_Problem {
    public static void main(String[] args) {

        // 키보드로부터 정수 N을 입력 받아
        // N개의 int형 원소를 가지는 1차원 배열을 생성하라.
        // 만약 N 값이 0이하 또는 10 초과일 경우 재입력 -> while 문 작성

        // 생성된 1차원 배열에 사용자로 부터 값을 입력 받아 배열에 순차적으로 저장하라
        // 예 ) 사용자 1 -> bar[0] = 1
        // 만약 음의 정수 또는 0이 입력 될 경우 재입력 -> while 문

        // 현재 1차원 배열에 입력된 값을 역순으로 출력하라.
        // 3, 10, 20
        // 출력 : 20, 10, 3

        Scanner scan = new Scanner(System.in);

        int num = 0;
        // 무한반복 : 조건을 만족하는 입력 값이 언제들어올지 몰라....
        while (true) {
            // 정수 N 입력 받기
            System.out.print("정수를 입력하세요: ");
            num = scan.nextInt();

            // N 값이 0 이하 또는 10 초과가 아닐경우 break
            if (num >= 0 && num <= 10) { // N >= 0 || N <= 10
                break;
            }
            System.out.println("재입력 하세요");

        }
        // 1차원 배열 생성
        int Array[] = new int[num];

        for (int i = 0; i < Array.length; i++) {

            while (true) {
                // 사용자 입력
                System.out.print("숫자 입력해유: ");
                Array[i] = scan.nextInt(); // 입력된 값을 1차월 배열에 순차적으로 저장
                // 입력 값이 음의 정수 이거나 0이 입력 될 경우 재입력 요정 while
                if (Array[i] > 0) {
                    break;
                } else {
                    System.out.println("재입력해유");
                }
            }
        }
        // 생성된 1차원 배열을 뒤에서 부터 출력
        for (int i = Array.length - 1 ; i >= 0; i--){
            System.out.print(Array[i] + " ");
        }
    }
}
