package Practice;

public class _02_Literal {
    public static void main(String[] args) {
        // 부동 소수점 리터럴 접미사 사용 예제

        // 부동 소수점 리터럴 (float 타입) - 접미사 'f' 또는 'F'
        float floatNumber = 3.14f; // 또는 3.14F

        // 부동 소수점 리터럴 (double 타입) - 접미사 'd' 또는 'D'
        double doubleNumber = 2.71828; // 접미사 생략 가능, 또는 2,71828d 또는 2.71828D

        // 출력
        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);

        // 문자와 문자열 리터럴 예제

        // 문자 리터럴
        char letter = 'A';

        // 문자열 리터럴
        String greeting = "Hello, World!"; // 문자열 리터럴

        // 출력
        System.out.println("Character: " + letter);
        System.out.println("String: " + greeting);

        // 불리언 리터럴 예제

        // 불리언 리터럴
        boolean isJavaFun = true; // 불리언 리터럴 true
        boolean isFishTasty = false; // 불리언 리터럴 false

        // 출력
        System.out.println("Is Java Fun: " + isJavaFun);
        System.out.println("Is Fish Tasty: " + isFishTasty);
    }
}
