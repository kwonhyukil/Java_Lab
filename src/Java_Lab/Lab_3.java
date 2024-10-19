package Java_Lab;

import java.util.Scanner;

public class Lab_3 {

    double Ft_2 = 10.7939;

    // 제곱미터를 평방피트로 변환
    public double convert_to_square_feet(double Meter) {
        double Square_meters = Ft_2 * Meter;
        System.out.printf("%.1f 제곱 미터는 %.3f 평방피트입니다. ", Meter, Square_meters);

        return Square_meters;
        // 여기에 제곱 미터를 평방 피트로 변환 하는 코드를 작성 하세요.
    }
    // 제곱 미터를 에이커로 변환
    public double convert_to_acres(double Meter) {

        double acres = Meter / 4046.86;
        System.out.printf("%.1f 제곱미터는 %.16f 에이커 입니다.\n", Meter, acres);

        return acres;

    }
    public static void main(String[] args) {
        Lab_3 lab = new Lab_3();
        Scanner scan = new Scanner(System.in);

        System.out.print("토지의 면적을 제곱미터 단위로 입력하세요: ");
        double Meter = scan.nextDouble();
        lab.convert_to_square_feet(Meter);
        System.out.println();
        lab.convert_to_acres(Meter);
    }
}
