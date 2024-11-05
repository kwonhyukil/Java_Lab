package Class.Lab.operator;

import java.util.Scanner;

public class _01_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("나이를 입력 하세요: ");
        int age = scan.nextInt();

        System.out.println("키를 입력 하세요: ");
        double height = scan.nextDouble();

        System.out.println("신용 점수를 입력 하세요: ");
        int credit_score = scan.nextInt();

        double sum = age + height + credit_score;

        double average = sum / 3;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + String.format("%.14f",average));
    }
}
