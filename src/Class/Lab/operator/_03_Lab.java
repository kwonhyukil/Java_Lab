package Class.Lab;

public class _03_Lab {
    public static void main(String[] args) {

        double radius = 5.0;
        final double pie = 3.14159;
        // 원의 반지름과 원주율을 사용해 원의 면적을 구하는 프로그램 작성
        double area = pie * (radius*radius);
        System.out.printf("원의 면적:" + "%.2f",area);

    }
}
