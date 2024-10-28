package special_Class;

import java.util.Scanner;

public class _02_Problem {
    public static void main(String[] args) { // 함수종료
        // 자료형 (정수, 실수) , 입력 값의 유효 범위
        // 1 ~ 200,000,000
        Scanner scan = new Scanner(System.in);

        System.out.print("첫 번째 변의 길이를 입력하세요: ");
        int input1 = scan.nextInt();
        System.out.print("두 번째 변의 길이를 입력하세요: ");
        int input2 = scan.nextInt();
        System.out.print("세 번째 변의 길이를 입력하세요: ");
        int input3 = scan.nextInt();

        // 삼각형 만들 수 있어? (특정조건 + 모든조건)
        // 어느 두 변의 길이의 합이 나머지 한 변의 길이보다 작거나 같으면 삼각형을 형성할 수 없습니다. 삼각형을 형성할 수 없는 조건.
        if ( input1 + input2 <= input3 || input2 + input3 <= input1 || input1 + input3 <= input2){
            System.out.println("삼각형 형성 못해요~");
            return;
        } else {
            String triangle ;
            if (input1 == input2 && input1 == input3){
                triangle ="정삼각형";
            } else if (input1 == input2 || input2 == input3 || input1 == input3) {
                triangle = "이등변";
            } else {
                triangle = "부등변";
            }
            System.out.println("입력하신 변의 길이로는 " + triangle + "을 만들 수 있습니다.");
        }



        // 응

        // 아니 -> 삼각형을 만들 수 없습니다.

    }
}
