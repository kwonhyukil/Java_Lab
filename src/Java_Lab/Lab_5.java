package Java_Lab;

import java.util.Scanner;

public class Lab_5 {

    public void event_check (int age, String event_code, int reservation_date) {
        System.out.println("age: " + age + " event_code: " + event_code + " reservation_date: " + reservation_date);
        String Check = " ";
            // E1 = 18세 이상
        if (event_code.equals("E1")){ // .equals() 메서드는 문자열 비교자체를 비교
            if (age >= 18 && reservation_date >= 1 && reservation_date < 31 ) {
                Check = "예약 완료 되었습니다.";
            }else if (age < 18) {
                Check = "나이 제한으로 인해 예약할 수 없습니다.";
            }
            // E2 = 모든 연령대, 짝수일
        }else if (event_code.equals("E2")){

            if (reservation_date % 2 == 0){
                Check = "예상이 완료 되었습니다.";
            }else{
                Check = "선택하신 날짜에는 예약할 수 없습니다.";
            }
            // E3 = 16세 이상, 7의 배수일
        }else if (event_code.equals("E3")){
            if (age > 16 && reservation_date % 7 == 0){
                Check = "예약이 완료 되었습니다.";
            }else if (reservation_date % 7 != 0){
                Check = "선택하신 날짜에는 예약할 수 없습니다.";
            }else{
                Check = "나이 제한으로 인해 예약할 수 없습니다.";
            }
        }else{
            System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
        }
        if (Check.equals(" ")) {
            System.out.println(Check);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lab_5 lab = new Lab_5();

        System.out.print("나이를 입력하세요: ");
        int age = scan.nextInt();

        System.out.print("예약하려는 이벤트 코드를 입력하세요: ");
        String event_code = scan.next();

        System.out.print("원하는 예약 날짜를 입력하세요: ");
        int reservation_date = scan.nextInt();

        lab.event_check(age, event_code, reservation_date);

    }

}
