package Class.Flow_Control;

public class _05_for_7 {
    public static void main(String[] args) {

        // 1이상 20이하 양의 정수 중 7의 배수를 출력 하라

        for (int i = 1; i <= 20; i++) {
            if (i % 7 == 0){
                System.out.println(i);
            }
        }
        // 양의 정수 10 -> 1까지를 출력 하시오
        // 10 9 8 7 6 5 4 3 2 1
        for (int i = 10; i > 0 ; i--) {
            System.out.print(i + " ");
        }

        // bar 1차월 배열 (Array) 내 원소 값을 출력 하는 코드를 작성 하시오
        // 10, 20, 30
        int bar[] = new int[3];

        for (int i = 0, j = 10; i < bar.length; i++, j += 10) {
            bar[i] = j;
        }
        for (int i = 0; i < bar.length; i++) {
            System.out.print(bar[i] + " ");
        }

    }
}
