package Practice;

public class _01_Literal {
    public static void main(String[] args) {

        // 정수 리터럴 접두사 사용 예제

        // 10진수 정수 리터럴 (Decimal)
        int decimalNumber = 42; // 10 진수로 42

        // 2진수 정수 리터럴 (Binary) - 접두사 '0b'
        int binaryNumber = 0b101010; // 2진수로 101010, 10진수로 42

        // 8진수 정수 리터럴 (0ctal) - 접두사 '0'
        int octalNumber = 052; // 8진수로 52, 10진수로 42

        // 16진수 정수 리터럴 (Hexabecimal) - 접두사 '0x'
        int hexabecimalNumber = 0x2A; // 16진수로 2A, 10진수로 42

        // 출력
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binaryNumber);
        System.out.println("Octal: " + octalNumber);
        System.out.println("Hexadecimal: " + hexabecimalNumber);
    }
}
