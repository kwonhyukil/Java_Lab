package Class.Bit;

public class _14_Bitwise_Quiz {
    public static void main(String[] args) {
        // 210.101.236.164
        // D2 .65 .EC .A4
        // Shift operator : >> , <<
        int myIpaddr = 0xD265ECA4;
        // >> 와 & 연산자를 조합해서 IPv4 각 자리수를 각 int 형 변수 inaddr에 저장
        // 210.101.236.164
        int inAddr1 = (myIpaddr >> 24) & 0xFF; // D2 . 65 .EC .A4 -> D2
        int inAddr2 = (myIpaddr >> 16) & 0xFF; // D2 .65 .EC .A4 -> 65
        int inAddr3 = (myIpaddr >> 8) & 0xFF; // D2 .65 .EC .A4 -> EC
        int inAddr4 = 0; // D2 .65 .EC .A4 -> A4

        System.out.println(inAddr1 + "." + inAddr2 + "." + inAddr3 + "." + inAddr4);

        // byte -> 1 byte
        // short -> 2 byte
        // boolean -> JVM의 구현 방식에 따라 다르다.

//        boolean flag1 = false; // 1 byte
//        boolean flag2 = false; // 2 byte
//        boolean flag3 = false;
//        boolean flag4 = false;
//        boolean flag5 = false;
//        boolean flag6 = false;
//        boolean flag7 = false;
//        boolean flag8 = false;
//        .
//        .
//        .
//        boolean flag64 = false; // 64 byte

//      ------------------------- 64 byte 필요

//      long = 8byte = 64bit // 1byte = 8bit

        long flags = 0;
        long bitValue = 1L << 63;

        flags = flags | bitValue;

        String binaryString = Long.toBinaryString(flags);
        System.out.println("Binary representation: " + binaryString);

        bitValue = 1L << 2;

        flags = flags | bitValue;
        binaryString = Long.toBinaryString(flags);
        System.out.println();


    }
}
