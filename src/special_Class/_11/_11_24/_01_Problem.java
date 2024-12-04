package special_Class._11._11_24;

public class _01_Problem {
    public static void main(String[] args) {

        char[][] bar = new char[4][];

        //         
        // bar[0] = b

        bar[0] = new char[4];
        bar[1] = new char[5];
        bar[2] = new char[3];
        bar[3] = new char[6];

        bar[0][0] = 'h';
        bar[0][1] = 'e';
        bar[0][2] = 'l';
        bar[0][3] = 'o';
        bar[1][0] = '공';
        bar[1][1] = 'n';
        bar[1][2] = 'a';
        bar[1][3] = 'm';
        bar[1][4] = 'e';
        bar[2][0] = '공';
        bar[2][1] = 'i';
        bar[2][2] = 's';
        bar[3][0] = 'H';
        bar[3][1] = 'y';
        bar[3][2] = 'u';
        bar[3][3] = 'k';
        bar[3][4] = 'i';
        bar[3][5] = 'l';

        // 4번 반복 == bar[4]
        for (int i = 0 ; i < bar.length ; i++) {
            // bar[0] 원소 갯수 = 4번 반복
            // bar[1] 원소 갯수 = 5번 반복
            // bar[2] 원소 갯수 = 3번 반복
            // bar[3] 원소 갯수 = 6번 반복
            for (int j = 0 ; j < bar[i].length ; j++){
                System.out.print(bar[i][j]);
            }
            System.out.println();
        }
        // char[] value 가 bar 변수를 순회하여 bar[i] 안에 있는 원소를 출력한다.
        for (char[] value : bar){
            System.out.println(value);
        }

    }
}
