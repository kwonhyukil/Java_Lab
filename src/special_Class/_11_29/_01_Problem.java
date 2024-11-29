package special_Class._11_29;

import java.util.Scanner;

public class _01_Problem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 학생 성적 float 형 2차원 배열로 관리 ( 3행 6열로 설정 )
        final int NUM_STUDENTS = 3;
        final int NUM_OF_FILED = 6;
        // float 형 2차원 배열 생성
        float[][] stdRecordMatrix = new float[NUM_STUDENTS][NUM_OF_FILED];

        // 학생 수 변수 생성
        int student_num = 0;

        boolean isRunning = true;
        // 입력값 저장 변수
        int userInput = 0;
        // 프로그램은 종료 명령을 받을 때까지 반복 실행 -> while 문 사용
        while (isRunning) {
            // 메뉴 출력
            System.out.println("메뉴");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 목록 출력");
            System.out.println("3. 학생 삭제하기");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            // 사용자 입력
            userInput = scan.nextInt();
            while (true) {
                // 만약 1보다 크거나 같고 4보다 작거나 같을 경우 반복문 탈출
                if (userInput >= 1 && userInput <= 4) {
                    break;
                }
                System.out.println("1 ~ 4 사이의 범위의 숫자를 입력하세요");

            }

            // 메뉴에서 숫자를 입력받아 메뉴 실행 -> switch 문 사용
            switch (userInput) {
                // 사용자의 입력값 1
                case 1:
                    // 학번 입력
                    System.out.print("학번을 입력하세요: ");
                    stdRecordMatrix[student_num][0] = scan.nextFloat();
                    // 국어 성적 입력
                    System.out.print("국어 성적: ");
                    stdRecordMatrix[student_num][1] = scan.nextFloat();
                    // 영어 성적 입력
                    System.out.print("영어 성적: ");
                    stdRecordMatrix[student_num][2] = scan.nextFloat();
                    // 수학 성적 입력
                    System.out.print("수학 성적: ");
                    stdRecordMatrix[student_num][3] = scan.nextFloat();
                    // 합계
                    stdRecordMatrix[student_num][4] = stdRecordMatrix[student_num][1] + stdRecordMatrix[student_num][2] + stdRecordMatrix[student_num][3];
                    // 평균
                    stdRecordMatrix[student_num][5] = stdRecordMatrix[student_num][4] / 3.0f;

                    // 입력을 마치면 학생수 추가
                    student_num++;
                    System.out.println("입력이 완료되었습니다.");
                    break;
                // 사용자의 입력값 2
                case 2:
                    for (int i = 0; i < student_num; i++) {
                        System.out.print("[학번: " + (i + 1) + "]");
                        for (int j = 0; j < stdRecordMatrix[i].length; j++) {
                            switch (j) {
                                case 0:
                                    System.out.print("국어: " + stdRecordMatrix[i][1] + ", ");
                                    break;
                                case 1:
                                    System.out.print("영어: " + stdRecordMatrix[i][2] + ", ");
                                    break;
                                case 2:
                                    System.out.print("수학: " + stdRecordMatrix[i][3] + ", ");
                                    break;
                                case 3:
                                    System.out.print("합계: " + stdRecordMatrix[i][4] + ", ");
                                    break;
                                case 4:
                                    System.out.print("평균: " + stdRecordMatrix[i][5]);
                                    break;
                            }
                        }
                        System.out.println();
                    }
                    break;
                // 사용자의 입력값 3
                case 3:
                    break;
                // 사용자의 입력값 4
                case 4:
                    System.out.println("프로그램 종료");
                    // 반복문 종료
                    isRunning = false;
                    break;

            }

        }

    }
}
