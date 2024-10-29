package Class.Lab.FlowControl;

import java.util.Scanner;

public class _01_Lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("나이를 입력 하세요: ");
        int age = scan.nextInt();

        String result = "";

        if (age < 0){
            System.out.println("나이는 음수가 될 수 없습니다. 다시 입력하세요.");
            return;
        } else {
            if (age > 0 && age <= 12){
                result = "어린이";
            } else if (age >= 13 && age <= 17){
                result = "청소년";
            } else if (age >= 18 && age <= 64){
                result = "성인";
            } else {
                result = "노인";
            }
        }
        System.out.println(result);
    }
}
