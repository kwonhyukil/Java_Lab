package Class.Operator;

import java.util.Scanner;

public class _11_Logical {
    public static void main(String[] args) {
        // 논리 연산자 : 참과 거짓을 다루는 연산자
        // 1 <= 입력 값 <= 10

        // boolean 연산자 사용시 "isooooo" 사용하여 네이밍함
        boolean isOpened = false;

        // 방문이 열려 있다.
        isOpened = true;

        // 방문이 닫혀 있따.
        isOpened = false;

        // 방문이 닫혀 있으면.....실행
        if (!isOpened) {
            System.out.println("Do something");
        }
        // 방문이 닫혀 있으면.....실행

        Scanner sc = new Scanner(System.in);

        int inputValue = sc.nextInt();

        if (inputValue >= 1 || inputValue <= 10) {
            System.out.println("Do something");
        } else {
            System.out.println("잘못된 입력 값입니다.");
        }
        // inputValue >= 1 || inputValue <= 10 -> Logical operator
        // inputValue >= 1 | inputValue <= 10 -> Bitwise operator

        // inputValue >= 1 && inputValue <= 10 -> Logical operator
        // inputValue >= 1 & inputValue <= 10 -> Bitwise operator

        // !inputValue     -> Logical operator
        // ~inputValue     -> Bitwise operator

        byte bar = 0 ;

        bar += 1; // 형변환 과정 없이 값이 더해진다.

        // 명시적 형변환
        bar = (byte)(bar + 1); // bar + 1 = ba

        char foo = 'A';
        System.out.println(foo);

        // 'B'
        foo = (char)(foo + 1); // char + int -> int + int -> int
        foo += 1;
        System.out.println(foo);

        // + , - , * , / , %
        // += , -= , *= , /= , %=

        // 복합 대입 연산자 : 산술, 비트 연산자
    }
}
