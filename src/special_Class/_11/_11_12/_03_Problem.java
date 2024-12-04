package special_Class._11._11_12;

public class _03_Problem {
    public static void main(String[] args) {

//        M = 5   N = 5 입력시
//
//         0 1 2 3 4 --- N ( j )
//                   N M
//      0   0 1 1 1 0 -- 4 0
//      1   1 0 1 0 1 -- 3 1
//      2   1 1 0 1 1 -- 2 2
//      3   1 0 1 0 1 -- 1 3
//      4   0 1 1 1 0 -- 0 4
//
//      M ( i )

        int M = 5;
        int N = 5;

        while (true) {
            // M 과 N 입력
//         System.out.print("M 값을 입력하세요: ");
//         M = scan.nextInt();
//         System.out.print("N 값을 입력하세요: ");
//         N = scan.nextInt();
            // M 과 N이 양의 정수일 경우 break
            if (M > 0 && N > 0){
                break;
            }
            System.out.print("잘못된 입력값입니다. 양의 정수를 입력하세요.");
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j || j == (N-1)-i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}
