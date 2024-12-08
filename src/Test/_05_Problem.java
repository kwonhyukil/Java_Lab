package Test;

import java.util.Random;
import java.util.Scanner;

public class _05_Problem {
    static void menuPrint(){
        System.out.println("===== 빙고 게임 메뉴 =====");
        System.out.println("1. 빙고판 생성");
        System.out.println("2. 숫자별 발생 빈도 분석");
        System.out.println("3. 빙고판 출력");
        System.out.println("4. 프로그램 종료");
        System.out.print("메뉴 선택: ");
    }

     static boolean numCheck (int num, int rowColNum){
        int[] array = new int[rowColNum * rowColNum];

        for (int i = 0; i < array.length; i++) {
            for(int value : array){
                if(num != value){
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
     }

    static void bingoMatrixMade(int[][][] matrix, int rowCol, int page, int start, int end){
        matrix = new int[page][rowCol][rowCol];
        Random random = new Random();
        int randomNumber;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[j].length; j++) {
                for (int k = 0; k < matrix[j][k].length; k++) {
                    randomNumber = random.nextInt(end-start) + start;
                    boolean result;
                    result = numCheck(randomNumber, rowCol);
                    if (result){
                        matrix[i][j][k] = randomNumber;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[j][k].length; k++) {
                    System.out.println(matrix[i][j][k] + "\t");
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        // 메뉴 선택 변수
        int menuChoice = 0;
        // 빙고판 크기 N
        int matrixRowCol = 0;
        // 빙고판 갯수 M
        int matrixNum = 0;
        // 난수 범위의 시작값
        int startNum = 0;
        // 난수 범위의 종료값
        int endNum = 0;

        int[][][] bingoMatrix = new int[matrixNum][matrixRowCol][matrixRowCol];

        while (true) {
            // 메뉴 출력
            menuPrint();
            menuChoice = scan.nextInt();

            if (menuChoice < 1 || menuChoice > 4) {
                System.out.println("1 ~ 4 사이의 숫자를 입력 하세요");
                continue;
            }
            if (menuChoice == 4) {
                System.out.println("프로그램 종료");
                break;
            }

            switch (menuChoice) {
                case 1:
                    while (true) {

                        while (true) {
                            System.out.print("빙고 매트릭스의 N 값을 입력 하세요 (3 이상 9 이하 홀수): ");
                            matrixRowCol = scan.nextInt();
                            if (matrixRowCol % 2 == 1) {
                                break;
                            } else {
                                System.out.println("N 값은 3이상 9이하 정수 중 홀수 값만 입력 가능 합니다.");
                            }
                        }
                        while (true){
                            System.out.print("난수 범위의 시작 값을 입력 하세요: ");
                            startNum = scan.nextInt();
                            System.out.print("난수 범위의 종료 값을 입력 하세요: ");
                            endNum = scan.nextInt();
                            if (matrixRowCol * matrixRowCol <= endNum - startNum) {
                                break;
                            } else {
                                System.out.println("종료 값 - 시작 값이 N x N 보다 크거나 같아야 합니다.");
                            }
                        }
                        while (true){
                            System.out.print("작성할 빙고 매트릭스 수 M을 입력 하세요 (1 이상 7 이하): ");
                            matrixNum = scan.nextInt();
                            if (matrixNum >= 1 && matrixNum <= 7){
                                break;
                            } else {
                                System.out.println("M 값은 1이상 7이하 양수만 입력 가능 합니다.");
                            }
                        }
                        bingoMatrixMade(bingoMatrix, matrixRowCol, matrixNum,startNum,endNum);
                        // 빙고판 생성 메소드 호출
                    }
                case 2:
                    System.out.println("숫자별 발생 빈도 분석");
                    break;
                case 3:
                    System.out.println("빙고판 출력");
                    break;

            }

        }
    }
}
