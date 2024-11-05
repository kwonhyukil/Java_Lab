package Class.Flow_Control;

public class _02_Switch {
    public static void main(String[] args) {

        String myTeam = "samsung";

        switch (myTeam) {
            case "samsung":
                System.out.println("Samsung");
                break;
            case "LG":
                System.out.println("엘쥐 미안");
                break;
            default:
                System.out.println("이외 팀");
        }

        int bar = 1;
        switch (bar) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
        }

        String day = "토요일";
        switch (day) {
//            case "토요일":
//                System.out.println("주말");
//                break;
//            case "일요일":
//                System.out.println("주말");
//                break;
            // 중복 시 아래와 같이 나타낼 수도 있다
            case "토요일":
            case "일요일":
                System.out.println("주말");
                break;
//            case "월요일": case "화요일": case "수요일": case "목요일": case "금요일":
            default:
                System.out.println("평일");
        } // 블레이스가 없을 경우 어디까지가 해당하는지 알 수 없기 때문에 블레이스가 필요하다.
                System.out.println("프로그램 종료");
    }
}
