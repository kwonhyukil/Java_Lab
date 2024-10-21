package Java_Lab;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_7 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        // 초기 자본금
        System.out.print("초기 자본 금을 입력 하세요: ");
        int Initial_capital = Scan.nextInt();
        // 주식 가격
        System.out.print("주식 가격을 입력 하세요: ");
        int stock = Scan.nextInt();
        // 구매할 주식 수
        System.out.print("구매할 주식 수를 입력 하세요: ");
        int stock_buy = Scan.nextInt();
        // 판매 주식 가격
        System.out.print("판매할 때의 주식 가격을 입력 하세요: ");
        int stock_sell = Scan.nextInt();
        // 구매후 남은 자본금
        float remain_capital = Initial_capital - (stock * stock_buy);

        // 예상 이익
        float revenue = ((stock_buy * stock_sell) - (stock_buy * stock));

        System.out.printf("구매후 남은 자본금: %.2f",remain_capital);
        System.out.println();
        System.out.printf("예상 이익: %.2f", revenue);
        System.out.println();
        if (revenue > 0){
            System.out.println("예상되는 이익입니다.");
        }else {
            System.out.println("예상되는 손실입니다.");
        }
        // 이익 or 손해 판별
    }
}
