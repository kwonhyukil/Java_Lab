package Class.Flow_Control;

import java.util.Scanner;

public class Test_Array {
    public static void main(String[] args) {

        // switch 문을 이용하여 아래 프로그램 작성
        // 키보드로부터 정수를 입력

        // 1 이면 python 출력
        // 2 이면 Java 출력
        // 3 이면 C++ 출력
        // 4 이면 JavaScript 출력
        Scanner scan = new Scanner(System.in);

        // 정수 입력

        int user = 0;

        // 만약 입력 값이 정수가 아닐 경우 혹은 범위를 벗어나는 값일 경우 재입력 요청
        while (true){
            System.out.print("정수를 입력 하세요: ");
            user = scan.nextInt();

            if (user >= 0 && user <= 5){
                System.out.println("올바른 값 입니다.");
                break;
            } else {
                System.out.println("잘못된 입력값 입니다. 재입력 하세요");
            }
        }
        String select = "";
        // switch 문작성
        switch (user){
            case 1: // 1일 경우
                select = "Python";
                break;
            case 2: // 2일 경우
                select = "Java";
                break;
            case 3: // 3일 경우
                select = "C++";
                break;
            case 4: // 4일 경우
                select = "JavaScript";
                break;
        }
        System.out.println("출력 값은 " + select + " 입니다.");
        
        // Switch_Expression 사용 : return 값을 반환값을 출력할 때 사용 -- 특정 알고리즘이 돌아가야 할 때는 사용 하지 않는다. -> 기본 switch 사용.
        select = switch (user) {
            case 1,5 -> // 1일 경우  " -> " 는 return 으로 생각하면 된다.
                    "Python";
            case 2 -> // 2일 경우
                    "Java";
            case 3 -> // 3일 경우
                    "C++";
            case 4 -> // 4일 경우
                    "JavaScript";
            default -> select;
        };
        System.out.println("출력 값은 " + select + " 입니다.");

    }
}
