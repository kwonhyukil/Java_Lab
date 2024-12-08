package Test;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class _06_Problem {

    // 빙고 매트릭스 저장
    private static int[][][] bingoMatrix;
    private static int matrixRowCol;
    private static int matrixNum;
    private static int startNum;
    private static int endNum;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            printMenu();
            int menuChoice = scan.nextInt();

            switch (menuChoice) {
                case 1:
                    createBingoMatrix(scan);
                    break;
                case 2:
                    analyzeFrequency();
                    break;
                case 3:
                    printBingoMatrix();
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("1 ~ 4 사이의 숫자를 입력하세요.");
            }
        }
    }

    // 메뉴 출력
    private static void printMenu() {
        System.out.println("===== 빙고 게임 메뉴 =====");
        System.out.println("1. 빙고판 생성");
        System.out.println("2. 숫자별 발생 빈도 분석");
        System.out.println("3. 빙고판 출력");
        System.out.println("4. 프로그램 종료");
        System.out.print("메뉴 선택: ");
    }

    // 빙고판 생성
    private static void createBingoMatrix(Scanner scan) {
        // N 값 입력
        while (true) {
            System.out.print("빙고 매트릭스의 N 값을 입력하세요 (3 이상 9 이하 홀수): ");
            matrixRowCol = scan.nextInt();
            if (matrixRowCol >= 3 && matrixRowCol <= 9 && matrixRowCol % 2 == 1) break;
            System.out.println("N 값은 3 이상 9 이하의 홀수만 가능합니다.");
        }

        // 난수 범위 입력
        while (true) {
            System.out.print("난수 범위의 시작 값을 입력하세요: ");
            startNum = scan.nextInt();
            System.out.print("난수 범위의 종료 값을 입력하세요: ");
            endNum = scan.nextInt();
            if (matrixRowCol * matrixRowCol <= endNum - startNum) break;
            System.out.println("종료 값 - 시작 값이 N x N 보다 크거나 같아야 합니다.");
        }

        // 빙고 매트릭스 수 입력
        while (true) {
            System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요 (1 이상 7 이하): ");
            matrixNum = scan.nextInt();
            if (matrixNum >= 1 && matrixNum <= 7) break;
            System.out.println("M 값은 1 이상 7 이하의 값만 가능합니다.");
        }

        // 빙고 매트릭스 생성
        bingoMatrix = new int[matrixNum][matrixRowCol][matrixRowCol];
        Random random = new Random();

        for (int p = 0; p < matrixNum; p++) {
            HashMap<Integer, Boolean> usedNumbers = new HashMap<>();
            for (int i = 0; i < matrixRowCol; i++) {
                for (int j = 0; j < matrixRowCol; j++) {
                    int randomNumber;
                    do {
                        randomNumber = random.nextInt(endNum - startNum + 1) + startNum;
                    } while (usedNumbers.containsKey(randomNumber));
                    usedNumbers.put(randomNumber, true);
                    bingoMatrix[p][i][j] = randomNumber;
                }
            }
        }
        System.out.println("빙고 매트릭스 생성 완료!");
    }

    // 숫자별 발생 빈도 분석
    private static void analyzeFrequency() {
        if (bingoMatrix == null) {
            System.out.println("먼저 빙고판을 생성하세요.");
            return;
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int[][] matrix : bingoMatrix) {
            for (int[] row : matrix) {
                for (int num : row) {
                    frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
                }
            }
        }

        System.out.println("===== 숫자별 발생 빈도 =====");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + ": " + frequencyMap.get(key) + "번");
        }
    }

    // 빙고판 출력
    private static void printBingoMatrix() {
        if (bingoMatrix == null) {
            System.out.println("먼저 빙고판을 생성하세요.");
            return;
        }

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
}
