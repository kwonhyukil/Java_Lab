package chap_02;

import java.util.Scanner;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 어린이 키에 따른 놀이 기구 탑승 가능 여부 확인 프로그램 장성
        // 키가 120cm 이상인 경우에만 탑승 가능
        // 삼항 연산자 이용
        int height = 121;
        String result = (height >= 120) ? ("탑승 가능합니다") : ("탑승 불가능합니다.");
        System.out.println("키가 " + height + "cm 이므로 " + result);







        // 출력값
        // 키가 115cm 이므로 탑승 불 가능 합니다.
        // 키가 121cm 이므로 탑승 가능 합니다
    }
}
