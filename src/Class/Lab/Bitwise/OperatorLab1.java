package Class.Lab.Bitwise;

class BitSet {
    int state = 0;

    // 비트 설정 메소드
    void setBit(int position, boolean value) {
        // position 위치에 비트 값 설정
        // value가 True 일 때 | 연산과 ( 1 << position ) 을 사용해 1로 설정한다.
        // Value 가 False 일 때 & 연산과 비트 반전 ( ~ ) 을 사용하여 0으로 설정한다.
        int mask = 1 << position; // Masking 을 위한 변수 생성

        // ( value ) 라 입력하면 true 값이 된다.
        if (value) {
            state |= mask;
        }
        // value 값이 False 일 때
        else {
            state &= ~mask;
        }
    }
    boolean getBit(int position) {
        // position 위치의 비트 값 반환
        // return 문과 함께 & 연산과 쉬프트 연산 ( 1 << position ) 을 사용하여 특정 위치의 비트 값을 확인한다.
        int mask = 1 << position; // 비트 확인을 위한 mask
        return (state & mask) != 0; // 비트가 0이 true 반환한다.
    }
}


public class OperatorLab1 {
    public static void main(String[] args) {
        // 메소드 작성 후 실행 예시
        BitSet bitSet = new BitSet();
        bitSet.setBit(5, true); // 5번째 비트를 1로 설정한다.
        System.out.println(bitSet.getBit(5)); // 출력 : true
        System.out.println(bitSet.getBit(3)); // 출력 : False
    }
}



