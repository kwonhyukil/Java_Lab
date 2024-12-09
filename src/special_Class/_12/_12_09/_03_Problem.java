package special_Class._12._12_09;

import java.util.Scanner;

public class _03_Problem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int STU_CON = 0;  // 현재 학생 수
        int SCO_NUM = 6;   // 각 학생의 데이터 항목 수 (학번, 국어, 영어, 수학, 합계, 평균)

        float[][] sco_li = new float[1][SCO_NUM]; // 초기 학생 데이터 배열 크기는 1행 6열로 설정

        while (true) {
            System.out.println("매뉴");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 출력");
            System.out.println("3. 학생 삭제 하기");
            System.out.println("4. 종료");

            System.out.print("선택 : ");
            int menu = sc.nextInt();
            System.out.println();

            if (menu == 1) {
                // 학생 수가 배열 크기를 초과할 경우, 배열을 2배로 확장
                if (sco_li.length <= STU_CON) {
                    int newSize = sco_li.length * 2;
                    float[][] new_sco_li = new float[newSize][SCO_NUM];

                    for (int i = 0; i < sco_li.length; i++) {
                        new_sco_li[i] = sco_li[i];
                    }
                    sco_li = new_sco_li;
                    System.out.println("배열이 확장되었습니다. 새로운 크기: " + newSize + "행");
                }

                int stu_TF_idx = -1;

                System.out.print("학번 입력 : ");
                int studentId = sc.nextInt();

                // 학생 중복 확인
                for (int i = 0; i < STU_CON; i++) {
                    if (sco_li[i][0] == studentId) {
                        stu_TF_idx = i;
                        break;
                    }
                }

                if (stu_TF_idx == -1) { // 새로운 학생일 경우
                    // 학생 정보 입력
                    sco_li[STU_CON][0] = studentId;
                    System.out.print("국어 성적 : ");
                    sco_li[STU_CON][1] = sc.nextInt();

                    System.out.print("영어 성적 : ");
                    sco_li[STU_CON][2] = sc.nextInt();

                    System.out.print("수학 성적 : ");
                    sco_li[STU_CON][3] = sc.nextInt();

                    // 합계와 평균 계산
                    sco_li[STU_CON][4] = sco_li[STU_CON][1] + sco_li[STU_CON][2] + sco_li[STU_CON][3];
                    sco_li[STU_CON][5] = sco_li[STU_CON][4] / 3;

                    STU_CON++;
                    System.out.println("입력이 완료되었습니다.");
                } else {
                    // 중복된 학번이 있을 경우
                    System.out.println("중복된 입력입니다.");
                    while (true) {
                        System.out.print("덮어쓰기를 희망합니까? (Y : 덮어쓰기 진행 , Q : 매뉴로 돌아가기) : ");
                        String yq = sc.next().toLowerCase();

                        if (yq.equals("q")) {
                            System.out.println("입력이 취소됩니다. 매뉴로 돌아갑니다.");
                            break;
                        } else if (yq.equals("y")) {
                            // 덮어쓰기 진행
                            System.out.print("국어 성적 : ");
                            sco_li[stu_TF_idx][1] = sc.nextInt();

                            System.out.print("영어 성적 : ");
                            sco_li[stu_TF_idx][2] = sc.nextInt();

                            System.out.print("수학 성적 : ");
                            sco_li[stu_TF_idx][3] = sc.nextInt();

                            // 합계와 평균 계산
                            sco_li[stu_TF_idx][4] = sco_li[stu_TF_idx][1] + sco_li[stu_TF_idx][2] + sco_li[stu_TF_idx][3];
                            sco_li[stu_TF_idx][5] = sco_li[stu_TF_idx][4] / 3;

                            System.out.println("덮어쓰기가 완료되었습니다.");
                            break;
                        } else {
                            System.out.println("다시 입력해 주세요.");
                        }
                    }
                }
            } else if (menu == 2) {
                if (STU_CON == 0) {
                    System.out.println("입력된 학생이 없습니다.");
                } else {
                    for (int i = 0; i < STU_CON; i++) {
                        System.out.printf("[학번 : %d] 국어 : %3d  영어 : %3d  수학 : %3d  합계 : %3d   평균 : %.2f\n",
                                (int)sco_li[i][0],  // 학번은 정수로 출력
                                (int)sco_li[i][1],  // 국어 성적
                                (int)sco_li[i][2],  // 영어 성적
                                (int)sco_li[i][3],  // 수학 성적
                                (int)sco_li[i][4],  // 합계는 정수로 출력
                                sco_li[i][5]);      // 평균은 소수점 포함하여 출력
                    }

                }
            } else if (menu == 3) {
                System.out.print("삭제할 학생의 학번을 입력하세요: ");
                int deleteId = sc.nextInt();
                int deleteIdx = -1;

                // 삭제할 학생 검색
                for (int i = 0; i < STU_CON; i++) {
                    if (sco_li[i][0] == deleteId) {
                        deleteIdx = i;
                        break;
                    }
                }

                if (deleteIdx == -1) {
                    System.out.println("해당 학번의 학생이 존재하지 않습니다.");
                } else {
                    // 삭제한 학생의 뒤 데이터를 앞으로 이동
                    for (int i = deleteIdx; i < STU_CON - 1; i++) {
                        sco_li[i] = sco_li[i + 1];
                    }
                    sco_li[STU_CON - 1] = new float[SCO_NUM];  // 마지막 행 초기화
                    STU_CON--; // 학생 수 감소
                    System.out.println("학생이 삭제되었습니다.");
                }
            } else if (menu == 4) {
                System.out.println("프로그램 종료 .👌");
                break;
            } else {
                System.out.println("잘못된 값입니다. 다시 입력해주세요.");
            }
        }
    }
}
