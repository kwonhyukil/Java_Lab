package Class.Lab.FlowControl;

import java.util.Scanner;

public class _02_Lab {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1부터 7까지의 정수를 입력

        // 잘못된 숫자 입력시 재입력 == 무한 반복(While문 사용)
        int inputValue = 0;

        while (true){
            System.out.print("1~7 사이의 숫자를 입력 하세요: ");
            inputValue = scan.nextInt();

            if (inputValue >= 1 && inputValue <= 7){
                break;
            } else {
                System.out.println("유효 하지 않은 숫자 입니다. 1~7 사이의 숫자를 입력 하세요.");
            }
        }
        // 해당 숫자에 맞는 요일을 출력 -> switch 이용
        String date = "";

        switch (inputValue){
            case 1 :
                date = "월요일";
                break;
            case 2 :
                date = "화요일";
                break;
            case 3 :
                date = "수요일";
                break;
            case 4 :
                date = "목요일";
                break;
            case 5 :
                date = "금요일";
                break;
            case 6 :
                date = "토요일";
                break;
            case 7 :
                date = "일요일";
                break;
        };
        if (inputValue >= 1 && inputValue <= 5){
            System.out.println(date + ", 주중");
        } else {
            System.out.println(date + ", 주말");
        }


        // 잘못된 숫자 입력시 재입력

        // 토요일(6) 일요일(7) "주말" 그 외 주중


    }
}
