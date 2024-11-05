package Practice;

public class _06_Bitwise {
    public static void main(String[] args) {
        int a = 6; // 0110 in binary
        int b = 3; // 0011 in binary

        // 1. 비트 AND 연산 ( 둘 다 1인 경우에 1)
        int resultAnd = a & b;
        System.out.println(" a & b = " + resultAnd); // 출력 : 2
        // a = 0110
        // b = 0011
        // ---------
        //     0010 -- 결과 값

        // 2. 비트 OR 연산 ( 둘 중 하나라도 1인 경우에 1 )
        int resultOr = a | b;
        System.out.println("a | b = " + resultOr); // 출력 : 7
        // a = 0110
        // b = 0011
        // ---------
        //     0111 -- 결과 값

        // 3. 비트 XOR 연산 ( 둘이 다르면 1, 같으면 0 )
        int resultXor = a ^ b; // 0110 ^ 0011 = 0101
        System.out.println("a ^ b = " + resultXor); // 출력 : 5
        // a = 0110
        // b = 0011
        // ---------
        //     0101 -- 결과 값

        // 4. 비트 NOT 연산 ( 각 비트를 반전, 0을 1로, 1을 0으로 )
        int resultNOt = ~a; // ~0110 = 1001 ( 2's complement 에서 -7 )
        System.out.println("~a = " + resultNOt); // 출력: -7
        // a = 0110
        // ~a 연산 실행시
        // a = 1001 ( 2's complement 에서 -7 )

        // 5. 비트 왼쪽 시프트 ( 왼쪽으로 비트 이동, 값이 2배로 증가 )
        int resultLeftShift = a << 1; // 0110 -> 1100  ( 12 )
        System.out.println("a << 1 = " + resultLeftShift); // 출력 : 12
        // a = 0110 -- 6
        // a << 1 실행시
        // a = 1100 -- 12 : 왼쪽 비트 이동 2배 증가


        // 6. 비트 오른쪽 시프트 ( 오른쪽으로 비트 이동, 값이 2로 나누어짐 )
        int resultRightShift = a >> 1; // 0110 -> 0011 ( 3 )
        System.out.println("a >> 1 = " + resultRightShift); // 출력 : 3
        // a = 0110
        // a >> 1 실행시
        // a = 0011 -- 3 : 오른쪽 비트 이동 값이 2로 나눠짐
    }
}
