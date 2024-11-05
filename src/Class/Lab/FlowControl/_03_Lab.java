package Class.Lab.FlowControl;

import java.util.Scanner;

public class _03_Lab {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        char bar = scan.next().charAt(0);
//        int num = (int)bar;
//        System.out.println(num);
        // a = 97, A = 65 // z = 122, Z = 90
        Scanner scan = new Scanner(System.in);
        // 성적 등급 [A, B, C, D, F]
        System.out.print("학생의 성적 등급을 입력 하세요 (A, B, C, D, F): ");
        String grade = scan.nextLine();
        // 출석 등급 [Excellent, Average, Poor]
        System.out.print("학생의 출석 등급을 입력 하세요 (Excellent, Average, Poor): ");
        String attendance = scan.nextLine();

        // Switch Expression + yield 사용
        String result = switch (grade) {
            case "A" -> {
                // 성적 A , 출석 Excellent = 전액 장학금 및 추가 지원금
                if (attendance.equals("EXCELLNET")) {
                    yield "전액 장학금 및 추가 지원금 지급";
                // 성적 A , 출석 Average = 전액 장학금
                } else if (attendance.equals("AVERAGE")) {
                    yield "전액 장학금";
                // 이외 장학금 없음
                } else {
                    yield "장학금 없음";
                }
            }
            case "B" -> {
                // 성적 B , 출석 Excellent = 반액 장학금
                if (attendance.equals("EXCELLNET")) {
                    yield "반액 장학금";
                // 이외 장학금 없음
                } else {
                    yield "장학금 없음";
                }
            }
            case "C", "D" -> {
                // 출석 poor = 장학금 없음, 재수강 권장
                if (attendance.equals("POOR")) {
                    yield "장학금 없음, 재수강 권장";
                // 이외 장학금 없음
                } else {
                    yield "장학금 없음";
                }
            }
            case "F" -> "장학금 없음, 개수강 권장";
            // 잘못된 성적 , 출석 입력된 경우 "잘못된 입력 입니다." 출력
            default -> "잘못된 입력 입니다. 다시 입력 하세요";

            };
        System.out.println(result);
        }
    }


