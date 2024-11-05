package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String num = "901231-1234567"; // 주민등록번호 13자리

        System.out.println(num.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        System.out.println(num.substring(0, num.indexOf("-") + 2)); // 인덱스 0 부터 하이픈 위치 + 2 직전까지

        String num1 = "030708-4567890";

        System.out.println(num1.substring(0, 8));
        System.out.println(num1.substring(0, num1.indexOf("-") + 2));
    }
}
