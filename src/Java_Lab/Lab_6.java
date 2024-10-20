package Java_Lab;

import java.util.Scanner;

public class Lab_6 {

    public void calculate_attendance_score(int hour_per_week, int absence_hours, int tardy_count) {
//        System.out.print("주당 수업 시간 " + hour_per_week + " 결석한 총 시간: " + absence_hours + " 지각 횟수: " + tardy_count);
        // 출석 점수 계산법
        // 계산식 : 20 - (20 * 결석시간 수 / 총 수업시간 수)
//        float attendance_score = 20 - ((20 * absence_hours) / hour_per_week);
        // 총 수업 시간 계산법
        // 시수 / 주 * 15
        float total_class = hour_per_week * 15;

        // 지각 처리 규칙
        // 지각 3회는 결석 1시간으로 처리
        int total_tardy =  tardy_count / 3;

        absence_hours += total_tardy;
        // 결석 처리 규칙
        // 결석 시수가 총 수업 시수의 1/4를 초과할 경우 학점 미부여 (F 처리)
//        float result = total_class * 0.25 < absence_hours;

        float attendance_score = 20 - ((20 * absence_hours) / total_class);

        if (total_class * 0.25 > absence_hours){
            System.out.printf("당신의 출석 점수는 %.2f 점 입니다.", attendance_score);
        }else {
            System.out.println("당신의 출석 점수는 F (학점 미부여)점 입니다.");
        }

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lab_6 lab = new Lab_6();

        System.out.print("주당 수업 시간을 입력하세요: ");
        int hour_per_week = scan.nextInt();
        System.out.print("결석한 총 시간을 입력하세요: ");
        int absence_hours = scan.nextInt();
        System.out.print("지각 횟수를 입력하세요: ");
        int tardy_count = scan.nextInt();

        lab.calculate_attendance_score(hour_per_week, absence_hours, tardy_count);
    }
}
