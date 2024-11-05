package Class.Operator;

public class _09_comparison {
    public static void main(String[] args) {

        String str1 = new String("Hello");
        String str2 = "Hello";

        // 참조 비교: 서로 다른 객체 이므로 false
        System.out.println(str1 == str2); // false

        // 내용 비교: 같은 문자열 내용을 가지고 있으므로 true
        System.out.println(str1.equals(str2));

        long pos = 2147483647 + 2;
        System.out.println(pos);

    }
}
