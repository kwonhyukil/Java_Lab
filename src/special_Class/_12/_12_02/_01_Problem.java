//package special_Class._12._12_02;
//
//import java.util.Scanner;
//
//public class _01_Problem {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        // 2차원 배열의 초기 크기를 3행 6열로 설정
//        final int STUDENT_NUMS = 3;
//        final int STUDENT_GRADE = 6;
//        // 학생 성적은 float형 2차원 배열로 관리 -> 2차원 배열 생성
//        //                                           3              6
//        float[][] studentScoreList = new float[STUDENT_NUMS][STUDENT_GRADE];
//        int studentNum = 0;
//        // 종료 명령을 받을 때까지 반복 실행 -> while 문 사용
//        while (true) {
//            // 메뉴 출력
//            System.out.println("메뉴");
//            System.out.println("1. 학생 성적 입력");
//            System.out.println("2. 입력된 학생 목록 출력");
//            System.out.println("3. 학생 삭제 하기");
//            System.out.println("4. 종료");
//            System.out.print("선택: ");
//            // 사용자가 숫자를 입력하면 해당 숫자에 해당하는 메뉴 실행
//            int userChoice = scan.nextInt();
//
//            String[] menuList = {"학번을 입력 하세요: ", "국어 성적: ", "영어 성적: ", "수학 성적: "};
//            String[] scoreList = {"학번: ", "국어: ", "영어: ", "수학: ", "합계: ", "평균: "};
//            switch (userChoice) {
//                case 1:
//                    // 학생 학번, 성적 입력 알고리즘 작성
//                    for (int i = 0; i < studentNum; i++) {
//                        for (int j = 0; j < menuList.length; j++) {
//                            System.out.print(menuList[j]);
//                            studentScoreList[i][j] = scan.nextFloat();
//                        }
//                    }
//                    // 합계
//                    studentScoreList[studentNum][4] = studentScoreList[studentNum][1] + studentScoreList[studentNum][2] + studentScoreList[studentNum][3];
//                    // 평균
//                    studentScoreList[studentNum][5] = studentScoreList[studentNum][4] / 3.0f;
//                    // 입력 완료시 학생 수 추가
//                    studentNum++;
//                    break;
//                case 2:
//                    for (int i = 0; i < studentNum; i++) {
//                        System.out.print(scoreList[0] + studentScoreList[i][i]);
//                        for (int j = 0; j < studentScoreList[i].length - 1; j++) {
//                            System.out.print(scoreList[j + 1] + studentScoreList[i][j + 1]);
//                        }
//                        System.out.println();
//                    }
//                    // 2차원 배열에 입력된 학생 수만큼 반복하여 입력된 학생 목록 출력
//                    break;
//                case 3:
//                    while (true) {
//                        for (int i = 0; i < studentNum; i++) {
//                            System.out.print(scoreList[0] + studentScoreList[i][i]);
//                            for (int j = 0; j < studentScoreList[i].length - 1; j++) {
//                                System.out.print(scoreList[j + 1] + studentScoreList[i][j + 1]);
//                            }
//                            System.out.println();
//                        }
//
//                    }
//                    break;
//                case 4:
//                    // 프로그램 종료 -> 전체 반복문 종료 필요
//                    break;
//
//            }
//        }
//
//    }
//}
//
