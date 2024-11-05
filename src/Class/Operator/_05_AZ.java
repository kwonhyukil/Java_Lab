package Class.Operator;

public class _05_AZ {
    public static void main(String[] args) {

        // 화면에 A ~ Z 까지 출력
        for (char bar = 'A'; bar <= 'Z'; bar++) {
            System.out.print(bar + "\t");
        }
        System.out.println();
        // 화면에 z ~ a 까지 출력
        System.out.println((int)'z');
        for (char zar = 'z' ; zar >= 'a'; zar--) {
            System.out.print(zar + "\t");
        }
        System.out.println();
    }
}
