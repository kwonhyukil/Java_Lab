package special_Class._12._12_09;

import java.util.Scanner;

public class _02_Problem {

    static void menuPrint() {
        System.out.println("=== 메뉴 ===");
        System.out.println("1. 학생 성적 입력");
        System.out.println("2. 입력된 학생 목록 출력");
        System.out.println("3. 학생 삭제하기");
        System.out.println("4. 프로그램 종료");
        System.out.print("선택: ");
    }
    static int createMatrix(float[][] argMatrix, String[] subject, int studentNum){
        Scanner scan = new Scanner(System.in);
        float inputValue;


        for (int i = 0; i < argMatrix[studentNum].length - 2; i++) {
            System.out.print(subject[i] + "를 입력하세요: ");
            inputValue = scan.nextFloat();
            argMatrix[studentNum][i] = inputValue;
        }
        argMatrix[studentNum][4] = argMatrix[studentNum][1] + argMatrix[studentNum][2] + argMatrix[studentNum][3];
        argMatrix[studentNum][5] = argMatrix[studentNum][4] / 3.0f;


        return ++studentNum;
    }

    static void printMatrix(float[][] argMatrix, String[] argSubject) {

        for (int i = 0; i < argMatrix.length; i++) {
            System.out.print("[학번: " + (i+1) +"]");
            for (int j = 0; j < argMatrix[i].length; j++) {
                System.out.print(" " + argSubject[j] + argMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 초기 크기 3행 6열로 설정
        final int MAX_ROW = 3;
        final int MAX_COL = 6;
        // 2차원 배열 생성
        float[][] studentList = new float[MAX_ROW][MAX_COL];
        // 학생 수
        int studentNum = 0;
        // 메뉴 선택
        int menuSelect;
        String[] subjectList = {"학번", "국어", "영어", "수학", "합계", "평균"};

        while (true) {
            menuPrint();
            menuSelect = scan.nextInt();
            if (menuSelect < 1 || menuSelect > 4) {
                System.out.println("1 ~ 4 사이의 수를 입력하세요");
                continue;
            }
            if (menuSelect == 4) {
                System.out.println("프로그램 종료");
                break;
            }
            int result = -1;
            switch (menuSelect) {
                case 1:
                    result = createMatrix(studentList, subjectList, studentNum);
                    if (result > 0) {
                        studentNum = result;
                    } else {
                        System.out.println("학생 성적 입력 오류");
                    }
                    break;
                case 2:
                    if (studentList == null) {
                        System.out.println("학생 목록이 없습니다.");
                    } else {
                        // 학생 목록 출력
                        printMatrix(studentList, subjectList);
                    }
                    break;
                case 3:
                    break;
            }
        }
    }

}

