package Class.Flow_Control;

import java.util.Random;

public class _08_Random {
    public static void main(String[] args) {
        //     참조 변수
        Random random1 = new Random(12345); // 시드가 12345로 설정된 경우
        Random random2 = new Random(12345); // 같은 시드를 사용

        System.out.println("random1: " + random1.nextInt());
        System.out.println("random2: " + random2.nextInt());



        Random bar = new Random();
        // Seed 값이 없기 때문에, 실행 시 현재 시간을 시드 값으로 활용

        Random poo = new Random(23);
        // 시드 값을 넣는 이유
        // 1. 무작위(random) 값을 생성할 때 예측 가능한 결과를 얻기 위해
        // 2. 시드 값을 지정하면 같은 시드에서 항상 동일한 난수 시퀀스가 생성됩니다.
        // 3. 무작위 요소가 포함된 프로그램에서 시드 값을 설정하면 무작위성이 특정한 패터을 따르도록 제어할 수 있다.

        // Random class - seed 값 지정 가능
        // Math.random() 메서드 - seed 값 지정 불가능

        for (int i = 0; i < 5; i++) {
            System.out.println(bar.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            int kin = (int)(Math.random() * 45) + 1 ; // Math.random 메서드를 사용하면 자료형은 double 값으로 반환된다.
            System.out.println(kin);    // 0.0 이상 1.0 미만의 수를 랜덤하게 생성
            // 45  * 0.0 <= R <= 1.0 * 45
            // (int) 0.0 <= R <= (int) 45
            // 1 +  0    <= R <= 45 + 1
            //      1    <= R <  46

        }
        int minInt = 5;
        int maxInt = 15;
        int boundedInt = (int) (Math.random() * (maxInt - minInt + 1) + minInt);
        System.out.println("5부터 15까지의 난수 (정수): " + boundedInt);
    }
}
