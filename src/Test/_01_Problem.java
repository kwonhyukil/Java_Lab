package Test;

import java.util.Scanner;

public class _01_Problem {


    public static void main(String[] args) {

        // bingo matrix : N X N
        int bingoMatrix = 0;
        // bingoMatrixNum : M 매트릭스 수
        int bingoMatrixNum = 0;
        int[][][] bingoBoard = new int[bingoMatrixNum][bingoMatrix][bingoMatrix];

        // 난수 범위
        int startNum = 0;
        int endNum = 0;
        // 메뉴 선택
        int menuChoice = 0;

        // 중복 숫자 저장 변수
        int randomNum = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            // 1번
            // 메뉴 출력!
            System.out.println("===== 빙고 게임 메뉴 =====");
            System.out.println("1. 빙고판 생성");
            System.out.println("2. 숫자별 발생 빈도 분석");
            System.out.println("3. 빙고판 출력");
            System.out.println("4. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            menuChoice = scan.nextInt();
            if (menuChoice < 1 || menuChoice > 4) {
                System.out.println("1 ~ 4 범위 내 숫자를 입력 하세요");
                continue;
            }
            if (menuChoice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            switch (menuChoice) {
                case 1:
                    boolean MatrixCheck = false;
                    while (MatrixCheck) {
                        System.out.print("빙고 Matrix의 N 값을 입력 하세요 (3 이상 9 이하 홀수): ");
                        bingoMatrix = scan.nextInt();
                        if (bingoMatrix % 2 != 1) {
                            System.out.println("N 값은 3이상 9이하 정수 중 홀수 값만 입력 가능합니다.");
                            continue;
                        } else {
                            MatrixCheck = true;

                            boolean randomCheck = false;
                            while (randomCheck) {
                                System.out.print("난수 범위의 시작 값을 입력하세요: ");
                                startNum = scan.nextInt();
                                System.out.print("난수 범위의 종료 값을 입력하세요: ");
                                endNum = scan.nextInt();
                                if ((endNum - startNum + 1) < bingoMatrix * bingoMatrix) {
                                    System.out.println("종료 값 - 시작 값이 N x N 보다 크거나 같아야 합니다.");
                                    continue;
                                } else {
                                    randomCheck = true;
                                }
                            }
                            boolean matrixNum = false;
                            while (matrixNum) {
                                System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요 (1 이상 7이하): ");
                                bingoMatrixNum = scan.nextInt();
                                if (bingoMatrixNum < 1 || bingoMatrixNum > 7) {
                                    System.out.println("M 값은 1이상 7이하 양수만 입력 가능합니다.");
                                } else {
                                    matrixNum = true;
                                }
                            }
                            for (int i = 0; i < bingoBoard.length; i++) {
                                for (int j = 0; j < bingoBoard[j].length; j++) {
                                    for (int k = 0; k < bingoBoard[j][k].length; k++) {
                                        randomNum = (int) (Math.random() * (endNum - startNum + 1) + startNum);
                                        bingoBoard[i][j][k] = randomNum;
                                        System.out.print(bingoBoard[i][j][k] + " ");
                                    }
                                }
                            }

                        }
                    }
                    break;
            }
        }
    }
}


                        // 빙고 Matrix N 값을 입력합니다. N 값은 홀수만 가능 아닐 경우 재입력

                        // N값을 입력한 만큼 matrix를 생성합니다.

                        // matrix를 생성후 그 빈칸에 난수를 발생합니다.
//                case 2:
//                    break;
//                case 3:
//                    break;

                    // 4번
                    // 프로그램 종료

                    // 2번

                    // 1) 빙고판 생성
                    // 빙고판 크기 설정 ( 홀수로 입력 받는다 ) 아닐 경우 재입력

                    // 난수 범위 ( 시작 값 :  // 종료 값:  )
                    // 조건 : ( 종료값 - 시작값 + 1 ) >= 빙고판 크기 갯수 ( 3 X 3 일 경우 난수 범위는 9와 같더나 커야함)

                    // 빙고의 Matrix 수 M 입력 ( 1이상 7 이하의 정수로 입력 ) 아닐 경우 재입력

                    // 중복되지 않은 숫자 ( 시작값 ~ 종료 값)로 M개의 빙고판 생성 ( 3차원 배열 생성 )

                    // 2) 숫자별 발생 빈도 분석 콤보 점수 계산
                    // 생성된 모든 빙고판에서 각 숫자의 발생 횟수와 백분율을 출력

                    // 3번

                    // 빙고판 출력
                    // 생성된 모든 빙고판을 출력한다.



