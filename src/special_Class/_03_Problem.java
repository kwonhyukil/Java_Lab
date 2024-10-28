package special_Class;


import java.util.Scanner;

public class _03_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 나이
        System.out.print();
        int age = scan.nextInt();
        // 이벤트 코드
        String eventCode = scan.next();
        // 예약 날짜
        int reservationDate = scan.nextInt();

        String result = "";

        switch (eventCode){
            case "E1":
                if (age >= 18 || reservationDate >= 1 || reservationDate <= 30){
                    result = "예약이 완료되었습니다.";
                }else if (age < 18){
                    result = "나이 제한으로 예약할 수 없습니다.";
                } else if (reservationDate < 0 || reservationDate > 30) {
                    result = "잘못된 입력입니다. 프로그램 종료";
                }
                break;

            case "E2":
                if (reservationDate % 2 == 0){
                    result = "예약이 완료되었습니다.";
                } else {
                    result = "선택하신 날짜에는 예약할 수 없습니다.";
                }
                break;
            case "E3":
                if (age >= 16 && reservationDate % 7 == 0){
                    result = "예약이 완료되었습니다.";
                } else if (age < 16) {
                    result = "나이 제한으로 예약할 수 없습니다.";
                } else if (reservationDate % 7 != 0) {
                    result = "선택하신 날짜에는 예약할 수 없습니다.";
                }
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
        System.out.println(result);
    }
}
