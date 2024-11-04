package special_Class._11_03;

import java.util.Scanner;

public class _01_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 키보드로부터 정수 N을 입력 받아,
        // N개의 정수형 원소를 가지는 1차원 배열을 생성하라.
        // 만약 N이 0 또는 음의 정수이면 재입력

        // 키보드로부터 start, end 정수 값을 입력받아
        // start <= rand value <= end 범위의 난수를 발생하여
        // 배열에 저장하라
        // 이때, start ~ end 범위의 크기가 배열의 원소보다 작을 경우
        // 재입력을 받아라
        // 예 ) N = 5 -> 5개의 원소를 가지는 1차원 배열
        //     start : 10 , end : 12 -> 10, 11, 12
        // 배열 내 원소값 출력

        // 정수 N 값 입력 받기
        int num0fElements = 0;
        // N개의 정수형 원소를 가지는 배열 생성

        // 재입력 == While 문 사용
        while (true) {
            System.out.print("정수 N을 입력 하세요: ");
            num0fElements = scan.nextInt();
            // 만약 N이 0 또는 음의 정수 이면 재입력 -> 0초과일 경우 break
            if (num0fElements > 0) {
                break;
            }
            System.out.println("재 입력 하세요");
        }
        int start = 0;
        int end = 0;
        // 배열 생성
        int[] bar = new int[num0fElements];

        while (true) {
            // 키보드로부터 start, end 정수 값을 입력받아
            System.out.print("Start 값을 입력 하세요: ");
            start = scan.nextInt();
            System.out.print("End 값을 입력 하세요: ");
            end = scan.nextInt();
            // 이때, start ~ end 범위의 크기가 배열의 원소보다 작을 경우
            if ((end - start + 1) >= num0fElements) {
                break;
            }
            // 재입력을 받아라
            System.out.println("배열의 크기보다 큰 범위를 입력 하세요.");
        }

        for (int i = 0; i < bar.length; i++) {
            // start <= rand value <= end 범위의 난수를 발생하여
            bar[i] = (int) (Math.random() * (end - start + 1)) + start;
        }
        for (int value : bar) {
            System.out.println(value);
        }
        // start <= rand value <= end 범위의 난수를 발생하여
        // 배열에 저장하라
    }
}

