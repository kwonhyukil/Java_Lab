package special_Class._12._12_04;

import java.util.Scanner;

public class _01_Problem {

    static void menuList() {
        System.out.println("---------------------");
        System.out.println("1. 학생 성적 입력");
        System.out.println("2. 입력된 학생 목록 출력");
        System.out.println("3. 학생 삭제");
        System.out.println("4. 종료");
        System.out.print("선택: ");

    }

    public static void main(String[] args) {
        final int NUM_FIELD = 6; // 학번, 국어, 영어, 수학, 합계, 평균
        final int MAX_STUDENT = 3; // 최대 학생수 3번으로 지정
        int studentNum = 0;
        float[][] studentsMatrix = new float[MAX_STUDENT][NUM_FIELD];
        String[] fieldTitles = {"학번", "국어", "영어", "수학", "합계", "평균"};
        Scanner scan = new Scanner(System.in);
        int userChoice = -1;

        while (true) {
            menuList();
            userChoice = scan.nextInt();

            if (userChoice < 1 || userChoice > 4) {
                System.out.println("1 ~ 4 사이의 숫자를 입력 하세요 !!");
                continue;
            }
            if (userChoice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            int result = -1;

            switch (userChoice) {
                case 1: // 학생 성적입력


            }
        }

    }
}
