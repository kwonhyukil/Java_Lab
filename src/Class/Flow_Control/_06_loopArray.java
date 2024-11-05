package Class.Flow_Control;

import java.util.Scanner;

public class _06_loopArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num0fElements = 5;
        int[] bar = new int[num0fElements];

        // 반복 -> 배열의 원소를 처음부터 마지막까지
        for (int i = 0; i < bar.length; i++) { // 배열을 순회할 경우 length 사용 : 가장 정확한 방법 이다.
            bar[i] = scan.nextInt();
        }
        for (int value : bar){
            System.out.print(value + " : ");
        }
    }
}
