package special_Class._11._11_15;

import java.util.Scanner;

public class _01_Problem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int NUM_OF_ITEMS = 3;
        int bounsPoint = 0;
        int gameCount = 1;
        // 연산자 배열 생성
        // 세 가지 연산자 {+, -, *)를 포함하는 char type 1차원 배열을 생성하세요
        char[] items = {'*', '+', '-'};

        char[] selectedItems = new char[NUM_OF_ITEMS];
        // 랜덤 연사자 선택
        // 각 라운드에서 슬롯머신을 돌리면 +, -, * 문자 중 3개가 무작위로 선택
        // 선택된 3개의 연산자를 1차원 Array 에 저장

        while (true) {
            System.out.println(gameCount + "번째 게임");
            // 사용자로부터 아무키나 입력
            System.out.print("아무키나 입력 하세요: ");
            scan.next();
            // 랜덤하게 아이템 3개를 선택하여 1차원 배열에 저장
            for (int i = 0; i < selectedItems.length; i++) {
                // char[] items = {'*', '+', '-'};
                int selectedIndex = (int) (Math.random() * NUM_OF_ITEMS);
                selectedItems[i] = items[selectedIndex];
            }
            System.out.println("---------------------------------------");
            for (char item : selectedItems) {
                System.out.print("\t" + item);
            }
            System.out.println();
            System.out.println("---------------------------------------");
            // 포인트 점수 계산
            char selectedItem = '0';
            int conCharCount = 0;
            String oneGame = "";
            for (int i = 0; i < selectedItems.length - 1; i++) {
                //         index 0   == index 1, 2
                if (selectedItems[i] == selectedItems[i + 1]) {
                    conCharCount++;
                    // 연속된 문자 종류 저장
                    selectedItem = selectedItems[i];
                }
            }
            // A. 연속된 문자가 2개
            if (conCharCount == 1) {
                switch (selectedItem) {
                    case '+':
                        oneGame = "+ 2 combo - 보너스 점수 1점 획득";
                        bounsPoint += 1;
                        break;
                    case '-':
                        oneGame = "- 2 combo - 보너스 점수 1점 감점";
                        bounsPoint -= 1;
                        break;
                    case '*':
                        oneGame = "* 2 combo - 보너스 점수 2점 획득";
                        bounsPoint += 2;
                        break;
                    default:
                        System.out.println("something went wrong");
                }
                // B. 연속된 문자가 3개
            } else if (conCharCount == 2) {
                switch (selectedItem) {
                    case '+':
                        oneGame = "+ 3 combo - 보너스 점수 3점 획득";
                        bounsPoint += 3;
                        break;
                    case '-':
                        oneGame = "- 3 combo - 보너스 점수 3점 감점";
                        bounsPoint -= 3;
                        break;
                    case '*':
                        oneGame = "* 3 combo - 보너스 점수 5점 획득";
                        bounsPoint += 5;
                        break;
                    default:
                        System.out.println("something went wrong");
                }
            }
            System.out.println(oneGame + "\n" + "현재 점수: " + bounsPoint);
            if (bounsPoint >= 5) {
                System.out.println("승리, 보너스 포인트 : " + bounsPoint);
                break;
            } else if (bounsPoint <= -5) {
                System.out.println("패배, 보너스 포인트 : " + bounsPoint);
                break;
            }

            gameCount++;
            // 게임종료
//        }
        }
    }
}


