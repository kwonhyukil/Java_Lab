package special_Class._11_18;

import java.util.Scanner;

public class _02_Problem {
    public static void main(String[] args) {
        // 문자 3개 무작위 선택 - 상수로 선언하여 값이 변경되지 않게 설정
        final int NUM_OF_VALUE = 3;
        Scanner scan = new Scanner(System.in);
        // 연산자 배열 생성 - { '+' , '-' , '*' }
        char[] operatorList = { '+' , '-' , '*'};
        // 게임 라운드 변수 생성
        int gameRound = 1;
        // 게임 점수 변수 생성
        int gameScore = 0;
        while (true) {
            // 게임 라운드 출력
            System.out.println(gameRound + "번 째 게임 시작 !!");
            // 사용자 입력
            System.out.print("게임을 시작하려면 아무값이나 입력하세요: ");
            String userInput = scan.nextLine();
            // 랜덤 연산자 저장 배열 생성
            char[] randomOperatorList = new char[NUM_OF_VALUE];
            // 랜덤 연산자 선택 - Math.random() 사용
            for (int i = 0 ; i < operatorList.length ; i++) {
                int randomNum = (int) (Math.random() * NUM_OF_VALUE);
                randomOperatorList[i] = operatorList[randomNum];
            }
            // 선택된 연산자 출력
            System.out.println("--------------------------");
            System.out.println("\t" + randomOperatorList[0] + "  :\t" + randomOperatorList[1] + "  :\t" + randomOperatorList[2] + "  :");

            System.out.println("--------------------------");
            // index[i] 저장 char 저장 변수 생성
            char saveOperator = '0';
            // 같은 연산자 카운트 int 변수 생성
            int operatorCount = 0;
            // 랜덤 연산자 배열 반복문 알고리즘 작성
            for (int i = 0; i < randomOperatorList.length - 1; i++) {
                saveOperator = randomOperatorList[i];
                if (saveOperator == randomOperatorList[i + 1]){
                    operatorCount++;
                }
            }

            // 한 게임 결과 저장 변수 생성
            String oneGameResult = "";

            // 같은 연산자 변수가 1일경우
            if (operatorCount == 1){
                switch (saveOperator) {
                    //      '+' 일 경우 - 1점 추가
                    case '+' :
                        oneGameResult = "+ 2 Combo - 보너스 점수 1점 획득";
                        gameScore += 1;
                        break;
                    //      '-' 일 경우 - 1점 감점
                    case '-' :
                        oneGameResult = "- 2 Combo - 보너스 점수 1점 감점";
                        gameScore -= 1;
                        break;
                    //      '*' 일 경우 - 2점 추가
                    case '*' :
                        oneGameResult = "* 2 Combo - 보너스 점수 2점 획득";
                        gameScore += 2;
                        break;
                }
            }
            // 같은 연산자 변수가 2일경우
            if (operatorCount == 2){
                switch (saveOperator) {
                    //      '+' 일 경우 - 3점 추가
                    case '+' :
                        oneGameResult = "+ 3 Combo - 보너스 점수 3점 획득";
                        gameScore += 3;
                        break;
                    //      '-' 일 경우 - 3점 감점
                    case '-' :
                        oneGameResult = "- 3 Combo - 보너스 점수 3점 감점";
                        gameScore -= 1;
                        break;
                    //      '*' 일 경우 - 5점 추가
                    case '*' :
                        oneGameResult = "* 3 Combo - 보너스 점수 5점 획득";
                        gameScore += 5;
                        break;
                }
            }
            System.out.println(oneGameResult);
            // 현재 게임 점수 출력
            System.out.println("현재 점수 : " + gameScore);

            // 만약 5 점 이상일 경우 승리 메시지 출력
            if (gameScore >= 5) {
                System.out.println("승리! 최좀 점수: " + gameScore);
                break;
            }
            if (gameScore <= -5) {
                System.out.println("패배! 최종 점수: " + gameScore);
                break;
            }
            // 만약 -5 점 이하일 경우 패배 메시지 출력
            System.out.println();
            // 게임 카운트 += 1
            gameRound++;

        }
    }
}
