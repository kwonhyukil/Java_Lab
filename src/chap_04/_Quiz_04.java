package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 조건문을 활용하여 주차 요금 정산 프로그램을 작성

        // 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        int hour = 10; // 주차 시간
        boolean smallCar = false; // 경차
        boolean disabled_vehicle = true; // 장애인 차량

        int fee = hour * 4000; // 시간당 요금 계산

        if (fee >= 30000) {
            fee = 30000;
        }
        if (smallCar || disabled_vehicle) {
            fee /= 2;
        }

        System.out.println("주차 요금은 " + fee + " 원 입니다.");


        // 실행 결과
        // 일반 차량 5시간 주차 시 20000 원
        // 주차 요금은 20000 원 입니다.
        
        // 경차 5시간 주차 시 10000 원
        // 주차 요금은 10000 원 입나다.
        
        // 장애인 차량 10시간 주차 시 15000 원
        // 주차 요금은 15000 원 입니다
        
    }
}
