package special_Class._11_13;

import java.util.Scanner;

public class _01_Problem {
    public static void main(String[] args) {
        // 메뉴를 선택하세요
        Scanner scan = new Scanner(System.in);
        // 1. M x N Matrix를 출력
        // 2. 좌상단 -> 우하단 대각선 삭제 후 M x N Matrix 출력
        // 3. 좌상단 -> 우하단 + 우상단 -> 좌하단 대각선 삭제 후 M x N Matrix 출력
        // 4. 프로그램 종료
        int gameRound = 1;
        while (true) {
            // 게임 횟수 카운트
            System.out.println("게임 횟수: " + gameRound + "번 째");
            // 메뉴 출력
            System.out.println("======================");
            System.out.println("메뉴를 선택 하세요!");
            System.out.println("1. M x N Matrix 출력 하세요");
            System.out.println("2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력 하세요!");
            System.out.println("3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력 하세요!");
            System.out.println("4. 프로그램을 종료 합니다.");
            System.out.println("======================");

            // 사용자 입력값
            System.out.print("메뉴를 선택하세요: ");
            int userChoice = scan.nextInt();
            // 사용자 입력값 판별
            while (true){

                if (userChoice >= 1 && userChoice <= 4 ){
                    break;
                }
                System.out.print("1 ~ 4 까지의 숫자를 입력 하세요 !");
                userChoice = scan.nextInt();
            }
            int sero = 0;
            int raro = 0;
            // 만약 입력값이 1일 경우
            if (userChoice == 1){
                // M 과 N 이 주어짐 -> 0이 아니고 음의 정수일 경우 재입력
                while (true){
                    System.out.print("raro를 입력하세요: ");
                    raro = scan.nextInt();
                    System.out.print("sero를 입력하세요: ");
                    sero = scan.nextInt();
                    // 만약 raro와 sero 가 0보다 크고 양의 정수일 경우 -> break
                    if (raro > 0 && sero > 0){
                        break;
                    }
                    System.out.print("양의 정수를 입력하세요 !! ");
                }
                for (int i = 0 ; i < sero ; i++){
                    for (int j = 0 ; j < raro ; j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
            // 만약 입력값이 2일 경우
            else if (userChoice == 2){
                // M 과 N 이 주어짐 -> 0이 아니고 음의 정수일 경우 재입력
                while (true){
                    System.out.print("raro를 입력하세요: ");
                    raro = scan.nextInt();
                    System.out.print("sero를 입력하세요: ");
                    sero = scan.nextInt();
                    // 만약 raro와 sero 가 0보다 크고 양의 정수일 경우 -> break
                    if (raro > 0 && sero > 0){
                        break;
                    }
                    System.out.print("양의 정수를 입력하세요 !! ");
                }
                for (int i = 0 ; i < sero ; i++) {
                    for (int j = 0; j < raro; j++) {
                        if (i == j) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                    System.out.println(" ");
                }
            }
            // 만약 입력값이 3일 경우
            else if (userChoice == 3){
                // M 과 N 이 주어짐 -> 0이 아니고 음의 정수일 경우 재입력
                while (true) {
                    System.out.print("raro를 입력하세요: ");
                    raro = scan.nextInt();
                    System.out.print("sero를 입력하세요: ");
                    sero = scan.nextInt();
                    // 만약 raro와 sero 가 0보다 크고 양의 정수일 경우 -> break
                    if (raro > 0 && sero > 0) {
                        break;
                    }
                    System.out.print("양의 정수를 입력하세요 !! ");

                }
                for (int i = 0; i < raro; i++) {
                    for (int j = 0; j < sero; j++) {
                        if ((i == j) || j == ((sero - 1) - i)){
                            System.out.print(" ");
                        }else{
                            System.out.print("*");
                        }
                    }
                    System.out.println(" ");
                }
            }
            // 만약 입력값이 4일 경우
            else if (userChoice == 4){
                System.out.println("프로그램을 종료 합니다.");
                break;
            }

        }

    }
}
