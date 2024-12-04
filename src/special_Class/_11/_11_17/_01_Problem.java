package special_Class._11._11_17;

import java.util.Scanner;

public class _01_Problem {
    public static void main(String[] args) {
        final int NUM_OF_VALUE = 3;
        Scanner scan = new Scanner(System.in);
        // 연산자 배열 { '+' , '-' , '*' } 생성
        char[] operatorList = { '+', '-', '*'} ;
        // 게임 카운트 변수 생성
        int gameRound = 1;
        // 게임 점수 변수 생성
        int gameScore = 0;
        while (true){
            // 게임 카운트 출력
            System.out.println(gameRound + "번 째 게임");
            // 각 라운드 시작시 사용자 입력
            System.out.print("게임을 시작하려면 아무 값이나 입력하세요: ");
            String userInput = scan.nextLine();
            // 랜덤 연산자 저장 배열 생성
            char[] comOperator = new char[NUM_OF_VALUE];
            // 랜덤 메소드 사용하여 랜덤 연산자 선택
            for (int i = 0 ; i < comOperator.length ; i++){
                int randomSelect = (int) (Math.random() * NUM_OF_VALUE);
                comOperator[i] = operatorList[randomSelect];
            }
            // 선택 연산자 출력
            System.out.println("----------------------------");
            System.out.println("\t" + comOperator[0] + "  :\t" + comOperator[1] + "  :\t" + comOperator[2] + "  :");
            System.out.println("----------------------------");
            // 선택된 연산자 인덱스 번호를 이용하여 비교
            // 연속된 연산자 저장 char 변수 생성
            char saveOperator = ' ';
            // 연속된 연산자 횟수 저장 int 변수 생성
            int saveValue = 0;
            // 연속된 연산자 비교 카운트 알고리즘 생성
            for (int i = 0 ; i < comOperator.length - 1 ; i++){
                saveOperator = comOperator[i];
                if (saveOperator == comOperator[i+1]){
                    saveValue += 1;
                }
            }
            // index[0] == index[1] 일경우 횟수 int 변수 +1
            // index[1] == index[2] 일경우 횟수 int 변수 +1
            // 3개를 비교하기 때문에 2번 반복하여 비교하면 된다.
            // 게임 결과 값 저장 변수 생성 oneGameResult

            String oneGameResult = "";

            // 횟수 int 변수가 1일 경우 해당 switch 문 실행
            // 연속된 연산자 char 변수가 '+'일 경우
            // + 연산자 연속 2개일 경우 = 1점추가
            if (saveValue == 1){
                switch (saveOperator){
                    case '+' :
                        oneGameResult = "+ 2 Combo - 보너스 점수 1점 획득";
                        gameScore += 1;
                        break;
                    case '-' :
                        oneGameResult = "- 2 Combo - 보너스 점수 1점 감점";
                        gameScore -= 1;
                        break;
                    case '*' :
                        oneGameResult = "* 2 Combo - 보너스 점수 2점 획득";
                        gameScore += 2;
                        break;
                }
            }
            // 횟수 int 변수가 2일 경우 해당 switch 문 실행
            // 연속 3개일 경우
            // 연속된 연산자 char 변수가 '+'일 경우
            // + 연산자 연속 3개일 경우 = 3점추가

            // 연속된 연산자 char 변수가 '-'일 경우
            // - 연산자 연속 3개일 경우 = 3점감점

            // 연속된 연산자 char 변수가 '*'일 경우
            // * 연산자 연속 3개일 경우 = 5점추가
            if (saveValue == 2){
                switch (saveOperator){
                    case '+' :
                        oneGameResult = "+ 3 Combo - 보너스 점수 3점 획득";
                        gameScore += 3;
                        break;
                    case '-' :
                        oneGameResult =  "- 3 Combo - 보너스 점수 3점 감점";
                        gameScore -= 3;
                        break;
                    case '*' :
                        oneGameResult =  "* 3 Combo - 보너스 점수 5점 획득";
                        gameScore += 5;
                        break;
                }
            }
            // 게임 결과 값 출력
            System.out.println(oneGameResult);
            // 매 라운드가 끝나면 현재 점수를 출력
            System.out.println("현재 점수 : " + gameScore);
            // 게임 종료 조건
            // 점수가 5점 이상 일 경우 "승리" 메시지 출력하고 점수가 5점 이하 일 경우 "패배" 메시지를 출력하고고 종료합니다.
            if (gameScore >= 5) {
                System.out.println("승리! 최종 점수 : " + gameScore);
                break;
            }
            if (gameScore <= -5) {
                System.out.println("패배! 최종 점수 : " + gameScore);
                break;
            }
            System.out.println();
            gameRound++;
        }
    }
}
