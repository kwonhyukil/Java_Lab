package special_Class._11_04;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class _01_Problem {
    public static void main(String[] args) {
        // 가위, 바위, 보 게임 만들기
        // 사용자로부터 Scissors, Rock, Paper 중 하나 입력
        // - Scissors , Rock, Paper 중 하나를 입력 하세요:
        // 컴퓨터가 난수를 이용해, 가위-바위-보 중 하나 선택
        // 결과 출력
        //  - 예) 승리 : 사용자 - 가위, 컴퓨터 - 보
        //  - 예) 패배 : 사용자 - 가위, 컴퓨터 - 바위
        //  - 예) 무승부 : 사용자 - 가위, 컴퓨터 - 가위
        // 그리고 게임 재실행

        // 사용자로부터 Scissors, Rock, Paper 입력 예외 처리
        //  - Scissors, Rock, Paper 이외의 값이 입력 될 경우
        //    "잘못된 입력 값 입니다, Scissors, Rock, Paper 중 하나를 입력 하세요."
        //    출력 후 재입력
        // "quit"를 입력하면 프로그램 종료

        Scanner scan = new Scanner(System.in);

        // 무한 루프 -> 한번 돌때 게임 한판
        while (true){
            // 사용자 로부터 Scissors, Rock, Paper 중 하나 입력
            System.out.print("Scissors , Rock, Paper 중 하나를 입력 하세요: ");
            String inputValue = scan.nextLine();

            int select = switch (inputValue){
                case "Scissors" -> 0;
                case "Rock" -> 1;
                case "Paper" -> 2;
                case "quit" -> 4;
                default -> -1;
            };
            System.out.println(select);
            // 예외 처리
            // 1. quit 이면 -> 프로그램 종료 -> break
            if (select == 4){
                System.out.print("프로그램을 종료합니다.");
                break;
            }
            // 2. 잘못된 입력 -> 재입력 -> continue
            if (select == -1){
                System.out.println("잘못된 입력 값 입니다, Scissors, Rock, Paper 중 하나를 입력 하세요.");
                continue;
            }
            // 컴퓨터 선택 : 가위, 바위, 보 중 하나 선택
            // 난수 이용 : 0 ~ 2 사이 난수 발생 후 "가위, 바위, 보"에 매칭
            String[] SciRockPaper = {"Scissors", "Rock", "Paper"};
            //                           0          1        2
            int computerInput = (int)(Math.random() * 3);

            System.out.println(computerInput);
            System.out.println(SciRockPaper[computerInput]);

            String result = "";
            // 숫자로 승패 비교
            if (select == computerInput) {
                result = "무승부 입니다.";
            } else if ( select == 0 && computerInput == 2 ||
            select == 1 && computerInput == 0 ||
            select == 2 && computerInput == 1) {
                result = "이겼습니다.";
            } else {
                result = "패배 했습니다.";
            }
            // 승패 출력
            System.out.println(result);
        }
    }
}
