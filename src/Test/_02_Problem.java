package Test;

import java.util.Random;
import java.util.Scanner;


public class _02_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menuChoice;
        int bingoMatrix;
        int startNum;
        int endNum;
        int bingoMatrixNum;
        int[][][] bingoBoard;

        System.out.println("===== 빙고 게임 메뉴 =====");
        System.out.println("1. 빙고판 생성");
        System.out.println("2. 숫자별 발생 빈도 분석");
        System.out.println("3. 빙고판 출력");
        System.out.println("4. 종료");
        System.out.print("메뉴 선택: ");
        menuChoice = scan.nextInt();

        switch (menuChoice) {
            case 1:
                while (true) {
                    // 빙고 Matrix의 N 값 입력
                    System.out.print("빙고 Matrix의 N 값을 입력 하세요 (3 이상 9 이하 홀수): ");
                    bingoMatrix = scan.nextInt();

                    if (bingoMatrix < 3 || bingoMatrix > 9 || bingoMatrix % 2 == 0) {
                        System.out.println("N 값은 3 이상 9 이하의 홀수여야 합니다.");
                        continue;
                    }

                    // 난수 범위 입력
                    while (true) {
                        System.out.print("난수 범위의 시작 값을 입력하세요: ");
                        startNum = scan.nextInt();
                        System.out.print("난수 범위의 종료 값을 입력하세요: ");
                        endNum = scan.nextInt();

                        if ((endNum - startNum + 1) < bingoMatrix * bingoMatrix) {
                            System.out.println("종료 값 - 시작 값이 N x N 보다 크거나 같아야 합니다.");
                            continue;
                        }

                        // 빙고 매트릭스 수 입력
                        System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요 (1 이상 7 이하): ");
                        bingoMatrixNum = scan.nextInt();

                        if (bingoMatrixNum < 1 || bingoMatrixNum > 7) {
                            System.out.println("M 값은 1 이상 7 이하의 값이어야 합니다.");
                            continue;
                        }

                        // 빙고 보드 배열 초기화
                        bingoBoard = new int[bingoMatrixNum][bingoMatrix][bingoMatrix];

                        // 빙고 매트릭스 생성
                        for (int i = 0; i < bingoMatrixNum; i++) {
                            System.out.println("빙고 매트릭스 " + (i + 1) + ":");
                            generateUniqueBingoBoard(bingoBoard[i], bingoMatrix, startNum, endNum);
                            printBingoBoard(bingoBoard[i]);
                        }

                        // 조건 충족 시 외부 반복 종료
                        break;
                    }
                    break;
                }
                break;

            default:
                System.out.println("올바른 메뉴를 선택하세요.");
        }

        scan.close();
    }

    // 중복되지 않는 빙고 보드 생성 (배열 순회 방식)
    private static void generateUniqueBingoBoard(int[][] board, int matrixSize, int start, int end) {
        Random random = new Random();
        int totalNumbers = matrixSize * matrixSize;
        int[] uniqueNumbers = new int[totalNumbers];
        int count = 0;

        while (count < totalNumbers) {
            int number = random.nextInt(end - start + 1) + start; // 난수 생성
            boolean isDuplicate = false;

            // 중복 확인
            for (int i = 0; i < count; i++) {
                if (uniqueNumbers[i] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            // 중복이 아니면 배열에 추가
            if (!isDuplicate) {
                uniqueNumbers[count++] = number;
            }
        }

        // 1차원 배열을 2차원 배열로 변환
        int index = 0;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                board[i][j] = uniqueNumbers[index++];
            }
        }
    }

    // 빙고 보드 출력
    private static void printBingoBoard(int[][] board) {
        for (int[] row : board) {
            for (int number : row) {
                System.out.print(number + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
