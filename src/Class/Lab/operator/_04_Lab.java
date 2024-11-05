package Class.Lab;

import java.util.Scanner;

public class _04_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = scan.nextInt();

        System.out.print("몸무게를 입력하세요: ");
        double weight = scan.nextDouble();

        double age_result = (double)(age)+(weight);
        int weight_result = (int)(weight) + (age);

        System.out.println("나이를 double로 변환한 후 몸무게와 더한 결과: " + age_result);
        System.out.println("몸무게를 int로 변환한 후 나이와 더한 결과: " + weight_result);
    }
}

