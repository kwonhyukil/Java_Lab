package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수 문자, 이스케이프 문자 ( Escape Sequence, Escape Character, Special Character )
        // \n, \t, \\, \", \'

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");
        // \n - 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t - 탭 효과
        // 해물파전 9000
        // 김치전 8000
        // 부추전 8000
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // \\ - 역슬래시
        System.out.println("c:\\program Files\\Java");

        // \" - 큰따옴표
        // 단비가 "냐옹" 이라고 햇어요
        System.out.println("단비가 \"냐옹\"이라고 했어요");

        // \' - 작은따옴표
        // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        char c = 'A';
        c = '\'';
        System.out.println(c);
    }
}
