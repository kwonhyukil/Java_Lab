package special_Class._11_03;

import java.util.Scanner;

public class _01_Problem2 {
    public static void main(String[] args) {
        // 키보드로부터 정수 N을 입력 받아,
        // 만약 N이 0 또는 음의 정수이면 재입력
        Scanner scan = new Scanner(System.in);

        int num0fElements = 0;

        while (true){
            num0fElements = scan.nextInt();

            // 탈출 조건 : if num0fElements > 0 -> break
            if (num0fElements > 0){
                break;
            }
            // 예외 출력
            System.out.println("양수 값을 입력 하세요.");
        }
        // N개의 정수형 원소를 가지는 1차원 배열을 생성하라.
        int[] bar = new int[num0fElements];

        // 예 ) N = 5 -> 5개의 원소를 가지는 1차원 배열
        //     start : 10 , end : 12 -> 10, 11, 12
        // 배열 내 원소값 출력

        // 키보드로부터 start, end 정수 값을 입력받아
        // 이때, start ~ end 범위의 크기가 배열의 원소보다 작을 경우
        // start <= rand value <= end 범위의 난수를 발생하여
        // 재입력을 받아라

        int start = 0;
        int end = 0;

        while (true) {
            start = scan.nextInt();
            end = scan.nextInt();

            if ((end - start + 1) >= num0fElements){
                break;
            }
            System.out.println("배열의 크기보다 큰 범위를 입력 하세요.");
        }
        for (int i = 0; i < bar.length; i++) {
            // 만약 end = 10이면
            bar[i] = (int)(Math.random() * (end - start + 1)) + start;
        }
        for (int value : bar) {
            System.out.println(value);
        }
        // start <= rand value <= end 범위의 난수를 발생하여
        // 배열에 저장하라
    }
}
