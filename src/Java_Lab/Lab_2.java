package Java_Lab;

import java.util.Scanner;

public class Lab_2 {
    public static void main(String[] args) { // 블레이스
        Scanner scan = new Scanner(System.in);

        System.out.print("첫 번째 변의 길이를 입력하세요: ");
        int length_1 = scan.nextInt();
        System.out.print("두 번째 변의 길이를 입력하세요: ");
        int length_2 = scan.nextInt();
        System.out.print("세 번째 변의 길이를 입력하세요: ");
        int length_3 = scan.nextInt();

        if (length_1 + length_2 <= length_3 || length_2 + length_3 <= length_1 || length_3 + length_1 <= length_2) {
            System.out.println("입력하신 변의 길이로는 삼각형을 만들 수 없습니다. \n삼각형을 만들기 위해서는 어떤 두 변의 길이의 합이 다른 한 변의 길이보다 커야 합니다.");
        }else if (length_1 == length_2 && length_2 == length_3 && length_3 == length_1) {
            System.out.println("정삼각형");
        }else if (length_1 == length_2 || length_2 == length_3 || length_3 == length_1) {
            System.out.println("이등변 삼각형");
        } else {
            System.out.println("부등변 삼각형");
        }
    }
}
