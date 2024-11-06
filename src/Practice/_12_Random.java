package Practice;

public class _12_Random {
    public static void main(String[] args) {
        // 2. 특정 범위의 정수 생성 (예: 5부터 15까지)
        int minInt = 5;
        int maxInt = 15;
        int boundedInt = (int) (Math.random() * (maxInt - minInt + 1)) + minInt;
        System.out.println("5부터 15까지의 난수 (정수): " + boundedInt);

        // 3. 특정 범위의 실수 생성 (예: 1.5부터 4.5까지)
        double minDouble = 1.5;
        double maxDouble = 4.5;
        double boundedDouble = minDouble + (Math.random() * (maxDouble - minDouble));
        System.out.println("1.5부터 4.5까지의 난수 (실수): " + boundedDouble);
        // 4. Boolean 값 랜덤 생성 (0.5보다 크면 true, 작으면 false)
        boolean randomBoolean = Math.random() >= 0.5;
        System.out.println("랜덤 불리언 값: " + randomBoolean);
    }
}