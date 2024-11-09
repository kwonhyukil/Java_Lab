package special_Class._11_09;

import java.util.Scanner;

public class _01_Problem {
    public static void main(String[] args) {

        // 가위, 바위, 보 게임 만들기
        // 키보드로부터 Scissors, Rock, Paper를 입력받아,
        // 아래와 같이 결과를 출력하라
        // 예 ) 1. 승리 - 사용자 : Scissors, 컴퓨터 : Paper
        // 예 ) 1. 패배 - 사용자 : Scissors, 컴퓨터 : Rock
        // 예 ) 1. 무승부 - 사용자 : Scissors, 컴퓨터 : Scissors

        // 고려사항
        // 1. 사용자로부터 입력 시 Scissors, Rock, Paper 이외 값은
        //    재입력 처리
        // 2. "Quit" 입력 전까지 계속해서 게임 실행
        Scanner scan = new Scanner(System.in);

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
            if (userSelect == 3) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            if (userSelect == -1) {
                System.out.println("Scissors, Rock, Paper 값 중 입력 하세요");
                continue;
            }

            String[] randomList = {"Scissors", "Rock", "Paper"};
            int computerSelect = (int) (Math.random() * 3);

            String oneGameResult = "";
            String result = "";
            if (userSelect == computerSelect) {
                result = "비겼습니다.";
            } else if (userSelect == 0 && computerSelect == 2 ||
                    userSelect == 1 && computerSelect == 0 ||
                    userSelect == 2 && computerSelect == 1) {
                result = "이겼습니다.";
                winCount += 1;
                gameScore += 1;

                if (winCount >= 2) {
                    gameScore += 3;
                    winCount = 0;
                }
                if (gameScore >= 7) {
                    System.out.println("축하합니다. 승리 ~");
                    break;
                }
            } else {
                result = "패배했습니다.";
                gameScore -= 1;
                if (gameScore >= -8){
                    System.out.println("다음기회에 ~ ");
                }
            }

            System.out.println("User의 선택: " + randomList[userSelect] + "\t" + "컴퓨터의 선택: " + randomList[computerSelect]);
            System.out.println(result);
            System.out.println(oneGameResult + "현재 스코어: " + gameScore);

            }
        }
    }


