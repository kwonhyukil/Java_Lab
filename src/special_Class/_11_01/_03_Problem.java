package special_Class._11_01;


public class _03_Problem {
    public static void main(String[] args) {
        // Math.random() -> 0.0 <= random value < 1.0
        // 0.0 <= rand value < 1.0

        // 1 ~ 10 사이의 정수 중 난수값 5개를 출력하라.

        // 램덤 함수
        for (int i = 0; i < 10; i++) {
//            double randValue = (int)(Math.random() * 11);
            int randValue = (int)(Math.random() * 10) + 1;
            System.out.print(randValue + " ");
            // 11 * 0.0 <= rand value < 1.0 * 11
            // 0.0 <= rand value < 11.0

            // 0.0 <= rand value < 11.0
            // 0.0 <= rand value < 10.0 -> 0.0 ~ 9.99999999999...
            // 1 + 0.0 <= rand value < 10.0 + 1
            // 1.0 <= rand value < 11.0 -> 0.0 ~ 10.999999999

            // 1 <= rand value <= 10
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            double randValue2 = (Math.random());
            System.out.println(randValue2);
        }
    }
}
