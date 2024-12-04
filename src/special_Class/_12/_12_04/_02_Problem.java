package special_Class._12._12_04;


import java.util.Scanner;

public class _02_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 2차원 배열의 초기 크기를 3행 6열로 설정
        final int STUDENT_NUMS = 3;
        final int STUDENT_GRADE = 6;
        // 학생 성적은 float형 2차원 배열로 관리 -> 2차원 배열 생성
        //                                           3              6
        float[][] studentScoreList = new float[STUDENT_NUMS][STUDENT_GRADE];
        int studentNum = 0;
        boolean isrunning = true;
        // 종료 명령을 받을 때까지 반복 실행 -> while 문 사용
        while (isrunning){
            // 메뉴 출력
            System.out.println("메뉴");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 목록 출력");
            System.out.println("3. 학생 삭제 하기");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            // 사용자가 숫자를 입력하면 해당 숫자에 해당하는 메뉴 실행
            int userChoice = scan.nextInt();

            String[] scoreList = {"학번: ", "국어: ", "영어: ", "수학: ", "합계: ", "평균: "};
            switch(userChoice) {
                case 1:
                    // 학생 학번, 성적 입력 알고리즘 작성
                    System.out.print("학번을 입력하세요: ");
                    studentScoreList[studentNum][0] = scan.nextFloat();
                    System.out.print("국어 성적: ");
                    studentScoreList[studentNum][1] = scan.nextFloat();
                    System.out.print("영어 성적: ");
                    studentScoreList[studentNum][2] = scan.nextFloat();
                    System.out.print("수학 성적: ");
                    studentScoreList[studentNum][3] = scan.nextFloat();
                    // 합계
                    studentScoreList[studentNum][4] = studentScoreList[studentNum][1] + studentScoreList[studentNum][2] + studentScoreList[studentNum][3];
                    // 평균
                    studentScoreList[studentNum][5] = studentScoreList[studentNum][4] / 3.0f;
                    // 입력 완료시 학생 수 추가
                    studentNum++;
                    System.out.println("입력이 완료되었습니다.");
                    break;
                case 2:
                    if (studentNum == 0){
                        System.out.println("입력된 학생 정보가 없습니다.");
                        break;
                    }
                    else {
                        for (int i = 0; i < studentNum; i++) {
                            System.out.print("[학생 " + studentNum + "]");
                            System.out.print(scoreList[0] + studentScoreList[i][i]);
                            for (int j = 0; j < studentScoreList[i].length - 1; j++) {
                                if (j == 0) {
                                    studentScoreList[i][j] = (int) studentScoreList[i][j];
                                }
                                System.out.print(scoreList[j + 1] + studentScoreList[i][j + 1]);
                            }
                            System.out.println();
                        }
                    }
                    break;
                // 2차원 배열에 입력된 학생 수만큼 반복하여 입력된 학생 목록 출력
                case 3:
                    int delindex = -1;
                    while(true){
                        for (int i = 0; i < studentNum; i++) {
                            System.out.print("[학생 " + studentNum + "]");
                            System.out.print(scoreList[0] + studentScoreList[i][i]);
                            for (int j = 0; j < studentScoreList[i].length - 1; j++) {
                                if (j == 0) {
                                    studentScoreList[i][j] = (int) studentScoreList[i][j];
                                }
                                System.out.print(scoreList[j + 1] + studentScoreList[i][j + 1]);
                            }
                            System.out.println();
                        }
                        System.out.println("삭제할 학생의 학번을 입력하세요 (-1: 이전 메뉴로): ");
                        int delStudent = scan.nextInt();
                        if (delindex == -1){
                            break;
                        }
                        // 학번 검색
                        for (int i = 0; i < studentNum; i++) {
                            if ((int)studentScoreList[i][0] == delStudent){
                                delindex = i;
                                break;
                            }
                        }
                        // 삭제된 학생 이후 데이터 이동
                        for (int i = delindex; i < studentNum - 1; i++) {
                            for (int j = 0; j < studentScoreList[i].length; j++) {
                                studentScoreList[i][j] = studentScoreList[i + 1][j];
                            }
                        }
                        for (int i = 0; i < studentScoreList[0].length; i++) {
                            studentScoreList[studentNum - 1][i] = 0.0f;
                        }
                        --studentNum;

                    }
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    isrunning = false;
                    // 프로그램 종료 -> 전체 반복문 종료 필요
                    break;
            }

        }
    }
}
