package Class.Lab;

public class _02_Lab {
    public static void main(String[] args) {
        byte maxValue = 127;
        byte minValue = -128;

        maxValue++;
        minValue--;

        System.out.println("오버플로우된 값: " + maxValue);
        System.out.println("언더플로우된 값: " + minValue);
    }
}
