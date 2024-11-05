package Class;

public class Scanner {
    public static void main(String[] args) {
            // 입력을 받을 스캐너를 만든다, new : 새로운, System.in : 시스템 안으로 스캔한다.
            java.util.Scanner scan = new java.util.Scanner(System.in);
            // String : 문장이라는 뜻.
            // str : 저희가 입력받을 '문장의 이름' 입니다
            // scanner.nextLine() : 한 줄을 입력받는다.
            String str = scan.nextLine();

            System.out.println(str);



    }
}
