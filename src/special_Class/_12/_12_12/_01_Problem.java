package special_Class._12._12_12;


import java.util.Scanner;

public class _01_Problem {

    static void menuPrint(int[][][] argMatrix, int argNum) {
        System.out.println("현재 매트릭스 수: " + argNum);
        System.out.println("===== 메뉴 =====");
        System.out.println("1. 매트릭스 생성");
        System.out.println("2. 생성된 매트릭스 출력");
        System.out.println("3. 2차원 배열로 변환 후 출력");
        System.out.println("4. 매트릭스 삭제");
        System.out.println("5. 종료");
        System.out.print("메뉴 선택: ");
    }
    static void matrixPrint(int[][][] argMatrix) {
        for (int p = 0; p < argMatrix.length; p++) {
            System.out.println("매트릭스 (ID: " + (p + 1) + ")");
            for (int i = 0; i < argMatrix[p].length; i++) {
                for (int j = 0; j < argMatrix[p][i].length; j++) {
                    System.out.print(argMatrix[p][i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int matrixNum = 0;

        int matrixPage = 2;
        int matrixRow = 0;
        int matrixCol = 0;
        // 3차원 배열 생성 초기값 [2][][]
        int[][][] matrix = new int[matrixPage][matrixRow][matrixCol];

        // 삭제 ID
        int delId = 0;

        // 매트릭스 ID 저장
        int matrixId = 0;

        // 메뉴선택
        int menuSelect = 0;

        int count = 0;

        while (true) {
            // 1. 메뉴출력
            menuPrint(matrix,matrixNum);
            // 사용자 입력
            while (true) {
                menuSelect = scan.nextInt();

                if (menuSelect < 1 && menuSelect > 5) {
                    System.out.println("1 ~ 5 사이의 정수를 입력하세요");
                    continue;
                }
                break;
            }
            if (menuSelect == 5) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (menuSelect) {
                case 1:

                    if (matrixId >= matrixPage) {
                        System.out.println("매트릭스 크기를 2에서 4(으)로 확장합니다.");

                    }
                    // 매트릭스 행 (row) 조건 검증
                    while(true) {
                        System.out.print("매트릭스 행 (row) 수를 입력하세요 (1 ~ 10): ");
                        matrixRow = scan.nextInt();
                        if (matrixRow >= 1 && matrixRow <= 10) {
                            break;
                        }
                        System.out.println("1 ~ 10 사이의 정수를 입력하세요");
                    }
                    // 매트릭스 열 (col) 조건 검증
                    while (true) {
                        System.out.print("매트릭스 열 (col) 수를 입력하세요 (1 ~ 10): ");
                        matrixCol = scan.nextInt();
                        if (matrixCol >= 1 && matrixCol <= 10) {
                            break;
                        }
                        System.out.println("1 ~ 10 사이의 정수를 입력하세요");
                    }
                    // page 에 입력한 row, col 크기의 배열 생성

                    matrix[matrixId] = new int[matrixRow][matrixCol];
                    matrixId++;

                    // 초기값 (ID 값 * 10) + 1, 단, [matrixId][0][0] = ID 입력
                    int plus = (matrixId * 10) + 1;
                    for (int p = count; p < matrix.length; p++) {
                        for (int i = 0 ; i < matrix[p].length; i++) {
                            for (int j = 0; j < matrix[p][i].length; j++) {
                                if (i == 0 && j == 0) {
                                    matrix[count][0][0] = matrixId;
                                } else {
                                    matrix[count][i][j] = plus ++;
                                }
                            }
                        }
                    }
                    count++;
                    System.out.println("매트릭스(ID :" + matrixId +")가 생성되었습니다.");
                    matrixNum++;
                    break;
                case 2:
                    matrixPrint(matrix);
                    break;
                case 3:
                    System.out.println("2차원 배열로 변환 후 출력");
                    break;
                case 4:
                    while (true) {
                        System.out.println("현재 생된된 매트릭스 목록");
                        // 생성된 매트릭스 목록
                        System.out.print("삭제할 매트릭스의 ID를 입력하세요: ");
                        delId = scan.nextInt();
                        // 매트릭스 목록 ID 와 delId 와 비교하여 같으면 삭제 처리

                        // 매트릭스 목록 ID 에 delId 가 없을경우 재입력 요구
                        break;
                    }
            }
        }
    }
}
