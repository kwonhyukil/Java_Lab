package Class.Bit;

public class _13_Bitwise {
    public static void main(String[] args) {

        // 비트 연산자 (Bitwise operator)

        // 왜 사용 할까?
        int addr1 = 210; // 1101 0010
        int addr2 = 101; // 0110 0101
        int addr3 = 236; // 1110 1100
        int addr4 = 164; // 1010 0100

//                                        1101 0010 - addr1
//                                    and 1111 1111 - mask
//                                    --------------
//                                        1101 0010

//                                        1010 0100 - addr4
//                                    and 0000 0000 - mask
//                                    --------------
//                                        0000 0000

//                    and 연산자 : addr 과 mask 의 비트를 비교하여 둘다 1일경우 1
//                    Shift operator : >> , <<

//                  210.101.236.164
//                   D2. 65. EC. A4
//                  ---------------
//                     -765,072,220

        int myIpaddr = 0xD265ECA4;
        System.out.println(myIpaddr);

        int mask1 = 255; // 1111 1111
        int mask2 = 255; // 1111 1111
        int mask3 = 255; // 1111 1111
        int mask4 = 0;   // 0000 0000

        int subAddr1 = addr1 & mask1; // & : Bitwise operator 에서 "and" 를 나타 내는 연산을 하기 위한 연산자 이다.
        int subAddr2 = addr2 & mask2;
        int subAddr3 = addr3 & mask3;
        int subAddr4 = addr4 & mask4;

        System.out.println(subAddr1 + "." + subAddr2 + "." + subAddr3 + "." + subAddr4);

        int bar = 1;
        System.out.println(bar << 1); // bitwise operator ( shift operator )
        System.out.println(bar << 2);
        System.out.println(bar << 3);
        System.out.println(bar << 4);

//      bar ----------------> 0000 0001 -> " 1 " 이지요

        // bar << 1
//          ----------------- 0000 0010 -> " 2 " 이지요
        // bar << 2
//          ----------------- 0000 0100 -> " 4 " 이지요
        // bar << 3
//         ------------------ 0000 1000 -> " 8 " 이지요
        // bar << 4
//         ------------------ 0001 0000 -> " 16 " 이지요
        int poo = 16;
        System.out.println(poo >> 1);
        System.out.println(poo >> 2);
        System.out.println(poo >> 3);
        System.out.println(poo >> 4);

//      poo ----------------> 0001 0000 -> " 16 " 이지요

        // poo >> 1
//          ----------------- 0000 1000 -> " 8 " 이지요
        // poo >> 2
//          ----------------- 0000 0100 -> " 4 " 이지요
        // poo >> 3
//         ------------------ 0000 0010 -> " 2 " 이지요
        // poo >> 4
//         ------------------ 0000 0001 -> " 1 " 이지요


        // 210.101.236.164
        // D2 .65 .EC .A4
        // Shift operator : >> , <<
        int Ipaddr = 0xD265ECA4;
        // >> 와 & 연산자를 조합해서 IPv4 각 자리수를 각 int 형 변수 inaddr에 저장


    }
}
