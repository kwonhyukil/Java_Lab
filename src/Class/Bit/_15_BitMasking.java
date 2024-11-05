package Class.Bit;

public class _15_BitMasking {
    public static void main(String[] args) {
//         16진수
//         0 1 2 3 4 5 6 7 8 9
//         A B C D E F
//    = 한 자리로 표현할 수 있는 범위를 초과 했기 때문 이다.
//    = 가독성 : 2진수를 4비트 씩 끊어서 16진수로 표현 하면 인간이 이해할 수 있다.
//    = 숫자가 2자리가 되면 끊어서 읽을 수가 없다.
//
//     16 진수   10 ~ 15   10 ~ 15   10 ~ 15     -     0 ~ F
//      2 진수    0   1     0   1     0   1
//     10 진수    0 ~ 9     0 ~ 9     0 ~ 9
        int bar = 0x000000ff;

//        16진수
//              8           4           2           1
//     ----------------------------------------------
//              4           3           2           1
//     ----------------------------------------------
//     0        0           0           0           0
//  F(15)       1           1           1           1  =  최고값 표현
//  E(14)       1           1           1           0
//  D(13)       1           1           0           1
//  C(12)       1           1           0           0
//  B(11)       1           0           1           1
//  A(10)       1           0           1           0
//
//  1           0           0           0           1
//  2           0           0           1           0
//  4           0           1           0           0
//  8           1           0           0           0
//
//                      int bar = 0x000000FF; - 16진수 0 하나당 4비트
//  int = bar 0x 0       0       0       0       0       0       F       F
//               4321    4321    4321    4321    4321    4321    4321    4321
//        -------------------------------------------------------------------
//   2진수        0000    0000    0000    0000    0000    0000    1111    1111
//  16진수        0000    0000    0000    0000    0000    0000    1111    1111
//

                // 0100 1010 1110 0010 0000 0000 1011 1011
        int poo = 0b01001010111000100000000010111011;
        int mask = 0x00ff0000;

        int result = poo & mask;
        // 0000 0000 1110 0010 0000 0000 0000 0000
        System.out.println(result);

//         Get : 특정 자리의 비트 값 읽기
//               - 비트 자리 수

//         Set : 특정 자리에 비트 값 쓰기
//               - 비트 자리 수, 값
//
    }
}
