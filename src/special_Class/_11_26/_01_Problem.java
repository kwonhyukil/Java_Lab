package special_Class._11_26;

import java.util.Scanner;

public class _01_Problem {
    public static void main(String[] args) {
        // Matrix 행
        final int NUM_OF_STUDENTS = 3;
        // Matrix 열
        final int NUM_OF_FIELDS = 6;
        // 학생수 카운트를 위해 변수 선언
        int numOfStudents = 0;
        // 프로그램 종료를 위한 플래그 선언 True로 설정후 반복문을 진행하다 false를 입력하여 반복을 종료하고 프로그램을 종료시킨다.
        boolean isRunning = true;

        // 2차원 배열을 생성한다. [행] [열]
        float[][] stdRecordsMatrix = new float[NUM_OF_STUDENTS][NUM_OF_FIELDS];

        Scanner scan = new Scanner(System.in);

        while (isRunning) {
            // 메뉴를 출력한다.
            System.out.println("메뉴");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 목록 출력");
            System.out.println("3. 학생 삭제하기");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            // 사용자 입력값 저장 변수 선언
            int inputValue = 0;

            // 사용자 입력값이 1 ~ 4 범위 안에 있는지 확인하는 while 문 작성
            while (true) {

                // 사용자 입력
                inputValue = scan.nextInt();
                // 만약 inputValue의 값이 1보다 크거나 같고 4보다 작거나 같을 경우 while 문 탈출
                if (inputValue >= 1 && inputValue <= 4) {
                    break;
                }
                // 아닐경우에는 해당 메시지를 출력 후 재입력 받는다.
                System.out.println("1~4 사이 값을 입력하세요");
            }
            // 사용자 입력 값 ( 1, 2, 3, 4 ) 사이의 숫자를 선택했을 때 실행되어야 한다. ( switch 문 사용 )
            switch (inputValue) {
                // 사용자의 입력 값이 1일 경우
                case 1:
                    System.out.print("학번을 입력하세요: ");
                    stdRecordsMatrix[numOfStudents][0] = scan.nextFloat();

                    System.out.print("국어 성적: ");
                    stdRecordsMatrix[numOfStudents][1] = scan.nextFloat();

                    System.out.print("영어 성적: ");
                    stdRecordsMatrix[numOfStudents][2] = scan.nextFloat();

                    System.out.print("수학 성적: ");
                    stdRecordsMatrix[numOfStudents][3] = scan.nextFloat();

                    stdRecordsMatrix[numOfStudents][4] = stdRecordsMatrix[numOfStudents][1] + stdRecordsMatrix[numOfStudents][2] + stdRecordsMatrix[numOfStudents][3] ;

                    stdRecordsMatrix[numOfStudents][5] = stdRecordsMatrix[numOfStudents][4] / 3.0f;

                    // 입력을 완료하면 학생 수 1명 추가
                    numOfStudents++;
                    break;
                // 사용자의 입력 값이 2일 경우
                case 2:
                    for (int i = 0; i < numOfStudents; i++) {
                        for (int j = 0 ; j < stdRecordsMatrix[i].length; j++) {
                            System.out.print(stdRecordsMatrix[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                // 사용자의 입력 값이 3일 경우
                case 3:
                    break;
                // 사용자의 입력 값이 4일 경우 프로그램을 종료한다.
                case 4:
                    System.out.println("프로그램 종료");
                    // flag를 false 로 바꾸고 전체 while 문을 종료 시킨다.
                    isRunning = false;
                    break;
            }
        }
    }
}