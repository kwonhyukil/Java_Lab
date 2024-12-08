package Test;
import java.util.Random;
import java.util.Scanner;

public class _07_Problem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[][][] bingoMatrix = null;  // 빙고 매트릭스 (3차원 배열)
        int matrixRowCol = 0;          // N (빙고판 크기)
        int matrixNum = 0;             // M (빙고판 개수)
        int startNum = 0;              // 난수 범위 시작 값
        int endNum = 0;                // 난수 범위 종료 값

        while (true) {
            // 메뉴 출력
            System.out.println("===== 빙고 게임 메뉴 =====");
            System.out.println("1. 빙고판 생성");
            System.out.println("2. 숫자별 발생 빈도 분석");
            System.out.println("3. 빙고판 출력");
            System.out.println("4. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            int menuChoice = scan.nextInt();

            if (menuChoice == 1) {
                // 1. 빙고판 생성
                System.out.print("빙고 매트릭스의 N 값을 입력하세요 (3 이상 9 이하 홀수): ");
                matrixRowCol = scan.nextInt();
                while (matrixRowCol < 3 || matrixRowCol > 9 || matrixRowCol % 2 == 0) {
                    System.out.print("N 값은 3 이상 9 이하의 홀수만 가능합니다. 다시 입력하세요: ");
                    matrixRowCol = scan.nextInt();
                }

                System.out.print("난수 범위의 시작 값을 입력하세요: ");
                startNum = scan.nextInt();
                System.out.print("난수 범위의 종료 값을 입력하세요: ");
                endNum = scan.nextInt();
                while (endNum - startNum + 1 < matrixRowCol * matrixRowCol) {
                    System.out.println("종료 값 - 시작 값은 N x N보다 크거나 같아야 합니다. 다시 입력하세요.");
                    System.out.print("난수 시작 값을 입력하세요: ");
                    startNum = scan.nextInt();
                    System.out.print("난수 종료 값을 입력하세요: ");
                    endNum = scan.nextInt();
                }

                System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요 (1 이상 7 이하): ");
                matrixNum = scan.nextInt();
                while (matrixNum < 1 || matrixNum > 7) {
                    System.out.print("M 값은 1 이상 7 이하의 값만 가능합니다. 다시 입력하세요: ");
                    matrixNum = scan.nextInt();
                }

                // 빙고판 생성
                bingoMatrix = new int[matrixNum][matrixRowCol][matrixRowCol];
                for (int p = 0; p < matrixNum; p++) {
                    int[] usedNumbers = new int[endNum - startNum + 1]; // 사용된 숫자 기록용 배열
                    for (int i = 0; i < matrixRowCol; i++) {
                        for (int j = 0; j < matrixRowCol; j++) {
                            int randomNumber;
                            do {
                                randomNumber = random.nextInt(endNum - startNum + 1) + startNum;
                            } while (usedNumbers[randomNumber - startNum] == 1); // 중복 체크
                            usedNumbers[randomNumber - startNum] = 1; // 사용된 숫자 기록
                            bingoMatrix[p][i][j] = randomNumber; // 빙고판에 저장
                        }
                    }
                }
                System.out.println("빙고판 생성이 완료되었습니다!");

            } else if (menuChoice == 2) {
                // 2. 숫자별 발생 빈도 분석
                if (bingoMatrix == null) {
                    System.out.println("먼저 빙고판을 생성하세요.");
                } else {
                    int[] frequency = new int[endNum - startNum + 1];
                    for (int[][] matrix : bingoMatrix) {
                        for (int[] row : matrix) {
                            for (int num : row) {
                                frequency[num - startNum]++;
                            }
                        }
                    }

                    System.out.println("===== 숫자별 발생 빈도 =====");
                    for (int i = 0; i < frequency.length; i++) {
                        if (frequency[i] > 0) {
                            System.out.println((i + startNum) + ": " + frequency[i] + "번");
                        }
                    }
                }

            } else if (menuChoice == 3) {
                // 3. 빙고판 출력
                if (bingoMatrix == null) {
                    System.out.println("먼저 빙고판을 생성하세요.");
                } else {
                    for (int p = 0; p < bingoMatrix.length; p++) {
                        System.out.println("===== 빙고 매트릭스 #" + (p + 1) + " =====");
                        for (int i = 0; i < matrixRowCol; i++) {
                            for (int j = 0; j < matrixRowCol; j++) {
                                System.out.print(bingoMatrix[p][i][j] + "\t");
                            }
                            System.out.println();
                        }
                    }
                }

            } else if (menuChoice == 4) {
                // 4. 프로그램 종료
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("1 ~ 4 사이의 숫자를 입력하세요.");
            }
        }
    }
}
