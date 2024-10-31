package Class.Flow_Control;

import java.util.Scanner;

public class Test_Array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 성적 [A, B, C] , 출석 [PASS, FAIL]
        System.out.print("[A, B, C] 중 성적을 입력 하세요: ");
        String grade = scan.nextLine();
        System.out.print("[PASS, FAIL] 중 성적을 입력 하세요: ");
        String attendance = scan.nextLine();
        // 나머지는 장학금 없음

        // Switch 사용
        String result = switch (grade) {
            // 성적이 A이고, 출석 PASS -> 전액 + 추가 장학금 출력
            case "A" -> {
                if (attendance.equals("PASS")) {
                    yield "전액 장학금 , 추가 장학금 지급";
                // 성적이 A이고, 출석 FAIL -> 전액
                } else {
                    yield "전액 장학금";
                }
            }
            // 성적이 B이고, 출석 PASS -> 반액
            case "B" -> {
                if (attendance.equals("PASS")) {
                    yield "반액 장학금 지급";
                // 나머지는 장학금 없음
                } else {
                    yield "장학금 없음";
                }
            }
            // 나머지 처리
            default -> "장학금 없음";
        };
        if (result.equals("장학금 없음")) {
            System.out.println("더 열심히 하세요");
        } else {
            System.out.println("축하 드립니다!! " + result + " 세금 30%입니다.");
        }
    }
}
