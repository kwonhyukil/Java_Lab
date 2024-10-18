package Java_Lab;

import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("사용자의 나이를 입력 해 주세요: ");
        int age = scan.nextInt();

        if (age <= 12) {
            System.out.println("어린이 이용권을 사용할 수 있습니다.");
        } else if (age >= 13 && age <= 18) {
            System.out.println("청소년 이용권을 사용할 수 있습니다.");
        } else {
            System.out.println("성인 이용권을 사용할 수 있습니다.");
        }
    }
}
