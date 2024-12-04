package special_Class._11._11_25;

import java.util.Scanner;

public class _01_Problem {
    public static void main(String[] args) {

        // 3 X 6 Matirx(float)
        final int STUDENT_NUM = 3;
        final int GRADE_NUM = 6;
        int userChoice = 0;
        int studentNum = 0;

        // 배열 생성
        float[][] stdRecordMatrix = new float[STUDENT_NUM][GRADE_NUM];

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("메뉴");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 목록 출력");
            System.out.println("3. 학생 삭제하기");
            System.out.println("4. 프로그램 종료");
            System.out.print("선택: ");

            userChoice = scan.nextInt();

            while (true) {
                userChoice = scan.nextInt();
                if (userChoice >= 1 && userChoice <= 4) {
                    break;
                }
                System.out.println("1~4 사이의 숫자를 입력 하세요");
            }
            // 메뉴 선택
            switch (userChoice) {
                // 1번 선택시 학생 성적 입력
                case 1:
                    System.out.print("학번을 입력하세요: ");
                    stdRecordMatrix[0][0] = scan.nextFloat();
                    System.out.print("국어 성적: ");
                    stdRecordMatrix[0][1] = scan.nextFloat();
                    System.out.print("영어 성적: ");
                    stdRecordMatrix[0][2] = scan.nextFloat();
                    System.out.print("수학 성적: ");
                    stdRecordMatrix[0][3] = scan.nextFloat();
                    // 합계
                    stdRecordMatrix[0][4] = stdRecordMatrix[0][1] + stdRecordMatrix[0][2] + stdRecordMatrix[0][3];
                    // 평균
                    stdRecordMatrix[0][5] = stdRecordMatrix[0][4] / 3;
                    System.out.println("입력이 완료되었습니다.");
                    break;
                // 2번 선택시 입력된 학생 목록 출력
                case 2:
                    for (int i = 0; i < studentNum; i++) {
                        for (int j = 0; j < stdRecordMatrix[i].length; j++) {}

                    }
                    break;
                // 3번 선택시 학생 삭제하기
                case 3:
                    break;
                // 4번 선택시 프로그램 종료
                case 4:
                    break;
            }
        }
    }
}

//       학번 국어 영어 수학 합계 평균
// 학생1   0   0   0   0    p   p
// 학생2
// 학생3

//        // Scanner 입력
//        // 학번 입력 - 학생 1
//        stdRecordMatrix[0][0] = scan.nextFloat();
//        // 국어 점수 입력
//        stdRecordMatrix[0][1] = scan.nextFloat();
//        // 영어 점수 입력
//        stdRecordMatrix[0][2] = scan.nextFloat();
//        // 수학 점수 입력
//        stdRecordMatrix[0][3] = scan.nextFloat();
//        // 합계 점수 입력
//        stdRecordMatrix[0][4] = stdRecordMatrix[0][1] + stdRecordMatrix[0][2] + stdRecordMatrix[0][3];
//        // 평균 점수 입력
//        stdRecordMatrix[0][5] = stdRecordMatrix[0][4] / 3;
//

//
//        // 학번 입력 - 학생 2
//        stdRecordMatrix[1][0] = scan.nextFloat();
//        // 국어 점수 입력
//        stdRecordMatrix[1][1] = scan.nextFloat();
//        // 영어 점수 입력
//        stdRecordMatrix[1][2] = scan.nextFloat();
//        // 수학 점수 입력
//        stdRecordMatrix[1][3] = scan.nextFloat();
//        // 합계 점수 입력
//        stdRecordMatrix[1][4] = stdRecordMatrix[1][1] + stdRecordMatrix[1][2] + stdRecordMatrix[1][3];
//        // 평균 점수 입력
//        stdRecordMatrix[1][5] = stdRecordMatrix[0][4] / 3;


// 메뉴 출력
// 1. 학생 성적 입력
// 2. 입력된 학생 목록 출력
// 3. 학생 삭제하기
// 4. 종료

// 사용자 메뉴 선택 ==> switch 사용
// 선택 : ---   ==> 사용자 선택값

// 만약 이외의 값을 입력할 경우 "잘못된 입력입니다. 다시 선택해주세요."

// 메뉴 선택 == 1 ( 학생 성적 입력 )
// 학번을 입력하세요
// 국어 성적
// 영어 성적
// 수학 성적
// 입력이 완료되었습니다. --> 탈출

// 메뉴 선택 == 2 ( 입력된 학생 목록 출력 )
//    0       1        2          3         4        5
// [학번 -]   국어      영어       수학       합계      평균
//

// 사용자 메뉴 선택
// 선택 : ---   ==> 사용자 선택값
// 만약 이외의 값을 입력할 경우 "잘못된 입력입니다. 다시 선택해주세요."

// 3. 학생 삭제
// 학생 목록 출력
// 삭제할 학생의 학번을 입력받는다
// 학번 존재시 : 해당 학생의 데이터를 삭제하고 "삭제가 완료되었습니다." 메시지 출력
// 학번 미존재 시 : "해당 학번이 존재하지 않습니다." 다시입력해주세요 메시지 출력
// 사용자가 -1 을 입력시 삭제 메뉴 탈출 -> 전체 메뉴로 복귀
// 삭제 완료 후 업데이트된 목록 출력