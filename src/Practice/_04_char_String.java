package Practice;

public class _04_char_String {
    public static void main(String[] args) {
        char letterA = 'A'; // 문자 'A'
        char letterKorean = '가'; // 한글 문자 '가'
        char unicodeChar = '\u0041'; // 유니 코드로 'A' 표현

        System.out.println("문자 A: " + letterA);
        System.out.println("한글 문자: " + letterKorean);
        System.out.println("유니 코드 문자: " + unicodeChar);

        String greeting = "Hello World!"; // 문자열 리터럴
        String name = "Richard"; // 문자열 리터럴
        String fullGreeting = greeting + " " + name; // 문자열 연결
        System.out.println("인사: " + greeting);
        System.out.println("이름: " + name);
        System.out.println("전체 인사: " + fullGreeting);
    }
}
