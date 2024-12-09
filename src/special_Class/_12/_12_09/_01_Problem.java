package special_Class._12._12_09;

import java.util.Scanner;
import java.util.Random;

public class _01_Problem {

    static void menuPrint() {
        System.out.println("===== 빙고 게임 메뉴 =====");
        System.out.println("1. 빙고판 생성");
        System.out.println("2. 숫자별 발생 빈도 분석");
        System.out.println("3. 빙고판 출력");
        System.out.println("4. 종료");
        System.out.print("메뉴 선택: ");
    }
    //static int[][][] createMatrix(int[][][] argMatrix,int argMatrixM,int argMatrixN,int argStart, int argEnd) {
    static int[][][] createMatrix(int argMatrixM,int argMatrixN,int argStart, int argEnd) {

        Random random = new Random();
        int[][][] matrix = new int[argMatrixM][argMatrixN][argMatrixN];
        int[][] checkMatrix = new int[argMatrixN][argMatrixN];
        int randomNum;

        // 랜덤 숫자 생성하여 3차원 배열에 저장
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    // 랜덤 숫자를 생성할 때 중복 값 검증 알고리즘 필요
                    // 랜덤 숫자를 생성하여 배열에 저장한 후 순회하여 중복 값이 있을경우 재생성 해야한다. -> 언제 중복값이 아닌 수가 나올지 모르니 while 문 사용
                    // 검증이 완료된 숫자를 배열에 저장
                    boolean isRunning = true;
                    while (isRunning) {
                        randomNum = random.nextInt(argEnd - argStart + 1) + argStart;
                        isRunning = false;
                        for (int a = 0; a < checkMatrix.length; a++) {
                            for (int b = 0; b < checkMatrix[a].length; b++) {
                                if (checkMatrix[a][b] == randomNum) {
                                    isRunning = true;
                                    break;
                                }
                            }
                            if (isRunning == true) {
                                break;
                            }
                        }
                        // 검증이 완료된 숫자를 배열에 저장
                        checkMatrix[j][k] = randomNum;
                    }
                    // 배열에 저장되는 숫자를 1차원 배열을 만들어 저장하는 알고리즘 작성 : index(randomNum - start)
                }
                matrix[i] = checkMatrix;
            }
        }

        return matrix;
    }
	static void numberFrequency(int[][][] argMatrix, int argMatrixM, int argMatrixN,int start, int end) {
		System.out.println("=== 숫자별 발생 빈도 ===");
		int[][][] frequency = new int[argMatrixM][argMatrixN][argMatrixN];
		int[] randomNumberCount = new int[end - start + 1];

		for (int i = 0; i < frequency.length; i++) {
			for (int j = 0; j < frequency[i].length; j++) {
				for (int k = 0; k < frequency[i][j].length; k++) {

				}
			}
		}
	}


    static void printMatrix(int[][][] argMatrix,int argMatrixM,int argMatrixN) {

        // bingoMatrix 주소값을 불러와 순회하여 출력
        for (int i = 0; i < argMatrix.length; i++) {
            System.out.println("빙고 매트릭스 #" + (i+1));
            for (int j = 0; j < argMatrix[i].length; j++) {
                for (int k = 0; k < argMatrix[i][j].length; k++) {

                    System.out.print(" " + argMatrix[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        // 메뉴 선택
        int menuSelect = 0;
        // matrix 갯수
        int matrixM = 0;
        // matrix N x N
        int matrixN = 0;
        // matrix 3차원 배열
        int[][][] bingoMatrix ;
        // 난수 시작 값
        int startNum;
        // 난수 종료 값
        int endNum;


        while (true) {
            menuPrint();
            menuSelect = scan.nextInt();
            // 만약 menuSelect가 1 미만 4 초과일 경우 재입력받는다
            if (menuSelect < 1 || menuSelect > 4) {
                System.out.println("1 ~ 4 사이의 숫자를 입력하세요");
                continue;
            }
            // 만약 menuSelect가 4일 경우 프로그램을 종료시킨다. break.
            if (menuSelect == 4) {
                System.out.println("프로그램 종료");
                break;
            }

            switch (menuSelect) {
                case 1:
                    // 빙고판 생성
                    // 빙고판 크기 : N >= 3 && N <= 9 이외값 재입력 처리 -> while 문 사용
                    while (true) {
                        System.out.print("빙고 매트릭스의 N 값을 입력 하세요 (3 이상 9 이하 홀수): ");
                        matrixN = scan.nextInt();
                        if (matrixN >= 3 && matrixN <= 9 && matrixN % 2 == 1) {
                            break;
                        }
                        System.out.println("N 값은 3이상 9이하 정수 중 홀수 값만 일력 가능합니다.");
                    }
                    // 난수 범위 (시작값, 종료 값) 입력 받기 -> (endNum - startNum + 1) >= N x N 조건미달 재입력 처리 -> while 문 사용
                    while (true) {
                        System.out.print("난수 범위의 시작값을 입력하세요: ");
                        startNum = scan.nextInt();
                        System.out.print("난수 범위의 종료값을 입력하세요: ");
                        endNum = scan.nextInt();
                        if (endNum - startNum >= matrixN * matrixN) {
                            break;
                        }
                        System.out.println("종료 값 - 시작 값이 N x N 보다 크거나 같아야 합니다.");
                    }
                    // 빙고 매트릭스 수 : M >= 1 && M <= 7 이외 값 재입력 처리 -> while 문 사용
                    while (true) {
                        System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요 (1 이상 7 이하): ");
                        matrixM = scan.nextInt();
                        if (matrixM >= 1 && matrixM <= 7) {
                            break;
                        }
                        System.out.println("M 값은 1이상 7이하 양수만 입력 가능합니다.");
                    }
                    // 중복되지 않은 숫자 M개의 N x N 빙고판 생성 메소드 호출하여 bingoMatrix에 주소값을 저장
                    bingoMatrix = createMatrix(matrixM,matrixN,startNum,endNum);
                    System.out.println("빙고 매트릭스가 생성되었습니다.");
                    break;
                case 2:
                    // 숫자별 발생 빈도 분석
                  //  numberFrequency(bingoMatrix,matrixM,matrixN);
                    break;
                case 3:
                    // 생성된 3차원 배열 주소값, 배열의 크기를 인자값으로 매개변수에 전달
                    //printMatrix(bingoMatrix,matrixM,matrixN,startNum,endNum);
                    // 빙고판 출력
                    break;
            }

        }
    }
}

