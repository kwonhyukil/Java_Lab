package special_Class._11_27;

import java.util.Scanner;

public class _01_Problem {
    public static void main(String[] args) {

        // 2차원 배열의 초기 크기를 3행 6열로 설정
        final int NUM_OF_STUDENTS = 3;
        final int NUM_OF_FILED = 6;
        // Float 형 2차원 배열 생성
        float[][] stdRecordMatrix = new float[NUM_OF_STUDENTS][NUM_OF_FILED];
        int numStudents = 0;
        int userInput = 0;
        boolean isRunning = true;

        Scanner scan = new Scanner(System.in);
        // 프로그램은 종료 명령 받을 때까지 반복 실행 -> while 문
        while(isRunning){
            // 메뉴 출력
            System.out.println("메뉴");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 목록 출력");
            System.out.println("3. 학생 삭제하기");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            // 사용자 입력
            userInput = scan.nextInt();
            while(true){
                if (userInput >= 1 && userInput <= 4){
                    break;
                }
                System.out.println("1 ~ 4 범위의 숫자를 입력 하세요!");
                userInput = scan.nextInt();
            }
            // 메뉴 1 ~ 4번 까지 선택받을경우 실행 -> switch 문 사용
            switch (userInput){
                case 1:
                    // 학번 입력
                    System.out.print("학번을 입력 하세요: ");
                    stdRecordMatrix[numStudents][0] = scan.nextFloat();
                    // 국어 성적
                    System.out.print("국어 성적: ");
                    stdRecordMatrix[numStudents][1] = scan.nextFloat();
                    // 영어 성적
                    System.out.print("영어 성적: ");
                    stdRecordMatrix[numStudents][2] = scan.nextFloat();
                    // 수학 성적
                    System.out.print("수학 성적: ");
                    stdRecordMatrix[numStudents][3] = scan.nextFloat();
                    // 합계
                    stdRecordMatrix[numStudents][4] = stdRecordMatrix[numStudents][1] + stdRecordMatrix[numStudents][2] + stdRecordMatrix[numStudents][3];
                    // 평균
                    stdRecordMatrix[numStudents][5] = stdRecordMatrix[numStudents][4] / 3;

                    // 입력을 완료하면 학생 수 추가
                    numStudents++;
                    break;
                case 2:
                    for (int i = 0; i < numStudents; i++) {
                        System.out.print("학생 " + (i + 1) + ": ");
                        for (int j = 0 ; j < stdRecordMatrix[i].length; j++){
                            switch (j){
                                case 0:
                                    System.out.print("학번: " + stdRecordMatrix[i][j] + ", ");
                                    break;
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                            }

                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    // 전체 반복문을 종료 하기 위해 flag 변수 사용
                    isRunning = false;
                    break;
            }
        }

        //
    }
}
