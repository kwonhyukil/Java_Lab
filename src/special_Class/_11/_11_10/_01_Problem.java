package special_Class._11._11_10;

import java.util.Scanner;

public class _01_Problem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 반복문 진행시 초기화 안되게 밖에 변수 선언
        int winCount = 0;
        int gameScore = 0;

        while (true) {

            // 사용자 입력
            System.out.print("Scissors, Rock, Paper 중 하나를 입력하세요: ");
            String userInput = scan.nextLine();

            int userSelect = switch (userInput) {
                case "Scissors" -> 0;
                case "Rock" -> 1;
                case "Paper" -> 2;
                case "Quit" -> 3;
                default -> -1;
            };
            if (userSelect == 3) { // Quit 입력시 게임 종료 break 사용
                System.out.println("게임을 종료합니다.");
                break;
            }
            if (userSelect == -1) { // 이외의 값이 입력될 시 해당 반복을 진행하지않고 다시 진행
                System.out.println("Scissors, Rock, Paper 값 중 입력 하세요");
                continue;
            }
            // 가위바위보 랜덤 배열 생성
            String[] randomList = {"Scissors", "Rock", "Paper"};
            // 0 ~ 2 범위의 컴퓨터 랜덤값 생성
            int computerSelect = (int) (Math.random() * 3);

            // 게임 1판 결과값 저장 변수 선언
            String oneGameResult = "";
            // 전체 게임 결과값 저장 변수 선언
            String result = "";
            // 가위 바위 보 조건문 생성
            if (userSelect == computerSelect) {
                result = "비겼습니다.";
            } else if (userSelect == 0 && computerSelect == 2 ||
                    userSelect == 1 && computerSelect == 0 ||
                    userSelect == 2 && computerSelect == 1) {
                result = "이겼습니다.";
                winCount += 1;
                gameScore += 1;
                // 승리 카운드가 2 이상일 경우 + 3점을 하고 승리 카운터 0으로 초기화
                if (winCount >= 2) {
                    gameScore += 3;
                    winCount = 0;
                }
                // 만약 게임 스코어가 7점 이상일 경우 축하 메시지와 함께 게임종료
                if (gameScore >= 7) {
                    System.out.println("축하합니다. 승리 ~");
                    break;
                }
            } else {
                result = "패배했습니다.";
                gameScore -= 1;
                // 만약 게임 스코어가 -8점 이하일 경우 메시지 출력 후 게임종료
                if (gameScore >= -8){
                    System.out.println("다음기회에 ~ ");
                    break;
                }
            }

            System.out.println("User의 선택: " + randomList[userSelect] + "\t" + "컴퓨터의 선택: " + randomList[computerSelect]);
            System.out.println(result);
            System.out.println(oneGameResult + "현재 스코어: " + gameScore);

        }
    }
}


