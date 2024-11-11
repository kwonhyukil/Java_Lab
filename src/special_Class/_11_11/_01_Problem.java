package special_Class._11_11;

import java.util.Scanner;

public class _01_Problem {
    public static void main(String[] args) {

        // 가위 바위 보 게임을 구현
        // 사용자로 부터 "Scissors, Rock, Paper"를 입력
        // - "Scissors, Rock, Paper" 이외 값은 재입력 처리
        // 컴퓨터는 "Scissors, Rock, Paper" 중 하나를 랜덤하게 선택
        Scanner scan = new Scanner(System.in);
        // 계속하여 게임 실행 -> while 문 사용

        int winCount = 0;
        int score = 0;

        String[] selectList = {"Scissors", "Rock", "Paper"};

        while (true) {

            // 사용자로부터 입력
            System.out.print("Scissors, Rock, Paper 중 입력하세요: ");
            String inputValue = scan.nextLine();

            // 입력값을 숫자로 해서 처리 // Scissors = 0 , Rock = 1 , Paper = 2 , Exit = 3 , 예외값 = -1
            int userSelect = switch (inputValue) {
                case "Scissors" -> 0;
                case "Rock" -> 1;
                case "Paper" -> 2;
                case "Exit" -> 3;
                default -> -1; // "Scissors, Rock, Paper" 이외 값은 재입력 처리
            };
            // "Exit" 입력 시 게임 종료 -> break
            if (userSelect == 3) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            // "Scissors, Rock, Paper" 이외 값은 재입력 처리
            if (userSelect == -1) {
                System.out.println("잘못된 입력 값입니다. 재입력하세요!");
                continue;
            }

            // 컴퓨터 랜덤값 생성 -> Math.random
            int computerSelect = (int) (Math.random() * 3);

            String oneGameResult = "";
            String gameResult = "";
            // 사용자 == 컴퓨터
            if (userSelect == computerSelect) {
                oneGameResult = "무승부입니다. ";
                winCount = 0;
            }
            // 사용자 == 가위 && 컴퓨터 == 보 || 사용자 == 바위 && 컴퓨터 == 가위 || 사용자 == 보 && 컴퓨터 == 바위
            else if  (userSelect == 0 && computerSelect == 2 ||
                    userSelect == 1 && computerSelect ==0 ||
                    userSelect == 2 && computerSelect == 1) {
                oneGameResult = "승리했습니다. ";
                score += 1;
                winCount += 1;

                if (winCount >= 2) {
                    score += 3;
                }
                // 점수가 7점 이상일 경우
                if (score >= 7) {
                    gameResult = "사용자 승리!!";
                }
            }
            // 이외의 조건은 패배조건으로 처리 -> else 사용
            else {
                oneGameResult = "패배했습니다. ";
                score -= 1;
                winCount = 0;
                // 점수가 -7점일 경우
                if (score == -7) {
                    gameResult = "사용자 패배!!";
                }
            }
            // 게임 1판 결과
            System.out.println(oneGameResult + "현재 점수: " + score + "\n" + "사용자 선택: " + selectList[userSelect] + " 컴퓨터 선택: " + selectList[computerSelect]);
            // 게임 결과 출력
            // 만약 점수가 7점 이상이거나 -7점이면 종료 -> break 사용
            if (score >= 7 || score == -7) {
                System.out.println(gameResult + ": 보너스 점수: " + score);
                break;
            }
            // 결과 값 출력 :

            // 예 1) 승리 - 사용자 : 가위, 컴퓨터 : 보
            // 예 2) 패배 - 사용자 : 가위, 컴퓨터 : 바위
            // 예 3) 무승부 - 사용자 : 가위, 컴퓨터 : 가위

            // "Exit"를 입력하기 전까지 계속해서 게임 실행
            // 보너스 점수 구형
            // 사용자 승리 시 : 1점, 패배시 : -1
            // - 매 게임 결과 출력시 보너스 점수도 표시
            // 연속 승리 시 : 3점, 2 -> 3 -> 4...
            // 보너스 점수가 7저 이상 또는 -7점 이면 종료
            // - 사용자 승리 : 보너스 점수 XX 점
            // - 사용자 패배 : 보너스 점수 XX 점
        }
    }
}
