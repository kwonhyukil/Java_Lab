package Practice;

public class _11_Char {
    public static void main(String[] args) {
        // 변환할 문장 입력
        String input = "Hello World!";
        // 결과 변수 생성 메서드 호출후 문장 입력
        String result = toUpperCase(input); // 12번 라인으로 이동
        System.out.println("변환 결과: " + result);
    }

    public static String toUpperCase(String str) {
        StringBuilder upperStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 소문자(a-z)의 ASCII 값 범위: 97(‘a’) ~ 122(‘z’)
            if (ch >= 'a' && ch <= 'z') {
                // 소문자를 대문자로 변환하기 위해 32를 빼줌
                upperStr.append((char) (ch - 32));
            } else {
                // 이미 대문자이거나 특수 문자면 그대로 추가
                upperStr.append(ch);
            }
        }

        return upperStr.toString();
    }
}