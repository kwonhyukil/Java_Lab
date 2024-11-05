package Practice;

public class _08_BitOperationPowCalPer {
    public static void main(String[] args) {
        // 반복 횟수 (계산을 충분히 많이 해서 시간을 측정)
        int iterations = 1000000000; // 1억 번의 반복을 수행

        // * 연산자 사용 (곱셈 연산)
        // 덧셈 연산을 여러번 반복하거나, 곱셈 알고리즘을 사용하여 처리됩니다.
        long startTimeMultiplication = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            int result = 10 * (int) Math.pow(2, 2); // 10 * 2^2
            // 10을 2의 제곱과 곱하는 연산 = 10 * 4
        }
        long endTimeMultiplication = System.nanoTime();
        long timeTakenMultiplication = endTimeMultiplication - startTimeMultiplication;

        // << 연산자 사용 (비트 시프트 연산)
        // 단순히 비트를 이동시키는 작업으로, CPU 내에서 단순한 명령어로 처리됩니다.
        long startTimeShift = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            int result = 10 << 2;
            // 10의 2진수 00001010 << 2
            //           00101000
        }
        long endTimeShift = System.nanoTime();
        long timeTakenShift = endTimeShift - startTimeShift;

        // 결과 출력
        System.out.println("Time taken using * operator: " + timeTakenMultiplication + " ns");
        System.out.println("Time taken using << operator: " + timeTakenShift + " ns");
        // 컴퓨터 시스템에서 비트 시프트 연산은 하드웨어적으로 빠르게 처리되기 때문에 곱셈연산보다 성능이 더 좋은 경우가 많다.
    }
}
