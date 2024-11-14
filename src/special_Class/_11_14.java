package special_Class;

public class _11_14 {
}


public class Problem1 {

        // 라운드 시작 게임 라운드 번호 표시
        int gameRound = 1;

        // 연산자 배열 생성 - {+, -, *} 1차원 배열
        char[] operator = {'+','-','*'};
        int score = 0;
        while (true) {
            System.out.println(gameRound + "번째 게임");
            // 사용자가 아무 값이나 입력
            System.out.print("게임을 시작하려면 아무 값이나 입력하세요: ");
            String inputValue = scan.nextLine();
            // 저장할 1차원 배열 생성
            char[] saveOperator = new char[3];
            // 랜덤 연산자 선택 -> 무작위 선택 0,1,2 범위 내에서 선택한다.
            // 0 ~ 2 까지 랜덤 숫자 선택

            // 선택된 3개의 연산자를 1차원 배열에 저장
            for (int i = 0; i < saveOperator.length; i++) {
                int randomSelect = (int)(Math.random() * 3);
                saveOperator[i] = operator[randomSelect];
            }
            System.out.println(saveOperator);
            System.out.println("------------------");
            System.out.println("  " + saveOperator[0] + "  :" + "  " + saveOperator[1] + "  :" + "  " + saveOperator[2] + "  :");
            System.out.println("------------------");


            // saveOperator 배열을 순회(for each)? 하였을 때 + 의 갯수 - 의 갯수 * 의 갯수 파악

            int plus = 0;
            int m = 0;
            int r = 0;
            String oneGameResult = "";

            for (int value : saveOperator) {
                if ('+' == value) {
                    plus += 1;
                }
                else if ('-' == value) {
                    m += 1;
                }
                else {
                    r += 1;
                }
            }
            // ++ 연산자가 2개일 경우 ==> 점수 1점 추가
            if (plus == 2 && saveOperator[0] == '+' && saveOperator[1] == '+' || saveOperator[1] == '+' && saveOperator[2] == '+') {
                score += 1;
                oneGameResult = "+ 2 Combo - 보너스 점수 1점 획득";
            }
            // +++ 연산자가 3개일 경우 ==> 점수 3점추가
            else if (plus == 3) {
                score += 3;
                oneGameResult = "+ 3 Combo - 보너스 점수 3점 획득";
            }
            // -- 연산자가 2개일 경우 ==> 점수 1점 감점
            else if (m == 2 && saveOperator[0] == '-' && saveOperator[1] == '-' || saveOperator[1] == '-' && saveOperator[2] == '-') {
                score -= 1;
                oneGameResult = "- 2 Combo - 보너스 점수 1점 감점";
            }
            // --- 연산자가 3개일 경우 ==> 점수 3점 감점
            else if (m == 3) {
                score -= 3;
                oneGameResult = "- 3 Combo - 보너스 점수 3점 감점";
            }
            // ** 연산자가 2개일 경우 ==> 점수 2점 추가
            else if (r == 2 && saveOperator[0] == '*' && saveOperator[1] == '*' || saveOperator[1] == '*' && saveOperator[2] == '*') {
                score += 2;
                oneGameResult = "* 2 Combo - 보너스 점수 2점 획득";
            }
            // *** 연산자가 3개일 경우 ==> 점수 5점 추가
            else if (r == 3) {
                score += 5;
                oneGameResult = "* 3 Combo - 보너스 점수 5점 획득";
            }

            System.out.println(oneGameResult);
            System.out.println("현재 점수 : " + score);

            if (score >= 5) {
                System.out.println("승리! 최종 점수 : " + score);
                break;
            }
            if (score == -5) {
                System.out.println("패배! 최종 점수 : " + score);
                break;
            }


            plus = 0;
            m = 0;
            r = 0;


            gameRound++;
            System.out.println(" ");
        }



        // 선택된 3개의 연산자를 1차원 배열에 저장




    }

}
