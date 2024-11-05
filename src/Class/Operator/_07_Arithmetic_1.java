package Class.Operator;

public class _07_Arithmetic_1 {
    public static void main(String[] args) {
        // 1. 기본 사칙 연산
        // a) +, -의 경우 음수화, 양수화 포함
        int a = 10;
        int b = -5;
        System.out.println("기본 사칙 연산 예제: ");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        // 음수화, 양수화 예제
        int positive = +a; // 양수화, 변동없음
        int negative = -a; // 음수화
        System.out.println("양수화: +" + a + " = " + positive);
        System.out.println("음수화: +" + a + " = " + negative);

        System.out.println();
    }
}
