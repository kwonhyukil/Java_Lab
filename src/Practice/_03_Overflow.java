package Practice;

public class _03_Overflow {
    public static void main(String[] args) {
        // int 형 변수는 32비트 정수 형으로 값의 범위는 -2,147,483,648 ~ 2,147,483,647
        int maxInt = Integer.MAX_VALUE;

        // 최댓 값에 1을 더하면 오버 플로우 발생
        System.out.println("최댓값: " + maxInt);
        maxInt += 1; // 오버 플로우 발생
        System.out.println("오버 플로우 발생 후 값: " + maxInt);

        // int 형 변수의 최솟 값은 -2,147,483,648
        int minInt = Integer.MIN_VALUE;
        System.out.println("최솟값: " + minInt);

        // 최솟 값에 1을 빼면 언더 플로우 발생
        minInt -= 1; // 언더 플로우 발생
        System.out.println("언더 플로우 발생 후 값: " + minInt);
    }
}
